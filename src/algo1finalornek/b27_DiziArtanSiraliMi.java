package algo1finalornek;

public class b27_DiziArtanSiraliMi {

	public static void main(String[] args) {

		int[]a= {1,2,3,4};
		System.out.println(ArtanSiraliMi(a));
		
		
		
	}
	
	public static boolean ArtanSiraliMi(int[]dizi) {
		
		for(int i=0; i<dizi.length-1; i++) {
		
				if(dizi[i]>dizi[i+1]) {
					
					return false;
					
				}
				
		 
		}return true;
		
		
		
		
	}
	
	
	
	

}
