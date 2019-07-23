
class ListNode {
     public int val;
     public ListNode next;
     ListNode(int x)
     { val = x; next = null; }
 }

public class RemoveDupLinked {
	ListNode root;
	ListNode current;
	ListNode node;
	public ListNode deleteDuplicates(ListNode a) {
		System.out.println("1st vaLue="+a.val);
		while(a!=null && a.next!=null)
		{
			System.out.println("Inside loop value="+a.val);
			if(a.next.val==a.val)
			{
				a.next=a.next.next;
			
			}
			a=a.next;
		}
		
		return a;
		
		/*
		 *  ListNode start=a;
	    ListNode current=a;
	    while(current!=null && current.next!=null)
	    {
	        if(current.next.val==current.val)
	        {
	            current.next=current.next.next;
	        }
	        else
	        {
	            current=current.next;
	        }
	    }
	    return start;
	    
		 */
	}
	
	public void insert(int a)
	{
		if(root==null)
		{
			root=new ListNode(a);
			current=root;
			root.next=current;
		}
		else {
			ListNode newnode=new ListNode(a);
			current.next=newnode;
			current=newnode;
		}
	}
	
	public void display(ListNode rootEle)
	{
		rootEle=root;
		while(rootEle.next!=null)
		{
			System.out.println(rootEle.val);
			rootEle=rootEle.next;
		}
		System.out.println(rootEle.val);
	}
	
	public static void main(String[] args)
	{
		RemoveDupLinked rem=new RemoveDupLinked();
		int a=2;
		rem.insert(a);
		rem.insert(a);
		a=3;
		rem.insert(a);
		rem.insert(a);
		rem.display(rem.root);
		System.out.println("Removing elements:");
		rem.display(rem.deleteDuplicates(rem.root));
		
	}
}
