package algo1finalornek;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class b34_DizideEnAzSesliHarfİçerenString {

	public static void main(String[] args) {

		String[]a= {"asdhad","sjsoıfeul","lasjdıoa"};
		System.out.println(EnazSesli(a));
		
		
		
	}
	
	public static String EnazSesli(String[]dizi) {
		
		String min="";
		int minSayac=Integer.MAX_VALUE;
		
         for(int i=0; i<dizi.length; i++) {
        	 
        	 int sayac=0;
        	 
        	 for(int j=0; j<dizi[i].length(); j++) {
        		 
        		 char c=dizi[i].charAt(j);
        		 if("aeıioöuü".indexOf(c)!=-1) {
        			 
        			 sayac++;
        			 
        			 
        		 }
        		 
        		 
        	 }if(sayac<minSayac) {
        		
        		 minSayac=sayac;
        		 min=dizi[i];
        				 
        		 
        	 }
        	 
        	 
         }return min;
		
		
		
	}
	

}
