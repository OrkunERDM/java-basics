package algo1finalornek;

public class b25_DizidekiTekSayilarıYeniDiziOlarakDondur {

	public static void main(String[] args) {

		int[]a= {1,2,3,4,5};
		
		int[]tekler=teksayilar(a);
		
		for(int i=0; i<tekler.length; i++) {
			
			
			System.out.print(tekler[i]+" ");
		}
		
		
	}
	
	public static int[]teksayilar(int[]dizi){
		
		int sayac=0;
		
		for(int i=0; i<dizi.length; i++) {
			
			if(dizi[i]%2!=0) {
				
				sayac++;
				
			}
			
			
		}
		
		int[]yeni=new int[sayac];
		
		int index=0;
		
		for(int i=0; i<dizi.length; i++) {
			
			if(dizi[i]%2!=0) {
			yeni[index++]=dizi[i];
			
			}
			
		}
		
		
		return yeni;
		
	}
	
	

}
