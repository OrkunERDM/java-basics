package algo1finalornek;

public class b19_UcKarakterliOlanlar {

	public static void main(String[] args) {

		String[]a= {"ali","can","mehmet"};
		uckarakterliler(a);
		
		
		
	}
	
	
	public static void uckarakterliler(String[]dizi) {
		
		for(String x:dizi) {
			
			if(x.length()==3) {
				
				System.out.println(x);
				
			}
			
			
		}
		
		
		
	}

}
