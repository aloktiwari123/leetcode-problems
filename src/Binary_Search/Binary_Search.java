package Binary_Search;

public class Binary_Search {
	
	 public static int search(int nums[], int target) 
	 {
		 int u=nums.length-1;
		 int l=0;
		 
		 while(l<=u)
		 {
		 int mid=l+(u-l)/2;
		 if(nums[mid]==target)
		 {
 			 return mid;
		 }
		 if(nums[mid]<target)
		 { 
			 l=mid+1;
		 }
		 if(nums[mid]>target)
		 {
			 u=mid-1;
		 }
		 }
		 return -1;
	 }
	
	 
	 public static void main(String args[])
	 {
		 int[] nums={-1,0,3,5,9,12};
		 int target=9;
		 System.out.print(search(nums, target));
	 }

}
