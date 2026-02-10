package algo1finalornek;

public class b32_EncokSesliStringKelimesiniBul {

	public static void main(String[] args) {

		String[]a= {"ali","mehmet","kalemlik"};
		System.out.println(enCokSesli(a));
		
		 
      }
		
	 public static String enCokSesli(String[]dizi) {
		 
		 
		 int maxSayac=0;
		 String max="";
		 
		 for(int i=0; i<dizi.length; i++) {
			 
			 int sayac=0;
			 for(int j=0; j<dizi[i].length(); j++) {
				 
				 char c=dizi[i].charAt(j);
				 
				if("aeıioöuü".indexOf(c)!=-1) {
					
					sayac++;
					
					
				}
				
				 
				 
			 }if(sayac>maxSayac) {
				 
				 maxSayac=sayac;
				 max=dizi[i];
				 
				 
			 }
			 
			 
			 
		 }return max;
		 
		 
		 
		 
	 }
	
		

}
