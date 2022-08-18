package neetcode.io;

import easy.ListNode;

public class AddTwoNumbers {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode dummy = new ListNode(0);
		ListNode current = dummy;
		int carry = 0, sum = 0, rem = 0;

		while (l1 != null || l2 != null) {
			
			sum = 0;
			
			if(l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}
			
			if(l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}

			sum += carry;
			rem = sum % 10;
			carry = sum / 10;

			ListNode node = new ListNode(rem);
			current.next = node;
			current = current.next;

		}

		if (carry > 0) {
			ListNode last = new ListNode(carry);
			current.next = last;
		}

		return dummy.next;
	}

	public static void main(String[] args) {
		ListNode node1 = new ListNode(0);
		ListNode node2 = new ListNode(0);
		ListNode node3 = new ListNode(0);
		
		node2.next = node3;
		node1.next = node2;
		
		ListNode node11 = new ListNode(0);
		ListNode node12 = new ListNode(0);
		
		node11.next = node12;
		
		ListNode result = addTwoNumbers(node1, node11);
		
		while(result != null) {
			System.out.print(result.val+" ");
			result = result.next;
		}
	}
}
