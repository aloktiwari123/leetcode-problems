package Sorting_the_Sentence;

public class sort_sentence {

	 public static String sortSentence(String s) {
	        String[] str= s.split("\\s");
	        String[] res= new String[str.length];
	        int j = 0;         
	        for(String word : str){
	            j =(int)(word.charAt(word.length()-1)-'0');
	            res[j-1] = word.substring(0,word.length()-1);
	        }
	        return String.join(" ", res);
	    }
	 public static void main(String args[])
	 {
		 String s="is2 sentence4 This1 a3";
		 System.out.println(sortSentence(s));
	 }
}
