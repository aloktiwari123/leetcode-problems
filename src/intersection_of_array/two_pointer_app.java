package intersection_of_array;

import java.util.ArrayList;
import java.util.Arrays;

public class two_pointer_app {
	
	public static int[] intersect(int[] nums1, int[] nums2)
	{
		Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0; 
        int j = 0;
        ArrayList<Integer>list = new ArrayList<>();
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] > nums2[j])
                j++;
            else
                i++;
                
        }
        int arr[] = new int[list.size()];
        i = 0;
        for(int ele : list)
            arr[i++] = ele;
        return arr;
	}
	public static void main(String args[])
	{
		int [] nums1= {4,9,5};
		int [] nums2= {9,4,9,8,4};
		System.out.print(Arrays.toString(intersect(nums1, nums2)));
	}

}
