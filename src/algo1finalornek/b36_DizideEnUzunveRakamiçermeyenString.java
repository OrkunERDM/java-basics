package algo1finalornek;

public class b36_DizideEnUzunveRakamiçermeyenString {

	 public static void main(String[] args) {
	        String[] dizi = {"abc1", "merhaba", "java123"};

	        System.out.println(enUzunRakamYok(dizi));
	    }

	    static String enUzunRakamYok(String[] d) {
	        String max = "";

	        for (int i = 0; i < d.length; i++) {
	            boolean rakamVar = true;
	            for (int j = 0; j < d[i].length(); j++) {
	                if (Character.isDigit(d[i].charAt(j))) {
	                    rakamVar = false;
	                    break;
	                }
	            }
	            if (rakamVar && d[i].length() > max.length()) {
	                max = d[i];
	            }
	        }
	        return max;
	    }

}
