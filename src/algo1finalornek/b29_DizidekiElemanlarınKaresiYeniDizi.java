package algo1finalornek;

public class b29_DizidekiElemanlarınKaresiYeniDizi {

	public static void main(String[] args) {

		int[]a= {1,2,3,4,5};
		int[] sonuc=kareleri(a);
		
		for(int i=0; i<sonuc.length; i++) {
			
			System.out.print(sonuc[i]+" ");
			
		}
	
	}
	    public static int[]kareleri(int[]dizi){
		
		int[]yeni=new int[dizi.length];
		
		
		for(int i=0; i<yeni.length; i++) {
			
			yeni[i]=dizi[i]*dizi[i];
			
			
			
		}return yeni;
		
		
		
	}
	
	

}
