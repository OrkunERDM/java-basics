package algo1finalornek;

public class a9_EnCokTekrarEden {
	public static void main(String[] args) {

		int[]a= {1,2,3,4,5,5};
		System.out.println(encoktekrar(a));
    	  
      }
		
	public static int encoktekrar(int[]dizi) {
		
		
		int maxEleman = dizi[0];
        int maxSayac = 0;
        int sayac = 0;
        for (int i = 0; i < dizi.length; i++) {
            
            for (int j = 0; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) sayac++;
            }
            if (sayac > maxSayac) {
                maxSayac = sayac;
                maxEleman = dizi[i];
            }
        }
        return maxEleman;
        
	}

}
