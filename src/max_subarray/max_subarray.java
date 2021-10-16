package max_subarray;

public class max_subarray {
	
	public static int max_sub(int arr[])  // Complexity O(n^3)
	{
		int n=arr.length;
		int max_sum=arr[0];
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++) 
			{
				int current_sum=0;
				for(int k=i;k<j;k++)
				{
					current_sum=current_sum+arr[k];
				}
				max_sum=Math.max(max_sum,current_sum);
			}
		}
		return max_sum;
		
	}
	
	public static int max_sum_op(int arr[]) // Complexity O(n^2)
	{
		int n=arr.length;
		int max_sum=0;
		for(int i=0;i<n;i++)
		{
			int sum=0;
			for(int j=i;j<n;j++)
			{
				sum=sum+arr[j];
				max_sum=Math.max(max_sum,sum);
			}
			
		}
		return max_sum;
	}
	
	public static int maxArray(int arr[]) // Complexity O(n) Kadane's Algorithm
	{
		int n=arr.length;
		int max=arr[0];
		int sum=0;
		for(int a:arr)
		{
			sum+=a;
			max=Math.max(max,sum);
			if(sum<0) sum=0;
		}
		return max;
	}
	
	public static void main(String args[]) {
		int[] no= {-2,1,-3,4,-1,2,1,-5,4};
		//System.out.print(max_sub(no));
		//System.out.print(max_sum_op(no));
		System.out.print(maxArray(no));
	}

}
