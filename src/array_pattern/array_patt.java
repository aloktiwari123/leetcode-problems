package array_pattern;

public class array_patt {
	
	public static void array(int arr[],int K)
	{
		int []arr2=new int[arr.length];
		arr2=swap(arr);
		prin(arr2);
		int i=2;
		while(i<=K)
		{
			if(i%2==0)
			{
				arr=swap(arr2);
				prin(arr);
				i++;
			}
			else
			{
				arr2=swap(arr);
				prin(arr2);
				i++;
			}
		}
		
	}
	
	public static void prin(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
	}

	public static int[] swap(int arr[])
	{
		int f=arr[0];
		int l=arr[arr.length-1];
		int j=0;
		while(j<arr.length-1)
		{
			arr[j]=Math.abs(arr[j]-arr[j+1]);
			j++;
		}
		arr[j]=Math.abs(f-l);
		return arr;
	}
	
	public static void main(String args[])
	{
		int[] arr= {1,2,3,4,5};
		array(arr, 6);
	}
}
