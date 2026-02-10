package algo1finalornek;

public class b31_NegatifiYazdirma {

	public static void main(String[] args) {

		int[]a= {1,5,7,6};
		System.out.println(negatif(a));
		
		
	}
	
	public static boolean negatif(int[]dizi) {
		
		
		for(int i=0; i<dizi.length; i++) {
			
			if(dizi[i]<0) {
				
				return true;
				
				
			}
			
			
		}return false;
		
		
		
	}
	
	

}
