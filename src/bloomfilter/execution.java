package bloomfilter;
import java.io.*;

public class execution {
	
	public int input[]={100, 500, 1000, 5000, 10000, 50000, 100000, 500000};
	public int totalp[]=new int[8];
	public int realp[]=new int[8];
	public String inputstring[]={"100","500","1000","5000","10000","50000","100000","500000",};
  
	
	void calculate(){ 
		readfile rf=new readfile();
		rf.readdata();
	
		for(int j=0;j<8;j++){    //go through the input size 
			
			bloomfilter bf=new bloomfilter();
			
		//for each j, generate input string and add to bloom filter;	
		String inputstring[]=new String[input[j]];
		for(int i=0;i<input[j];i++){
				inputstring[i]=randomstring.construct();
				bf.adddjb2(inputstring[i]);
				}
					
	
	
		long totalpositive=0;
		
		for(int i=0;i<1000000;i++){
			if(bf.checkdjb2(rf.teststring[i])==true){
				totalpositive++;
				
			}
			totalp[j]=(int)totalpositive;
		}
		
		
		
		long realpositive=0;
		for(int i=0;i<input[j];i++){
			for(int k=0;k<10000;k++){
				if(inputstring[i].equals(rf.teststring[k])) {realpositive ++;}
			}
		  realp[j]=(int)realpositive;
		}	
		
	}
	
	}
	

	
	void calsdbm() {
		readfile rf=new readfile();
		rf.readdata();
	
		for(int j=0;j<8;j++){    //go through the input size 
			
			bloomfilter bf=new bloomfilter();
			
		//for each j, generate input string and add to bloom filter;	
		String inputstring[]=new String[input[j]];
		for(int i=0;i<input[j];i++){
				inputstring[i]=randomstring.construct();
				bf.addsdbm(inputstring[i]);
				}
					
	
	
		long totalpositive=0;
		
		for(int i=0;i<1000000;i++){
			if(bf.checkdjb2(rf.teststring[i])==true){
				totalpositive++;
				
			}
			totalp[j]=(int)totalpositive;
		}
		
		
		
		long realpositive=0;
		for(int i=0;i<input[j];i++){
			for(int k=0;k<10000;k++){
				if(inputstring[i].equals(rf.teststring[k])) {realpositive ++;}
			}
		  realp[j]=(int)realpositive;
		}	
		
	}
		
	}
	
	void callose(){
		readfile rf=new readfile();
		rf.readdata();
	
		for(int j=0;j<8;j++){    //go through the input size 
			
			bloomfilter bf=new bloomfilter();
			
		//for each j, generate input string and add to bloom filter;	
		String inputstring[]=new String[input[j]];
		for(int i=0;i<input[j];i++){
				inputstring[i]=randomstring.construct();
				bf.addlose(inputstring[i]);
				}
					
	
	
		long totalpositive=0;
		
		for(int i=0;i<1000000;i++){
			if(bf.checkdjb2(rf.teststring[i])==true){
				totalpositive++;
				
			}
			totalp[j]=(int)totalpositive;
		}
		
		
		
		long realpositive=0;
		for(int i=0;i<input[j];i++){
			for(int k=0;k<10000;k++){
				if(inputstring[i].equals(rf.teststring[k])) {realpositive ++;}
			}
		  realp[j]=(int)realpositive;
		}	
		
	}
		
		
	}
	
	public static void main(String[] args) {
		
		
		execution exe=new execution();
		exe.callose();
		for(int i=0;i<8;i++){
			System.out.println(exe.totalp[i]);
		}
		for(int i=0;i<8;i++){
			System.out.println(exe.realp[i]);
		}
		
		
		
	}

}
