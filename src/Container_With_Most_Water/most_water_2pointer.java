package Container_With_Most_Water;

public class most_water_2pointer {

	
	public static int maxArea(int[] height)
	{
		int max=0;
		int j=height.length-1;
		int i=0;
		while(i<j)
		{
			  int h=0;
			  int b=0;
			  if(height[i]<height[j])
			  {
				  h=height[i];
				  b=Math.abs(i-j);
				  i++;
			  }
			  else
			  {
				  h=height[j];
				  b=Math.abs(i-j);
				  j--;
			  }
			  if(max<(h*b))
			  {
				  max=h*b;
			  }
			  
		}
		return max;
	}
	public static void main(String[] args)
	   {
	    int[] nums= {1,8,6,2,5,4,8,3,7};
	   	System.out.print(maxArea(nums));
	   }
}//O(n)
