package Number_Complement;

public class Number_Complement {

	public static void main(String args[])
	{
		int num=5;
		
		int nBits=(int) Math.floor((Math.log(num) / Math.log(2)) + 1);
		/*
		 * counting the no of bits in the binary form the given no
		 */
		int mask=(1<<nBits)-1;
		/* 1 << 3
		 * 1000=8
		 * 8-1=7
		 * 7 in binary 111
		 * masking to the significant bits only
		 */
		System.out.println(~num & mask);
		System.out.println(odd_eve_bit(4));
		
	}
	
	public static boolean odd_eve_bit(int n)
	{
		if((n & 1)==0)
		{
			return true;
		}
		return false;
	}
}
