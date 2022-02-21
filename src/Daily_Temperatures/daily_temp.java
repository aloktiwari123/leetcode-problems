package Daily_Temperatures;

public class daily_temp {
	
	public static int[] dailyTemperatures(int[] temperatures) 
	{
		int[] out=new int[temperatures.length];
		
		for(int i=0;i<temperatures.length;i++)
		{
			int c=0;
			if(i!=temperatures.length-1)
			{
			for(int j=i+1;j<temperatures.length;j++)
			{
				c++;
				if(temperatures[j]>temperatures[i])
				{
					out[i]=c;
					break;
				}
			}
			}
			else
			{
				out[i]=c;
			}
		}
		
		return out;        
    }
	
	public static void main(String args[])
	{
		int[] temperatures = {73,74,75,71,69,72,76,73};
		
		int[] out=dailyTemperatures(temperatures);
		
		for(int i=0;i<out.length;i++)
		{
			System.out.print(out[i]+" ");
		}
	}

}
