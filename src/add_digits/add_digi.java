package add_digits;

public class add_digi {
	
	/* Iterative approach
    public static int addDigits(int num) 
    {
    	int s=0;
    	while(num>9)
    	{
    		while(num>0)
    		{
    			s=s+num%10;
    			num=num/10;
    		}
    		num=s;
    		s=0;
    		
    	}
		return num;
        
    }
    */
	
	public static int addDigits(int num) //Recursive approach
	{
        if ( num < 10 ){
            return num;
        }
        return addDigits ((num/10)+num%10);
    }
	
    public static void main(String args[])
    {
    	System.out.print(addDigits(38));
    }

}
