package algo1finalornek;

public class b12_EnUzunArtan {

	public static void main(String[] args) {

		int[]a= {1,2,3,4,5,6,7,8,18};
		System.out.println(EnUzunArtan(a));
		
		
	}
	
	public static int EnUzunArtan(int[]dizi) {
		
		int sayac=1,max=1;
		
		for(int i=1; i<dizi.length; i++) {
			
			if(dizi[i]>dizi[i-1]) {
				
				sayac++;
			}if(sayac>max) {
				
				max=sayac;
				
			}else {
				sayac=1;
			}
			
			
		}
		return max;
		
		
	}
	
	
	
	

}
