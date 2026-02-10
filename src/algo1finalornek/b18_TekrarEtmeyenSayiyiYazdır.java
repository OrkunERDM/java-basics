package algo1finalornek;

public class b18_TekrarEtmeyenSayiyiYazdır {

	public static void main(String[] args) {

	int[]a= {1,1,2,2,3,3,4};
	tekSayi(a);
	
	
	}
	
	
	public static void tekSayi(int[]dizi) {
	
	for(int i=0; i<dizi.length; i++) {
		int sayac=0;
		for(int j=0; j<dizi.length; j++) {
			
			if(dizi[i]==dizi[j]) {
				
				sayac++;
				
			}
			
			
			
		}if(sayac==1) {
			
			System.out.println(dizi[i]);
			
		}
		
		
		
	}
	
	
	

}
	

}
