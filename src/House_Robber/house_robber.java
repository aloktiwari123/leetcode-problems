package House_Robber;

public class house_robber {
	
	public static int robber(int houses[],int n) // Recursive Approach
	{
		if(n<0)
		{
			return 0;
		}
		int house_selected=houses[n]+robber(houses, n-2);
		int house_not_selected=robber(houses, n-1);
		return Math.max(house_not_selected,house_selected);
		
	}
	
	public static int rob(int houses[]) //tabular approach
	{
		int [] cache=new int[houses.length+1];
		cache[0]=houses[0];
		cache[1]=Math.max(houses[0],houses[1]);
		
		for(int i=2;i<houses.length;i++)
		{
			cache[i]=Math.max(cache[i-2]+houses[i],cache[i-1]);
		}
		return cache[houses.length-1];
	}
	
	public static void main(String args[]) {
		int[] houses= {2,7,9,3,1};
		int n=houses.length;
		//System.out.print(max_sub(no));
		//System.out.print(max_sum_op(no));
		//System.out.print(robber(houses, n-1));
		System.out.print(rob(houses));
	}

}
