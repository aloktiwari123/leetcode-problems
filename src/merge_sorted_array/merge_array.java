package merge_sorted_array;

public class merge_array {
	
	 public static void merge(int[] nums1, int m, int[] nums2, int n) 
	 {
	       int index=m+n-1;
	       int i=m-1;
	       int j=n-1;
	       
	       while(i>=0 && j>=0)
	       {
	    	   if(nums1[i]>nums2[j])
	    	   {
	    		   nums1[index--]=nums1[i--];
	    	   }
	    	   else
	    	   {
	    		   nums1[index--]=nums2[j--];
	    	   }
	       }
	       while(j>=0)
	       {
	    	   nums1[index--]=nums2[j--];
	       }
	       for(int k=0;k<m+n-1;k++)
	       {
	    	   System.out.print(nums1[k]);
	       }
	    
	 }
	 
	 public static void main(String args[])
	 {
		 int []nums1 = {1,2,3,0,0,0};
		 int m = 3;
		 int n=3;
		 int [] nums2 = {2,5,6};
		 
		 merge(nums1, m, nums2, n);
	 }

}
