package bloomfilter;


public class BitArray {
     private boolean bt[]=new boolean[10000];
     void BitArray(){
    	 for(int i=0;i<10000;i++){
    		 bt[i]=false;
    	 }
     }
		
    void set(int bitIndex,boolean value){
    	bt[bitIndex]=value;
    }
    
    boolean get(int bitIndex){
    	return bt[bitIndex];
    }
    
    
	public static void main(String[] args) {
		
        BitArray ba=new BitArray();
        ba.set(100, true);
        System.out.println(ba.get(100));
	}

}
