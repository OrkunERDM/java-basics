package algo1finalornek;

public class b11_DiziSiraliMi {

	public static void main(String[] args) {

		int[]a= {1,4,5,6};
		System.out.println(SiraliMi(a));
		
	}
	
	
	public static boolean SiraliMi(int[] dizi) {
		
		for(int i=1; i<dizi.length; i++) {
			
			if(dizi[i]<dizi[i-1]) {
				
				return false;
			}
			
		}return true;
		
		
		
		
		
	}
	
	
	
	
	

}
