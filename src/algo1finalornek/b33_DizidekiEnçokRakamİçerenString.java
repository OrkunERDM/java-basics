package algo1finalornek;

public class b33_DizidekiEnçokRakamİçerenString {

	public static void main(String[] args) {

        String[]a= {"1ac","Ak78","478adkf"};
        
        System.out.println(EncoKrakam(a));
		
		
	}
	
	public static String EncoKrakam(String[]dizi) {
		
		int maxSayac=0;
        String max="";
        
        
        for(int i=0; i<dizi.length; i++) {
        	
        	int sayac=0;
        	
        	for(int j=0; j<dizi[i].length(); j++) {
        		
        		if(Character.isDigit(dizi[i].charAt(j))) {
        			
        			sayac++;
        			
        		}
        		
        		
        	}if(sayac>maxSayac) {
        		
        		maxSayac=sayac;
        		max=dizi[i];
        		
        	}
        	
        	
        	
        }return max;
		
		
		
	}
	
	
	

}
