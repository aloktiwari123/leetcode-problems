package Jewels_and_Stones;

public class jewel_and_stones {
	public static int numJewelsInStones(String jewels, String stones) 
	{
		char[] jewel=jewels.toCharArray();
		char[] stone=stones.toCharArray();
		int count=0;
		for(int i=0;i<jewel.length;i++)
		{
			for(int j=0;j<stone.length;j++)
			{
				if(jewel[i]==stone[j])
				{
					count++;
				}
			}
		}
		return count;
        
    }
	public static void main(String[] args)
	{
		String jewels = "aA";
		String stones = "aAAbbbb";
		System.out.print(numJewelsInStones(jewels, stones));
	}

}
