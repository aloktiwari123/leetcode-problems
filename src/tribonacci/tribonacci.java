package tribonacci;

public class tribonacci {

	public static int _tribonacci(int n)
	{
		int []thethree= {0,1,1};
		
		int counter=3;
		
		while(counter<=n)
		{
			int temp=thethree[0]+thethree[1]+thethree[2];
			thethree[0]=thethree[1];
			thethree[1]=thethree[2];
			thethree[2]=temp;
			counter++;
		}
		return n<=1?thethree[n%2]:thethree[2];
	}
	
	public static void main(String args[])
	{
		System.out.print(_tribonacci(4));
	}
}
