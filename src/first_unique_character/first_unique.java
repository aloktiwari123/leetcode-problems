package first_unique_character;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Hashtable;

public class first_unique {
	public static void main(String args[])throws IOException
	{
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  System.out.println("Input the string");
	  String s=br.readLine();
	  System.out.println(firstUniqChar(s));
	  
	}
	public static int firstUniqChar(String s) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int n = s.length();
        // build hash map : character and how often it appears
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        
        // find the index
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1) 
                return i;
        }
        return -1;
    }

}
