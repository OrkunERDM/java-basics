package algo1finalornek;

public class b38_HocaOdevSorusu {

	public static void main(String[] args) {
      
		int[]a= {4,2,4,3,2,2,3,4};
		System.out.println(enCokKullanilanSayi(a));
		
		
	}
	
	
	public static int enCokKullanilanSayi(int[]dizi) {
		
		int maxSayac=0;
		int encoksayi=dizi[0];
		
		for(int i=0; i<dizi.length; i++) {
			
			int sayac=0;
			for(int j=i+1; j<dizi.length; j++) {
				
				if(dizi[i]==dizi[j]) {
					
					
					sayac++;
				}
				
				
			}if(sayac>maxSayac) {
				
				maxSayac=sayac;
				encoksayi=dizi[i];
				
			
				
			} else if (sayac == maxSayac && dizi[i] < encoksayi) {
	            encoksayi= dizi[i];
	        }
			
		}return encoksayi;
		
		
		
		
		
		
		
	}
	
	
	

}
