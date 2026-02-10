package algo1finalornek;

public class b12_DiziyiSagaKaydirma {

	public static void main(String[] args) {

		int[]a= {1,2,3,4};
		int[]b=SagaKaydir(a);
		
		for(int i=0; i<b.length; i++) {
			
			System.out.print(b[i]+" ");
			
		}
		
	
	}
	
	
	public static int[]SagaKaydir(int[]dizi){
		
     int[]yeni=new int[dizi.length];		
	 
     yeni[0]=dizi[dizi.length-1];
     
     for(int i=1; i<dizi.length; i++) {
    	 
    	 yeni[i]=dizi[i-1];
    	 
     }
     
     return yeni;
     
	}
	
	
	
	
	

}
