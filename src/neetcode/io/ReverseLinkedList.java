package neetcode.io;

import easy.ListNode;

public class ReverseLinkedList {

	public static ListNode reverseList(ListNode head) {

		if (head == null)
			return null;

		ListNode prev = null;
		ListNode current = head;
		ListNode temp = null;

		while (current != null) {
			temp = current.next;
			current.next = prev;
			prev = current;
			current = temp;
		}

		return prev;
	}

	public static ListNode reverseListRecursion(ListNode head) {

		if (head == null)
			return head;

		if (head.next == null)
			return head;

		ListNode newHead = reverseListRecursion(head.next);

		head.next.next = head;
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
		ListNode result = reverseListRecursion(node1);

		while (result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}
	}
}
