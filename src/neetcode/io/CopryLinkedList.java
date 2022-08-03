package neetcode.io;

import easy.ListNode;

public class CopryLinkedList {


	//1-> 2 ->n 
    public static Node copyRandomList(Node head) {
        if(head == null)
        	return null;
        
        //step 1 : copy all the nodes and insert next to the original node
        Node current = head,front = null;
        
        while(current != null) {
        	front = current.next;
        	Node copyNode = new Node(current.val);
        	current.next = copyNode;
        	copyNode.next = front;
        	current = front;
        }
        
        //step2 : form the links to the random nodes;
        //1 1 2 2 3 3 4 4 5 5 
        
        current = head;
        
		while (current != null) {
			if (current.random != null) {
				current.next.random = current.random.next;
			}
			current = current.next.next;
		}
		
		//step 3:extract the newly created list from the merged list
		Node dummy = new Node(0);
		Node currentCopy = dummy;
		current = head; front = null;
		
		while(current != null) {
			front = current.next.next;
			currentCopy.next = current.next;
			current.next = front;
			current = front;
			currentCopy = currentCopy.next;
		}
		

        return dummy.next;
    }
    
    public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);

		node4.next = node5;
		node3.next = node4;
		node2.next = node3;

		node1.next = node2;
		node1.random = node2;
		
		Node result = copyRandomList(node1);
		
		while(result != null) {
			System.out.print(result+" ");
			result = result.next;
		}
	}
}
