package algo1finalornek;

public class a8_DizininSimetrikOlupOlmadıgınıBul {

	public static void main(String[] args) {

		int[]a= {1,2,2,1};
        System.out.println(simetrik(a));
		
		
	}
	
	public static boolean simetrik(int[] dizi) {
		
		
		for(int i=0; i<dizi.length/2; i++) {
			
			if(dizi[i]!=dizi[dizi.length-1-i]) {
		
			return false;
			}
			
		}
		return true;
		
		
		
			
			
		}
		
		
		
		
	}
	
	


