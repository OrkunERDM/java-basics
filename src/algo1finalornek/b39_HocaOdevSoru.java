package algo1finalornek;

public class b39_HocaOdevSoru {
	
	public static void main(String[] args) {
		
		int[]a= {4, 6, 8, 9, 10, 15, 7, 12};
		System.out.println(Asallik(a, 3));
		
		
		
		
	}
	
	public static int Asallik(int[]dizi,int index) {
		
		
		for(int i=0; i<dizi.length; i++) {
			
			int sayi=dizi[i];
			
			boolean asalMi=true;
			
			if(sayi<2) {
				
				asalMi=false;
			}
			for(int j=2; j<dizi.length/2; j++) {
				
				if(sayi%j==0) {
					
					asalMi=false;
					break;
				}
				
				
			}if(asalMi) {
				
				return dizi[i];
				
				
			}
			
			
			
			
		}return -1;
		
		
		
		
		
		
		
		
	}
		
	
	
	

}
