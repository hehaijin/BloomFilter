package bloomfilter;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

public class drawController implements Initializable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	@FXML
	private Label run;
	
	execution exe=new execution();

	public void calculate(ActionEvent event){
		run.setText("djb2 hashing");
		exe.calculate();
		
	}
	public void calsdbm(ActionEvent event){
		run.setText("sdbm hashing");
		exe.calsdbm();
		
	}public void callose(ActionEvent event){
		run.setText("loselose hashing");
		exe.callose();
		
	}


	@FXML 
	LineChart<String,Number> linechart;
	
	public void draw(ActionEvent event){
		
		XYChart.Series<String, Number> series=new XYChart.Series<String,Number>();
	    for(int i=0;i<8;i++){
	    	series.getData().add(new XYChart.Data<String,Number>(exe.inputstring[i],exe.totalp[i]-exe.realp[i]));
	  }
		
	  
	  
		linechart.getData().add(series); 
		
	}
	
	public void clear(ActionEvent event){
		linechart.getData().clear();		
	}
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
