package linked_list;

public class show {
	
	public static void show_list(ListNode head)
	{
		if(head==null)
		{
			System.out.print("List is Empty");
		}
		while(head!=null)
		{
			System.out.print(head.val);
			head=head.next;
		}
	}
	public static void main(String args)
	{
		ListNode head=new ListNode();
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next= new ListNode(7);
        head.next.next.next.next.next.next.next= new ListNode(8);
        show.show_list(head);
        
	}

}
