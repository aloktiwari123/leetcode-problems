package matching;

public class str_matching {
	
	
	 public static boolean arrayStringsAreEqual(String[] word1, String[] word2) 
	 {
		 String s1="";
		 String s2="";
		 for(int  i=0;i<word1.length;i++)
		 {
			 s1=s1+word1[i];
		 }
		 for(int j=0;j<word2.length;j++)
		 {
			 s2=s2+word2[j];
		 }
		 System.out.println(s1);
		 System.out.println(s2);
		 if(s1.equalsIgnoreCase(s2))
		 {
			 return true;
		 }
		 return false;
	 }
	 
	 public static void main(String args[])
	 {
		 String[] s1= {"a","cb"};
		 String[] s2= {"ab","c"};
		 System.out.print(arrayStringsAreEqual(s1,s2));
	 }

}
