package Design_linkedlist_707;

public class MyLinkedList {
	
	private int size;
	private Node head,tail;
	
	private class Node
	{
		int val;
		Node nextnode;
		
		public Node(int val)
		{
			this.val=val;
		}
		public Node(int val,Node nextnode)
		{
			this.val=val;
			this.nextnode=nextnode;
		}
	}
	
	public MyLinkedList()
	{
		size=0;
		head=tail=null;
	}
    
	private Node getNode(int index)
	{
		Node p=head;
		for(int i=0;i<index;++i)
		{
			p=p.nextnode;
		}
		return p;
	}
	
	public int get(int index)
	{
		if(index<0 || index>=size)return -1;
		return getNode(index).val;
	}
	
	public void addAtHead(int val)
	{
		Node node=new Node(val,head);
		if(size==0)head=tail=node;
		else
			head=node;

		++size;
		
	}
	
	public  void addAtTail(int val)
	{
		Node node=new Node(val);
		if(size==0)head=tail=node;
		else
		{
			tail.nextnode=node;
			tail=node;
		}
		++size;
	}
	
	public void addAtIndex(int index, int val) 
	{
		
		if(index<0 || index>size)return;
		if(index==0)addAtHead(val);
		else if(index==size)addAtTail(val);
		else
		{
			Node p=getNode(index-1);
			Node node=new Node(val,p.nextnode);
			p.nextnode=node;
			++size;
		}
        
    }
    
    public void deleteAtIndex(int index) 
    {
    	if (index < 0 || index >= size) return;
        if (size == 1) {
            head = tail = null;
        }
        else if (index == 0) {
            head = head.nextnode;
        }
        else {
           Node p = getNode(index - 1);
           p.nextnode = p.nextnode.nextnode;
           if (index == size-1) tail = p; 
        }
        --size;
        
    }
	
	
}
