package largest_sum;

import java.util.ArrayList;

public class largest_sum {
	
	public static boolean cansum(int targetSum,ArrayList<Integer>no)
	{
		if(targetSum==0)
		{
			return true;
		}
		if(targetSum<0)
		{
			return false;
		}
		for(int i=0;i<no.size();i++)
		{
			int remainder = targetSum-no.get(i);
			ArrayList<Integer>n1=(ArrayList<Integer>)no.clone();
			n1.remove(i);
			if(cansum(remainder,n1)==true)
			{
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String args[])
	{
		//int[] arr= {5,7,16,1,2};
		int[] arr= {3,5,-1,8,12};
		int max_index=0;
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max_index=i;
				max=arr[i];
			}
		}
		ArrayList<Integer>dat=new ArrayList<Integer>();
		for(int j=0;j<arr.length;j++)
		{
			if(j==max_index)
			{
				continue;
			}
			else
			{
				dat.add(arr[j]);
			}
		}
		System.out.print(dat.toString());
		System.out.println(cansum(max,dat));
	}

}
