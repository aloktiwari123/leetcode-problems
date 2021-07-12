package power;

public class power {
	 public static double myPow(double x, int n)
	 {
		 if(n>0)
		 {
			 return(x*myPow(x, n-1));
		 }
		 if(n<0)
		 {
			return((1/x)*myPow(x, n+1));
		 }
		 return(1);
	        
	    }
	 public static void main(String args[])
		{
	     
	     double x=2.00000;
	     int n =-10;
		 System.out.print(myPow(x, n));
		 //System.out.print(Integer.MAX_VALUE);
		}
}
