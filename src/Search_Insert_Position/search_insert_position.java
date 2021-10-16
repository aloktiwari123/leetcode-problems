package Search_Insert_Position;

public class search_insert_position {

	 public static int searchInsert(int[] nums, int target) 
	 {
		 if(nums.length == 0) return 0;
	        int n = nums.length;
	        int left = 0;
	        int right = n-1;
	        int mid;
	        while(left <= right)
	        {
	            mid = (left + right)/2;
	            if(target ==nums[mid]) return mid;
	            else if(target < nums[mid]) right = mid-1;
	            else 
	            	left = mid+1;  
	        }
	        return left;
	 }
	 public static void main(String args[])
	 {
		 int[] nums = {1,3,5,6};
		 int target = 7;
		 System.out.print(searchInsert(nums, target));
	 }
}
