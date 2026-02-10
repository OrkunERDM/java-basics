package algo1finalornek;

import java.util.Scanner;

public class a1_KullanıcıdanDegerAlma {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

	       System.out.println("dizi uzunluk gir: ");
		   int uzunluk=scanner.nextInt();
		   
		   scanner.nextLine();
		   
		   String[] diziUzunluk=new String[uzunluk];
		   
		   for(int i=0; i<diziUzunluk.length; i++) {
			   
			   System.out.println("dizinin"+i+". indexini gir: ");
			   diziUzunluk[i]=scanner.nextLine();
			   
			   
			   
		   }
		   System.out.println("********dizinin elemanları*********");
		   for(int i=0; i<diziUzunluk.length; i++) {
			   
			  
			   System.out.println(diziUzunluk[i]);
			   
		   }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
