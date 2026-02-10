package algo1finalornek;

public class b40_MatrisEnKucuk {

	public static void main(String[] args) {
		  int[][] dizi = {
		            {4, 7, 1, 9},
		            {6, 3, 8, 5},
		            {2, 10, 11, 0},
		            {12, 14, 13, 15}
		        };

		        int[] sonuc = enKucukBul(dizi);
		        System.out.println("En küçük eleman: " + sonuc[0]);
		        System.out.println("Satır indisi: " + sonuc[1]);
		        System.out.println("Sütun indisi: " + sonuc[2]);
		
		
	}
	
	 public static int[] enKucukBul(int[][] matris) {
	        int min = matris[0][0];
	        int satir = 0, sutun = 0;

	        for(int i = 0; i < matris.length; i++) {
	            for(int j = 0; j < matris[i].length; j++) {
	                if(matris[i][j] < min) {
	                    min = matris[i][j];
	                    satir = i;
	                    sutun = j;
	                }
	            }
	        }
	        return new int[]{min, satir, sutun};
	    }
		
	

		
		
		
		
		
	
	
	
	
	
	
		
	
	

	
	

	
	
}
