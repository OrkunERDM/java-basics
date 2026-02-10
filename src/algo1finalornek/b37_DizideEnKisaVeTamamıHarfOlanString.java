package algo1finalornek;

public class b37_DizideEnKisaVeTamamıHarfOlanString {

	public static void main(String[] args) {

		
		String[]a= {"aksd5","skdjfs","sdlkflsf","skldjfldsjf8"};
		
		System.out.println(RakamyokTamamiHarf(a));
		
	}
	
	
	public static String RakamyokTamamiHarf(String[]dizi) {
		
		
		String min="";
		
		for(int i=0; i<dizi.length; i++) {
			
			boolean harfYok=true;
			for(int j=0; j<dizi[i].length(); j++) {
				
				if(!Character.isLetter(dizi[i].charAt(j))) {
					
					harfYok=false;
					break;
				}
				
				
			}if(harfYok&&min.equals("")||dizi[i].length()<min.length()) {
				
				min=dizi[i];
				
			}
			
			
			
		}return min;
		
		
		
		
		
	}
	
	
	

}
