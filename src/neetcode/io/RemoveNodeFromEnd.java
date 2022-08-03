package neetcode.io;

import easy.ListNode;

public class RemoveNodeFromEnd {

	public static ListNode removeNthFromEnd(ListNode head, int n) {

		if (head == null)
			return null;

		ListNode fast = head, slow = head, prev = null;
		int counter = 1;

		while (counter < n) {
			fast = fast.next;
			counter++;
		}

		// move pointers till the last node
		while (fast.next != null && slow.next != null) {
			fast = fast.next;
			prev = slow;
			slow = slow.next;
		}

		if (prev == null) // case where n == length of the list
			head = head.next;
		else
			prev.next = slow.next;

		return head;

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

		ListNode result = removeNthFromEnd(node1, 2);

		while (result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}
	}

}
