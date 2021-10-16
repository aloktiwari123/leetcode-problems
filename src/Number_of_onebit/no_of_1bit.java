package Number_of_onebit;

public class no_of_1bit {
	
	 public static int hammingWeight(int n)
	    {
	        int sum = 0;
	        while (n != 0 ) { 
	            if ( (n & 1) == 1) { 
	                ++sum;
	            }
	            n >>>= 1; //Logical right shift filling the vaccant bit with '0'
	        }
	        
	        return sum;
	    }
	 public static void main(String args[])
	 {
		 System.out.println(hammingWeight(01011));
	 }

}
