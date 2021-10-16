package buy_sell_stock;

public class buy_sell {

	public static int profit(int prices[])
	{
		int n=prices.length;
		int max=prices[n-1],profit=0;
		for( int i=n-2;i>=0;i--)
		{
			if(max-prices[i]>0)
			{
				profit=Math.max(profit,max-prices[i]);
			}
			max=Math.max(max,prices[i]);
		}
		return profit;
		
	}
	
	public static void main(String args[]) {
		int[] prices= {7,6,4,3,1};
		System.out.print(profit(prices));
		
	}
}
