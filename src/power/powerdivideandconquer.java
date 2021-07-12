package power;

public class powerdivideandconquer {

	public static double myPow(double x,int n)
	{
		 if(n==1){
	            return x;
	        }
	        if(n==-1){
	            return (1/x);
	        }
	        if(n==0){
	            return 1;
	        }
	        double temp=myPow(x,n/2);
	        if(n%2==0){
	            
	            return temp*temp;
	        }
	        else
	        {
	            double t;
	            if(n<0){
	                t=(1/x);
	            }else{
	                t=x;
	            }
	            return temp*temp*t;
	        }
	        
	}
	public static void main(String args[])
	{
     
     double x=2.00000;
     int n =-10;
	 System.out.print(myPow(x, n));
	 //System.out.print(Integer.MAX_VALUE);
	}
}
