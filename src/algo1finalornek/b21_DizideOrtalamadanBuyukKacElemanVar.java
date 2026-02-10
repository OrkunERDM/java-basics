package algo1finalornek;

public class b21_DizideOrtalamadanBuyukKacElemanVar {

	public static void main(String[] args) {

		int[]a= {1,2,3,4,5,6,7};
		
		int sonuc=orttanBuyukAdet(a);
		System.out.println(sonuc);
		
		
		
	}
	
	public static int orttanBuyukAdet(int[]dizi) {
		
		int toplam=0;
		int ortalama=0;
		
		
		for(int i=0; i<dizi.length; i++) {
			
			toplam+=dizi[i];
			
		}
		 ortalama= toplam/dizi.length;
		 int sayac=0;
		for(int i=0; i<dizi.length; i++) {
			
			if(dizi[i]>ortalama) {
				sayac++;
				
			}
			
			
		}return sayac;
		
		
		
	}
	
	

}
