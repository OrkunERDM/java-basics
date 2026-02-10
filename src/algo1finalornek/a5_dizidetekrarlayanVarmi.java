package algo1finalornek;

public class a5_dizidetekrarlayanVarmi {

	
	public static void main(String[] args) {

		int[]a= {1,2,3,4,5,6};
		System.out.println(tekrarvarmi(a));
		
    	  
      }
		
	
	public static boolean tekrarvarmi(int[]dizi) {
		
		for(int i=0; i<dizi.length; i++) {
			
			for(int j=i+1; j<dizi.length; j++) {
				
		     if(dizi[i]==dizi[j]) {
		    	 
		    	 return true;
		    	 
		     }
			
			}
			
			
		}
		return false;
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
