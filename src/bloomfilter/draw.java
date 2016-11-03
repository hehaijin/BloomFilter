package bloomfilter;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;


public class draw extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			primaryStage.setTitle("Bloom Filter Demo for CS564 by Haijin He");
		//	BorderPane root = new BorderPane();
			primaryStage.setResizable(false);
			Parent root=FXMLLoader.load(this.getClass().getResource("drawchart.fxml"));
			Scene scene = new Scene(root,800,600);
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
