package richest_man_1672;

public class richest_man {

	 public static int maximumWealth(int[][] accounts) 
	 {
		 int max = Integer.MIN_VALUE;
	        int sum;
	        for(int[] account: accounts){
	            sum = 0;
	            for(int money: account){
	                sum += money;  
	            }
	            max = Math.max(sum, max);
	        }
	        return max;
	  }
	 
	 public static void main(String args[])
	 {
		 int[][]accounts = {{1,2,3},{3,2,1}};
		 System.out.print(maximumWealth(accounts));
	 }
}
