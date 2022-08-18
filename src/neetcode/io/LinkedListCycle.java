package neetcode.io;

import easy.ListNode;

public class LinkedListCycle {

	public static boolean hasCycle(ListNode head) {
    	ListNode slow = head, fast = head;
    	
    	while(slow != null && fast != null && fast.next != null) {
    		slow = slow.next;
    		fast = fast.next.next;
    		
    		if(slow == fast)
    			return true;
    	}
    	
        return false;
    }

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(1);
		ListNode node3 = new ListNode(1);
		ListNode node4 = new ListNode(1);
		
		//node4.next = node1;
		
		node3.next = node4;
		node2.next = node3;
		node1.next = node4;
		
		System.out.println(hasCycle(new ListNode(7)));
	}

}
