package freq_map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class freq_map {
	
	public static void freq(int arr[])
	{
		HashMap<Integer,Integer>map=new HashMap<Integer,Integer>(); 
		
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i],map.get(arr[i])+1);
			}
			else
			{
				map.put(arr[i],map.getOrDefault(arr[i],1));
			}
		}
		System.out.print(map);
		System.out.print(map.keySet());
		
		
	}
	
	public static void main(String args[])
	{
		int[] arr= {1,1,1,2,3,4,4,5,6,6,6};
		freq(arr);
	}

}
