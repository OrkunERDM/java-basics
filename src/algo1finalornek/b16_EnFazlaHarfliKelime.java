package algo1finalornek;

public class b16_EnFazlaHarfliKelime {

	public static void main(String[] args) {

	String[]a= {"ali","veli","çınar"};
	System.out.println(enUzun(a));
	
	}
	
	
	public static String enUzun(String[]dizi) {
		
		String max=dizi[0];
		
		for(String s:dizi) {
			
			if(s.length()>max.length()) {
				
				max=s;
				
			}
			
			
			
			
		}
		return max;
			
		
	}
	
	
}
