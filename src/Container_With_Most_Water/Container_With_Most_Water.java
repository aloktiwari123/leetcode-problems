package Container_With_Most_Water;

public class Container_With_Most_Water {

   public static int maxArea(int[] height)
   {
	  int max=0;
	  for(int i=0;i<height.length;i++)
	  {
		  for(int j=i+1;j<height.length;j++)
		  {
			  int h=0;
			  int b=0;
			  if(height[i]<height[j])
			  {
				  h=height[i];
				  b=Math.abs(i-j);
			  }
			  else
			  {
				  h=height[j];
				  b=Math.abs(i-j);
			  }
			  if(max<(h*b))
			  {
				  max=h*b;
			  }
		  }
	  }
	  return max;
        
    }
   public static void main(String[] args)
   {
       int[] nums= {1,8,6,2,5,4,8,3,7};
   	System.out.print(maxArea(nums));
   }
}//O(n*n) time complexity
