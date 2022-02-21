package shifting;

public class shifting {

	public static void arrange(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]<0)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			pr(arr);
		}
		}
		
	}
	public static void bubblesort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i;j<arr.length-i-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				pr(arr);
			}
		}
	}
	public static void pr(int arr[])
	{
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]+" ");
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		int[] arr= {1,-1,2,-2,3,-3};
		//arrange(arr);
		bubblesort(arr);
	}
}
