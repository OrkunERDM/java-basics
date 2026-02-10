package algo1finalornek;

public class a6_pozitifleridöndüren {
	public static void main(String[] args) {
		 
		int[]a= {1,7,8,-9};
		int[]p=pozitifler(a);
		
		for(int i=0; i<p.length; i++) {
			
			System.out.println(p[i]);
		}
			
		}	
		
	      public static int[]pozitifler(int[]dizi){
	    	  
	    	  int sayac=0;
	    	  
	    	  for(int i=0; i<dizi.length; i++) {
	    		  
	    		  if(dizi[i]>0) {
	    			  
	    			  sayac++;
	    			  
	    		  }
	    		
	    	  }
	    	  
	         int[]yeni=new int[sayac];
	         int j=0;
	         
	         for(int i=0; i<dizi.length; i++) {
	        	 
	        	 if(dizi[i]>0) {
	        		 
	        		 yeni[j]=dizi[i];
	        		 j++;
	        	 }
	        	 
	        	 
	         }return yeni;
	    	  
	    	  
	    	  
	    	  
	    	  
	      }
			
			
	
	
	
	
}
