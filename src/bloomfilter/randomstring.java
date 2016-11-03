package bloomfilter;

public class randomstring {
	public static final int length=10;
	
	
	public static String construct(){
	StringBuilder strbd= new StringBuilder(10);
	for(int i=0;i<length;i++){
		int ran=97+(int)(Math.random()*27);//use 27 because string.txt contains "{"(123). 
		
		strbd.append((char)ran);
	}
	//String str=strbd.substring(0,10);
	String str=strbd.toString();
	return str;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println(randomstring.construct());

	}

}
