package algo1finalornek;

public class a4_DizininTerisniYeniDiziİleYazdirma {
	public static void main(String[] args) {
		 
		int[]a= {1,2,3,4,5};
		int[]t=tersdizi(a);
		
		for(int i=0; i<t.length; i++) {
			
			System.out.print(t[i]+ " ");
			
		}
		
		}	


	      public static int[] tersdizi(int[]dizi) {
	    	  
	    	  int[] ters=new int[dizi.length];
	    	  
	    	  for(int i=0; i<dizi.length; i++) {
	    		  
	    		  ters[i]=dizi[dizi.length-1-i];
	    		  
	    		  
	    	  }
	    	  return ters;
	    	  
	    	   
	      }
	
	
	
	
	
	
	
	
}
