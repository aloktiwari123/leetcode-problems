package Power_of_Two;

public class power_of_two {
	
	/*
	 * recursive approach
	 public static boolean isPowerOfTwo(int n) 
	 {
		 if(n<0) return false;
		 if(n==1) return true;
		 if(n%2==0)
		 {
			 return isPowerOfTwo(n/2);
		 }
		 return false;
	        
	 }
	 */
	
	/*
	 * log  approach
	 */
	 
	 public static boolean isPowerOfTwo(int n)
	 {
		if(n==0) return false;
		return (int)Math.floor(Math.log(n)/Math.log(2))== (int)Math.ceil(Math.log(n)/Math.log(2))?true:false;
	 }
	 
	 public static void main(String args[])
	 {
		 System.out.print(isPowerOfTwo(16));
	 }

}
