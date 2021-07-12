package Defanging_an_IP_Address;

public class IP_address {
	public static String defangIPaddr(String address)
	{
		String s="[.]";
		String output="";
		for(int i=0;i<address.length();i++)
		{
			if(address.charAt(i)=='.')
			{
				for(int j=0;j<s.length();j++)
				{
					output+=s.charAt(j);
				}
			}
			else
			{
			output+=address.charAt(i);
		}}
		return output;
        
    }
	public static String sortApproach(String address)
	{
		return address.replace(".","[.]");
		
	}
	public static void main(String[] args)
	{
		String address = "1.1.1.1";
		System.out.println(defangIPaddr(address));
		System.out.print(sortApproach(address));
	}
}
