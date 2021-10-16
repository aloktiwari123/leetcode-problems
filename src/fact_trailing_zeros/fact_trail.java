package fact_trailing_zeros;

public class fact_trail {

	 public static int trailingZeroes(int n) 
	 {
		 int c=0;
		 while(n>0)
		 {
			n/=5;
			c=c+n;
		 }
		return c;
	        
	    }
	 
	 public static void main(String args[])
	 {
		 System.out.print(trailingZeroes(5));
	 }
}
