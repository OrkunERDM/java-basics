package algo1finalornek;

public class b13_DizidekiEnYakinİkiSayiFarki {

	public static void main(String[] args) {

		
		int[] a = {8, 3, 10};
        System.out.println(EnYakinSayiFarki(a));
		
		
	}
	
	
	public static int EnYakinSayiFarki(int[] dizi) {
		
		
		 int min = Math.abs(dizi[0] - dizi[1]);

	        for (int i = 0; i < dizi.length; i++) {
	            for (int j = i + 1; j < dizi.length; j++) {
	                int fark = Math.abs(dizi[i] - dizi[j]);
	                if (fark < min) min = fark;
	            }
	        }
	        return min;
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
