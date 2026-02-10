package algo1finalornek;

import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

public class a3_tekmiciftmidöndüren {
	
	public static void main(StringSelection[]args) {
		System.out.println("tek mi çift mi uygulamasına hos geldiniz..");
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("dizi kaç elemanlı: ");
		int eleman=scan.nextInt();
		//scan.next();
		
		int[]sayilar=new int[eleman];
		
		for(int i=0; i<sayilar.length; i++) {
			
			System.out.print("dizinin "+i+". index değerini gir: ");
			sayilar[i]=scan.nextInt();
			//scan.nextInt();
			
		}
		for(int deger: sayilar) {
			
			ciftmitekmi(deger);
			
		}	
		
	}
		public static void ciftmitekmi(int sayi) {
			
			if(sayi%2==0) {
				
				System.out.println(sayi+" çifttir.");
				
			}else {
				System.out.println(sayi+" tektir.");
			}
			
				
		
	}

}
