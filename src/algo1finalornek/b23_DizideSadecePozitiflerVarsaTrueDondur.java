package algo1finalornek;

public class b23_DizideSadecePozitiflerVarsaTrueDondur {

	public static void main(String[] args) {

		int[]a= {1,2,3,4,5,-8};
		System.out.println(sadecepozitif(a));
		
	}
	public static boolean sadecepozitif(int[]dizi) {
		
		
		for(int i=0; i<dizi.length; i++) {
			
			if(dizi[i]<=0) {
				
				return false;
	
			}
				
		}return true;
		
	}
	
	

}
