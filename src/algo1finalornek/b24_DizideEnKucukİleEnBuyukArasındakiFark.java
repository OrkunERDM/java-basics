package algo1finalornek;


public class b24_DizideEnKucukİleEnBuyukArasındakiFark {

	public static void main(String[] args) {

		int[]a= {1,2,3,4,5};
		System.out.println(EnKucukEnBuyukFark(a));
		
		
	}

	
	public static int EnKucukEnBuyukFark(int[]dizi) {
		
		int min=dizi[0];
		int max=dizi[0];
		
		for(int i=0; i<dizi.length; i++) {
			
			if(dizi[i]<min) {
				
				min=dizi[i];
				
			}if(dizi[i]>max) {
				
				max=dizi[i];
				
			}
			
			
		}
		
		int sonuc=Math.abs(max-min);
		
		return sonuc;
		
		
		
	}
	
	
	
	
	
}
