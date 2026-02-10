package algo1finalornek;

public class b14_DizidekiMaxTekrarEdenSayi {
	public static void main(String[] args) {

		int[]a= {1,4,4,4,2};
		System.out.println(encok(a));
		
		
      }
		
	
	public static int encok(int[]dizi) {
		
		int maxadet=0,maxsayi=0;
		
		
		for(int i=0; i<dizi.length; i++) {
			int adet=0;
			for(int j=0; j<dizi.length; j++) {
				
				if(dizi[i]==dizi[j]) {
					
					adet++;
				}if(adet>maxadet) {
					
					maxadet=adet;
					maxsayi=dizi[i];
				}
				
				
			}
			
			
		}
		return maxsayi;
		
		
		
		
	}

}




