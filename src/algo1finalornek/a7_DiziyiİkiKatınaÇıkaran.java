package algo1finalornek;

public class a7_DiziyiİkiKatınaÇıkaran {

	public static void main(String[] args) {

		int[]a= {1,2,3,4,5};
		int[]b=ikikati(a);
		
		for(int i=0; i<b.length; i++) {
			
			System.out.print(b[i]+" ");
			
		}

		
	}

	
	
	
	public static int[] ikikati(int[]dizi){
		
		int[]yeni=new int[dizi.length];
		
		for(int i=0; i<dizi.length; i++) {
			
			yeni[i]=dizi[i]*2;
			
		}
		
		return yeni;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
