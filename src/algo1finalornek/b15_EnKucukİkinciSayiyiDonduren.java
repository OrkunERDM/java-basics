package algo1finalornek;

public class b15_EnKucukİkinciSayiyiDonduren {

	public static void main(String[] args) {

	int[]a= {1,2,3,4};
	System.out.println(ikincienkucuk(a));
	
	
	}
	
	
	public static int ikincienkucuk(int[]dizi) {
		
		int min=Integer.MAX_VALUE,ikinci=Integer.MAX_VALUE;
		
		
		for(int x: dizi) {
			
			if(x<min) {
				
				ikinci=min;
				min=x;
				
			}if(x<ikinci&&x!=min) {
				
				ikinci=x;
				
			}
		}return ikinci;
			
		}
		
		
		
	

}
