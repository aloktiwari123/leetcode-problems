package minimum_Cost_Climbing_Stairs;

public class minimum_Cost_Climbing_Stairs {
	
	public static int min_Cost(int[] cost)
	{
		int [] dp=new int[cost.length];
		dp[0]=cost[0];
		dp[1]=cost[1];
		
		for(int i=2;i<cost.length;i++)
		{
			dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
		}
		
		return Math.min(dp[cost.length-1],dp[cost.length-2]);

    }
	
	public static void main(String args[])
	{
		int [] cost = {10,15,20};
		System.out.print(min_Cost(cost));
	}
}
