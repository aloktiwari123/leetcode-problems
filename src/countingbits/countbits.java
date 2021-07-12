package countingbits;

import java.util.Arrays;

public class countbits {

	public static int[] countbit(int n)
	{
		int[] arr=new int[n+1];
		arr[0]=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				arr[i]=arr[i/2];
			}
			else
			{
				arr[i]=1+arr[i/2];
			}
		}
		return arr;
		
	}
	public static void main(String[] args)
	{
		System.out.print(Arrays.toString(countbit(5)));
		
	}
}
