package bloomfilter;

public class hashing {
	public static int m=10000;
	public static int djb2(String str, int integer){
		if((str.length()>10) | (str.length()<10))
		{
			System.out.println("Wrong length of input string!\n");
			return -1;
		}
		if(integer>7 | integer<0){
			System.out.println("hashing function does not exist!");
		    return -1;
		}
		int start[]={5381,5381,5381,5381,5381,5381,6473,1471};
		int m1[]={5,4,6,7,5,5,5,5};
	    int m2[]={1,-1,1,-1,1,1,1,1};
	    long hash=start[integer];
	    for(int i=0;i<10;i++){   
	    	 hash= (hash<<m1[integer]) + m2[integer]*hash +(long)str.charAt(i);    
	     }
	    return (int)Math.abs(hash%m);
	    
		}
		
	  public static int sdbm(String str, int integer){
			if((str.length()>10) | (str.length()<10))
			{
				System.out.println("Wrong length of input string!\n");
				return -1;
			}
			if(integer>7 | integer<0){
				System.out.println("hashing function does not exist!");
			    return -1;
			}
		int start[]={0,0,0,0,0,0,0,0};
		int m1[]={6,7,8,4,5,3,2,1};
		int m2[]={16,15,17,19,18,13,12,11};
		long hash=start[integer];
		for(int i=0;i<10;i++){   
		   hash= (hash<<m1[integer]) + (hash<<m2[integer])-hash +(long)str.charAt(i);    
		     }
		   return (int)Math.abs(hash%m);
		    
		
	  }
	  public static int lose(String str, int integer){
			if((str.length()>10) | (str.length()<10))
			{
				System.out.println("Wrong length of input string!\n");
				return -1;
			}
			if(integer>7 | integer<0){
				System.out.println("hashing function does not exist!");
			    return -1;
			}
		int start[]={0,5381,8179,5417,1319,8377,2617,4441};
		int m1[]={6,7,8,4,5,3,2,1};
		long hash=start[integer];
		for(int i=0;i<10;i++){   
		   hash= m1[integer]*hash +(long)str.charAt(i);    
		     }
		   return (int)Math.abs(hash%m);
		    
		
	  }
	
	
	
	
	
	
	
	public static void main(String args[])
	{
		String str="abcdefghij";
		
		for(int i=0;i<8;i++){
			System.out.println(djb2(str, i));
		}
		for(int i=0;i<8;i++){
			System.out.println(sdbm(str, i));
		}
		for(int i=0;i<8;i++){
			System.out.println(lose(str, i));
		}
	
				
	}
	

}
