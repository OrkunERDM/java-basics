package algo1finalornek;

public class b22_DizideTekrarEdenVarmi {

	public static void main(String[] args) {

		int[]a= {1,2,3,3,4,5};
		System.out.println(TekrarVarmi(a));
		
		
	}
	
	
	public static boolean TekrarVarmi(int[]dizi) {
		
		
		for(int i=0; i<dizi.length; i++) {
		for(int j=i+1; j<dizi.length; j++) {
			
			
			
		
			if(dizi[i]==dizi[j]) {
			
				return true;
				
			}
			
		}	
		}return false;
		
		
		
		
	}
	
	

}
