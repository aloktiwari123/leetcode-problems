package House_Robber;

public class house_robber_2 {
	
	public static void main(String args[])
	{
		int[]nums = {2,3,2};
		System.out.print(robber(nums));
	}
	
	public static int robber(int[] num)
	{
		if(num.length==1)return num[0];
		return Math.max(rob(num,0,num.length-2),rob(num, 1,num.length-1));
		
	}
	
	public static int rob(int[] num,int b,int h)
	{
			int rob1=0;
			int rob2=0;
			
			for(int i=b;i<h;i++)
			{
				int newRob=Math.max(rob1+num[i], rob2);
				rob1=rob2;
				rob2=newRob;
			}
			return rob2;
		
	}

}
