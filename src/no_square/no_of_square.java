package no_square;

public class no_of_square {
	
	int no=0;
	
	public static void  swap(int m,int n)
	{ 
		int temp=m;
		m=n;
		n=temp;
		
	}
	public static int no_s(int m,int n)
	{

		int result = 0, rem = 0;
	    if (m < n)
	        swap(m, n);
	 
	    while (n> 0)
	    {
	        result += m/n;
	        rem = m % n;
	        m = n;
	        n = rem;
	    }
	 
	    return result;
	  
		
	}
	public static void main(String args[])
	{
		System.out.print(no_s(7, 3));
	}

}
