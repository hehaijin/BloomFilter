package bloomfilter;


import java.io.IOException;
import java.io.InputStream;

public class readfile {
	public String teststring[]=new String[1000000];
	
	void readdata(){
	//	FileInputStream fin;
		InputStream fin;
		//fin=new FileInputStream("C:/strings.txt");
		 fin=this.getClass().getResourceAsStream("strings.txt");
			try{
		    for(int i=0;i<1000000;i++){
		    	StringBuilder sb=new StringBuilder(12);
		    	char ch;
		    	do{
		    	  ch=(char) fin.read();
		    	  sb.append(ch);
		    	  
		    	}while(ch!='\n');
				
				teststring[i]=sb.substring(0,10);			
				
			}
			}catch(IOException exc){
				System.out.println("IOException");
			}
		    
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readfile rf=new readfile();
		rf.readdata();
		System.out.println(rf.teststring[10000]);

	}

}
