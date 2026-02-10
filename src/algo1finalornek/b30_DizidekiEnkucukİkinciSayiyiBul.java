package algo1finalornek;

public class b30_DizidekiEnkucukİkinciSayiyiBul {

	public static void main(String[] args) {

	int[]a= {1,2,3,4};
	System.out.println(Enkucukİkinci(a));
		
		
		
	}
	
	public static int Enkucukİkinci(int[]dizi) {
		
		int min=Integer.MAX_VALUE,ikinci=Integer.MAX_VALUE;
		
		for(int i=1; i<dizi.length-1; i++) {
			
			if(dizi[i]<min) {
				
				ikinci=min;
				min=dizi[i];
				
			}else if(dizi[i]<ikinci&&dizi[i]!=min) {
				
				ikinci=dizi[i];
				
				
			}
			
			
		}return ikinci;
		
		
		
	}
	
	
	

}
