package add_binary;

public class add_binary {
	
	public static String addBinary(String a,String b)
	{
		String result="";
		int s=0;
		int i=a.length()-1;
		int j=b.length()-1;
		
		while(i>=0 ||j>=0 || s==1)
		{
			s+=((i>=0)?a.charAt(i)-'0':0);//converting char to int by subtracting '0'
			s+=((j>=0)?b.charAt(j)-'0':0);
			
			result=(char)(s%2+'0')+result;
			
			s/=2;
			i--;
			j--;
		}
		return result;
		
	}
	public static void main(String args[])
	{
		String a="11";
		String b="1";
		System.out.print((b.charAt(0)-'0')+1);
		//char to int [ - '0']
		//int to char [ + '0']
		System.out.print(addBinary(a, b));
	}

}
