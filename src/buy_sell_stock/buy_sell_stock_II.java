package buy_sell_stock;

public class buy_sell_stock_II {

	public static int buy_sell(int prices[])
	{
		int n=prices.length;
		int diff=0;
		for(int i=1;i<n;i++)
		{
			if(prices[i]>prices[i-1])
			{
				diff+=prices[i]-prices[i-1];
			}
		}
		return diff;
	}
	public static void main(String args[]) 
	{
		int[] prices= {1,2,3,4,5};
		System.out.print(buy_sell(prices));
	}
}
