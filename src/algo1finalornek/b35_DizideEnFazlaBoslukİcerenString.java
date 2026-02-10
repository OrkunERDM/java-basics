package algo1finalornek;

public class b35_DizideEnFazlaBoslukİcerenString {

	public static void main(String[] args) {

		String[]a= {"asd asd","laksjd kasdj asdl"};
		
		System.out.println(enFazlaBosluk(a));
		
		
		
	}
	
	public static String enFazlaBosluk(String[]dizi) {
		
		String max="";
		int maxBosluk=0;
		
		for(int i=0; i<dizi.length; i++) {
			
			int sayac=0;
			for(int j=0; j<dizi[i].length(); j++) {
				
				if(dizi[i].charAt(j)==' ') {
					
					sayac++;
					
				}
				
				
			}if(sayac>maxBosluk) {
				
				maxBosluk=sayac;
				max=dizi[i];
				
			}
			
			
		}return max;
		
		
		
		
	}
	
	

}
