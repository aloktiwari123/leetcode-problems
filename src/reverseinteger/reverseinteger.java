package reverseinteger;
public class reverseinteger {

	public static void main(String args[])
	{
     int n=-123;
	 System.out.print(reverse(n));
	 System.out.print(Integer.MAX_VALUE);
	}
	public static int reverse(int x) {
        boolean isPositive = x > 0 ? true: false;
        x = Math.abs(x);
        int res = 0;
        while (x > 0) {
            if (res > Integer.MAX_VALUE/10) return 0;
            res = res * 10 + x % 10;
            x /= 10;
        }
        return isPositive? res : -res;
        
    }
}
