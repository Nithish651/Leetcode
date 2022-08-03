package neetcode.io;

import easy.ListNode;

public class ReorderList {

	public static void reorderList(ListNode head) {
		//finding the mid of the linked list.
		ListNode slow = head, fast = head;
		
		while(slow !=null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		ListNode second = slow.next, temp = null, prev = null;
		slow.next = null;
		
		//reversing the list in the second half
		while(second != null) {
			temp = second.next;
			second.next = prev;
			prev = second;
			second = temp;
		}
		
		//merge first and second half alternatively
		second = prev;
		ListNode first = head,temp1 = null,temp2 = null;
		
		//second list is going to be shorter or equal
		while(second != null) {
			temp1 = first.next;
			temp2 = second.next;
			first.next = second;
			second.next = temp1;
			first = temp1;
			second = temp2;
		}
		
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		
		node4.next = node5;
		node3.next = node4;
		node2.next = node3;
		node1.next = node2;
		
		
		reorderList(node1);
		
		ListNode result = node1;
		
		while(result != null) {
			System.out.print(result.val+ " ");
			result = result.next;
		}
	}

}
