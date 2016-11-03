package bloomfilter;

public class bloomfilter {
        
	
	BitArray bits=new BitArray();
	public void adddjb2(String str){

	 for(int i=0;i<8;i++){
		 bits.set(hashing.djb2(str,i), true);
	 }
	}
	public void addsdbm(String str){
	 
		for(int i=0;i<8;i++){
			 bits.set(hashing.sdbm(str,i), true);
		 }
	  
		}
	
	public void addlose(String str){
		
			for(int i=0;i<8;i++){
				 bits.set(hashing.lose(str,i), true);
			 }
		  
			}
		
	
	
	public boolean checkdjb2(String str){
	//  if(bits.get(hashing.djb2h1(str))==false)
	//	  return false;
		for(int i=0;i<8;i++){
			if(bits.get(hashing.djb2(str,i))==false) 
				return false;
		}
	
	  return true;
	}
	
	public boolean checksdbm(String str){
	
		for(int i=0;i<8;i++){
			if(bits.get(hashing.sdbm(str,i))==false) 
				return false;
		}
	
	  return true;
	}
	
	public boolean checklose(String str){
		
		for(int i=0;i<8;i++){
			if(bits.get(hashing.lose(str,i))==false) 
				return false;
		}
	
	  return true;
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	
		
	

	}

}
