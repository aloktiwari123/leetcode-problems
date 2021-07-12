package Shuffle_String;

import java.util.Arrays;

public class Shuffle_String {

   public static String restoreString(String s, int[] indices) 
   {
	   char[] c=new char[s.length()];
	   String str="";
	   for(int i=0;i<indices.length;i++)
	   {
		   c[indices[i]]=s.charAt(i);
	   }
	   return String.valueOf(c);
        
    }
   public static void main(String[] args)
   {
       int[] nums= {3,1,4,2,0};
   	   System.out.print(restoreString("aiohn",nums));
   }
}
