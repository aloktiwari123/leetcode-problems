package climbing_stairs;

import java.util.HashMap;

public class climb {

	public static HashMap<Integer,Integer>map=new HashMap<Integer, Integer>();
	public static int climb(int n)
	{
		if(map.containsKey(n))
		{
			return map.get(n);
		}
		if(n==1)
		{
			return 1;
		}
		if(n==2)
		{
			return 2;
		}
		int count=climb(n-1)+climb(n-2);
		map.put(n,count);
		return count;
	}
	public static void main(String[] args)
	{
		System.out.print(climb(45));
	}
}
