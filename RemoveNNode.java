import java.util.*;

 class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
 }

public class RemoveNNode {
	
	ListNode head;

	public ListNode removeNthFromEnd(ListNode a, int b) {
	    ListNode temp = a;
	    ListNode node = a;
	    int count = 0, i = 0;
	    while( a.next!=null ){
	        count++;
	        a = a.next;
	    }
	    if( count < b ){
	        temp = temp.next;
	    }
	    while( temp.next != null ){
	        i++;
	        if( i == count - b ){
	            temp.next = temp.next.next;
	        }
	        else{
	            temp = temp.next;
	        }
	    }
	    return node;
	}
	
	public void insertNode(int number) {
		if( head==null ) {
			head = new ListNode(number);
		}
		else {
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
