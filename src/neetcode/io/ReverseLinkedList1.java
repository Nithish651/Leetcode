package neetcode.io;

import easy.ListNode;

public class ReverseLinkedList1 {

	public static ListNode reverseList(ListNode head) {
		if (head == null)
			return null;

		ListNode current = head;
		ListNode prev = null;
		ListNode temp = null;

		while (current != null) {
			temp = current.next; // saving next to not lose tne list after setting prev;
			current.next = prev; // changing the link direction to previous node
			prev = current; // making current as the previous node to be linked in next iteration
			current = temp; // moving to the next node
		}

		return prev;
	}

	public static ListNode reverseListRecursive(ListNode head) {
		
		if(head == null)
			return null;

		if (head.next == null)  // finding the last node in the list which is the new head after reversing
			return head; 		//base case

		ListNode newHead = reverseListRecursive(head.next); // moving the head through the list till finding last node

		head.next.next = head; // reversing the connection ex: 4 -> 5 becomes 5->4 4 is head
		head.next = null;
		return newHead;
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;

		//ListNode result = reverseList(node1);
		 ListNode result = reverseListRecursive(node1);

		while (result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}
	}

}
