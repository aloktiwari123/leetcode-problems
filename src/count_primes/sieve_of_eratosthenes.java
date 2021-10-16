package count_primes;

import java.util.Arrays;

public class sieve_of_eratosthenes {

   public static int s_of_e(int n)
   {
	   boolean[] arr=new boolean[n+1];
	   for(int i=2;i<n+1;i++)
	   {
		 arr[i]=true;
	   }
	   for(int i=2;i<=n/2;i++)
	   {
		   if(arr[i]==true)
		   {
			   for(int j=2*i;j<n+1;j=j+i)
			   {
				   arr[j]=false;
			   }
		   }
	   }
	   int c=0;
	   for(int i=2;i<n+1;i++)
	   {
		   if(arr[i]==true)
		   {
			   c++;
		   }
	   }
	   
	   return c;
	   
   }
   
   public static void main(String args[])
	{
	   int n=10;
	   System.out.print(s_of_e(n));
	}
}