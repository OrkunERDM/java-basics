package algo1finalornek;

import java.util.Scanner;

public class a2_AsalSayiBulma {

	public static void main(String[] args) {

		
		
		System.out.println("ASAL SAYI BULMA UYGULAMASINA HOŞ GELDİNİZ");
		
		System.out.println("*******************************");
		
		Scanner scan=new Scanner(System.in);
		
		int asaltoplam=0;
		int asalolmayantoplam=0;
		
	String asalolanlar="";
	String asalolmayanlar="";
	boolean asalmi=false;
		
		System.out.print("dizi kaç elemanlı: ");
		int dizieleman=scan.nextInt();
		
		int[]sayilar= new int[dizieleman];
		
		for(int i=0; i<sayilar.length; i++) {
			
			System.out.print("dizinin "+i+". index değerini giriniz: ");
			sayilar[i] =scan.nextInt();
			scan.nextLine();
			
		}
		
		for(int sayi: sayilar) {
			
			for(int j=2; j<sayi; j++) {
				
				if(sayi%j==0) {
					
					asalolmayantoplam+=1;
					asalolmayanlar=String.valueOf(sayi)+" ";
					break;
				}else {
					asalmi=true;
				}
				
			}
			if(asalmi) {
				
				asaltoplam+=1;
				asalolanlar+=String.valueOf(sayi)+" ";
				asalmi=false;
			}
			
		}
		System.out.println("asal olanların sayısı: "+asaltoplam +" asal sayilar: "+asalolanlar);
		System.out.println("***************************");
		System.out.println("asal olmayanların sayısı: "+asalolmayantoplam+" asal olmayanlar: "+asalolmayanlar);
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
