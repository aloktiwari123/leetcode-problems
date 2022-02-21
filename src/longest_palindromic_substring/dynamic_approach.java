package longest_palindromic_substring;

public class dynamic_approach {

	public static String longestPalindrome(String s)
	{
		if(s==null || s.length()==1)
		{
			return s;
		}
		int max_len=1;
		int best_start=0;
		int n=s.length();
		
		boolean dp[][]=new boolean[n][n];
		for(int i=0;i<n;i++)
		{
			dp[i][i]=true;
			if(i+1<n)
			{
				if(s.charAt(i)==s.charAt(i+1))
				{
					dp[i][i+1]=true;
					max_len=2;
					best_start=i;
				}
			}
		}
		
		for (int col = 2; col < n; col++) {
            for (int row = 0; row < n - 2; row++) {
                if (dp[row + 1][col - 1] && s.charAt(row) == s.charAt(col)) {
                    dp[row][col] = true;
                    int len = col - row + 1;
                    if (len > max_len) {
                        max_len = len;
                        best_start = row;
                    }
                }
            }
        }
        
        return s.substring(best_start, best_start + max_len);
	
		
	}
	
	public static void main(String args[])
	{
		String s="babad";
		System.out.print(longestPalindrome(s));
	}
}
