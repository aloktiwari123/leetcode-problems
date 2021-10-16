package linked_list;

public class merge_two_sorted_list {

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2)
	{
		if(l1==null)return l2;
		if(l2==null)return l1;
		
		if(l1.val > l2.val) //make sure that l1 is the list with the first no as the smallest
		{
			ListNode temp=l1;
			l1=l2;
			l2=temp;
		}
		
		ListNode res=l1;
		while(l1 != null && l2 !=null)
		{
			ListNode tmp=null;
			while(l1!=null && l1.val<=l2.val)//if l1 is less than l2 keep iterating
			{
				tmp=l1;
				l1=l1.next;
			}
			tmp.next=l2;// else link the node to the node on the other list which contains smaller value
			
			//swap
			ListNode temp=l1;
			l1=l2;
			l2=temp;
			
		}
		
		return res;
        
    }
	public static void main(String args[])
	{
		ListNode l1=new ListNode();
	}
}
