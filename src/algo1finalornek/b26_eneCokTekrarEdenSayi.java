package algo1finalornek;

public class b26_eneCokTekrarEdenSayi {

	public static void main(String[] args) {

		int[]a= {1,2,3,4,5,4};
		System.out.println(EnCoktekrar(a));
			
	}
	public static int EnCoktekrar(int[]dizi) {
		
		int maxAdet=0,maxsayi=dizi[0];
		
		for(int i=0; i<dizi.length; i++) {
			
			int adet=0;
			for(int j=i+1; j<dizi.length; j++) {
				
				if(dizi[i]==dizi[j]) {
					
					adet++;
					
				}if(adet>maxAdet) {
					
					maxAdet=adet;
					maxsayi=dizi[i];
					
				}
			
			}
			
		}return maxsayi;
		
		
	}
	
}
