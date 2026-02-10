package algo1finalornek;

import java.util.Scanner;

public class b17_KlavyedenGirilenSayininEnBuyukHanesi {

	public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);
	//System.out.println("bir sayı gir: ");
	int[] sayi= {scan.nextInt()};
	System.out.println(enBuyuk(sayi));
	
	
		
	}
	
	public static int enBuyuk(int[]dizi) {
		
		int max=0;
		
		for(int x:dizi) {
			
			while(x>0) {
				
				int b=x%10;
				
				if(b>max) {
					
					max=b;
					
					
				}
				
				x/=10;
				
			}
			
			
		}return max;
		
		
		
		
	}
	
	
	

}
