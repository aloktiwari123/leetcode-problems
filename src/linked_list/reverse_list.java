package linked_list;

public class reverse_list {
	
	public static ListNode reverse(ListNode head)
	{
		ListNode temp=null;
		ListNode curr=head;
		ListNode prev=null;
		
		while(curr!=null)
		{
			temp=curr.next;//Storing current address
			curr.next=prev;//performing actuall reverse
			prev=curr;//moving curr and prev
			curr=temp;
		}
		return prev;
	}
	

}
