package algo1finalornek;

import java.security.PublicKey;

public class b10_AsalSayiAdediDonduren {

	public static void main(String[] args) {

		int[]a= {8,2,3,4,5};
		System.out.println(AsalAdet(a));
		
	}
	
	
	public static boolean Asalmi(int n) {
		
		
		
		for(int i=2; i<=n/2; i++) {
			
			if(n%i==0) {
				
				return false;
			}
			
			
		}
		return true;
	}
		
	public static int AsalAdet(int[]dizi) {
		
		int sayac=0;
		for(int i=0; i<dizi.length; i++) {
			
			if(Asalmi(dizi[i])) {
				
				sayac++;
				
			}
			
		
		
		
	}
		return sayac;
	
	
	
	}
	
	
	
	
	
	
	

}
