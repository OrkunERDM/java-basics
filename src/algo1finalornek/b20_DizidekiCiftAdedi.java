package algo1finalornek;

public class b20_DizidekiCiftAdedi {

	public static void main(String[] args) {

	int[]a= {1,2,3,4,5};
	int sonuc=ciftadet(a);
	System.out.println(sonuc);
		
		
		
	}
	
	
	public static int ciftadet(int[]dizi) {
		
		
		int adet=0;
		
		for(int i=0; i<dizi.length; i++) {
			
			if(dizi[i]%2==0) {
				
				adet++;
				
			}
			
			
		}return adet;
		
		
		
		
	}
	
	
	

}
