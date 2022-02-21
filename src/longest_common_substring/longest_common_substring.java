package longest_common_substring;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class longest_common_substring {

	public static String findLongestSubstring(String s1, String s2) {
        List<Integer> occurs = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(s2.length()-1)) {
                occurs.add(i);
            }
        }

        Collections.reverse(occurs);

        for(int index : occurs) {
            boolean equals = true;
            for(int i = index; i >= 0; i--) {
                if (s1.charAt(index-i) != s2.charAt(s2.length() - i - 1)) {
                    equals = false;
                    break;
                }
            }
            if(equals) {
                return s1.substring(0,index+1);
            }
        }

        return "";
    }
	
	public static void main(String args[])
	{
		String s="good goodness goody";
		String[] arr=s.split("\\s+");
		int max=0;
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length()<max)
			{
				max=arr[i].length();
				index=i;
			}
		}
		int c=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[index].compareTo(findLongestSubstring(arr[index],arr[i]))==-1)
			{
				c=1;
				break;
			}
			else
			{
				continue;
			}
		}
		if(c==1)
		{
			System.out.print(arr[index]);
		}
		
	}
	
}
