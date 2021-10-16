package Height_Checker;

import java.util.Arrays;

public class height_checker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] heights = {1,1,4,2,1,3};
		System.out.print(heightChecker(heights));

	}
	public static int heightChecker(int[] heights) 
	{
		int []expected=heights.clone();
		Arrays.sort(expected);
		int count=0;
		for(int i=0;i<heights.length;i++)
		{
			if(expected[i]!=heights[i])
			{
				count++;
			}
		}
		return count;
        
    }

}
