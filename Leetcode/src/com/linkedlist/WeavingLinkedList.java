package com.linkedlist;

class Node
{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data = data;
		this.next = null;
	}
	
}

class OperationsOnNode
{	
	public Node insertLinkedList(Node head, int val)
	{
		if(head == null)
		{
			head = new Node(val);
			return head;
		}
		else
		{
			Node p = head;
			while(p.next != null)
			{
				p = p.next;
			}
			Node newNode = new Node(val);
			p.next = newNode;
			return head;
		}
	}
	
	
	public void displayLinkedList(Node head)
	{
		Node p = head;
		while(p != null)
		{
			System.out.println(p.data);
			p = p.next;
		}
	}
	
	public void weavingLinkedList(Node head)
	{
		//runner's algorithm to find the middle of linked list
		
		Node runner = head;
		Node slower = head;
		
		while(runner != null) //runner next is checked in case of odd length linkedlist
		{
			//System.out.println("Slower = " + slower.data);
			slower = slower.next;
			
			//System.out.println("Runner = " + runner.data);
			runner = runner.next.next;
		}
		
		runner = slower;
		slower = head;
		
		
		//weaving technique
		
		
		while(runner != null && slower != null)
		{
			Node temp1 = slower.next;
			Node temp2 = runner.next;
			
			slower.next = runner;
			
			if(runner.next == null)  //this is imp as there will be cycle which will get creeated
			{
				break;
			}
			runner.next = temp1;
			slower = temp1;
			runner = temp2;
			
		}
		
		//System.out.println("runner = " + runner.data +" "+  "slower = " + slower.data);
		
	}
	
	
	
	/*
	public void reorderList(Node head) {
        
        Node p = head;
        Node current = head;
        Node end, prev = head, temp;
        
        
        //determine the end and prev node
        while(p.next != null)
        {
            prev = p;
            p = p.next;
        }
        
        end = p;
        
        while(true)
        {
            temp = current.next;
            current.next = end;
            if(end.next == end && end == current)
            {
                break;
            }
            end.next = temp;
            prev.next = null;
            
            current = temp;
            Node q = end;
            while(q.next != prev)
            {
                q = q.next;
            }
            end = prev;
            prev = q;
            
        }
        
    }
    */
	
	public Node reverseList(Node head)
	{
		Node prev = null, curr = head, temp;
		
		while(curr != null)
		{
			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		 
		return prev;
	}
	
	
	public Node reverseBetween(Node head, int m, int n)
	{
		if(m == n)
			return head;
		//count between m and n
		int count = 1;
		Node p = head, start = null, end = null, temp = null, newHead = null, prev = null;
		
		while(count != n)
		{
			if(count == m-1)
			{
				prev = p;
			}
			if(count == m)
			{
				start = p;
			} 
			p = p.next;
			count++;
		}
		end = p;
		
		temp = end.next;  // to know which is the next node after the end node
		
		end.next = null; 
	
		newHead = reverseList(start);
		
		start.next = temp;
		
		if(start == head) {
			return newHead;
		}
		
		prev.next = newHead;
		
		return head;
	}
	
	public Node rotateRight(Node head, int k) {
		
	if(head == null || k < 0)
	{
		return head;
	}
	
	//approach to count the number of nodes present in the linkedlist
	//and then take the abs value to reach the specific node
	Node start = head;
	
	int count = 0;
	
	while(head.next != null)
	{
		count++;
		head = head.next;
	}
	
	count++; //just to count the last node of the list as well
	
	k = k % count;
	
	k = Math.abs(count-k);  //this is done for getting to the right node, i.e. how many nodes 
							//do we need to move from the start to reach the end 
	head.next = start; 
	
	while(k-- > 0)
	{
		head = head.next;
	}
	
	start = head.next;
	
	head.next = null;
	
	return start;
	
	}
	
	
	public Node partition(Node head, int x) {
        Node node = head;
        Node firstStart = null;
        Node firstEnd = null;
        Node secondStart = null; 
        Node secondEnd = null;  
        
        while(node != null){
           Node temp = node.next;
           node.next = null;
            
           if(node.data < x){
               if(firstStart == null){
                   firstStart = node;
                   firstEnd = node;
               }
               else{
                   firstEnd.next = node;
                   firstEnd = node;
               }
           }
            else{
                if(secondStart == null){
                   secondStart = node;
                    secondEnd = node;
               }
               else{
                   secondEnd.next = node;
                   secondEnd = node;
               }
            }
            node = temp;
        }
        
        firstEnd.next = secondStart;
        
        return firstStart;
    }

}





public class WeavingLinkedList {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head = null;
		
		OperationsOnNode operations = new OperationsOnNode();
		
		head = operations.insertLinkedList(head, 1);
		
		operations.insertLinkedList(head, 4);
		
		operations.insertLinkedList(head, 3);
		
		operations.insertLinkedList(head, 2);
		
		operations.insertLinkedList(head, 5);
		
		operations.insertLinkedList(head, 2);
		
		//operations.insertLinkedList(head, 6);
		//operations.displayLinkedList(head);
		
		//operations.weavingLinkedList(head);
		
		//operations.reorderList(head);
		
		//head = operations.reverseList(head);
		
		//head = operations.reverseBetween(head, 3, 5);
		
		//head = operations.rotateRight(head, 3);
		
		head = operations.partition(head, 3);
		
		operations.displayLinkedList(head);
		
	}

}
