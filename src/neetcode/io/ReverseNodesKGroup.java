package neetcode.io;

import easy.ListNode;

public class ReverseNodesKGroup {

	// Input: head = [1,2,3,4,5], k = 3
	// Output: [3,2,1,4,5]
	public static ListNode reverseKGroup(ListNode head, int k) {
		// edge cases
		// if head is null or single node or not enough group size is 1
		// return head nothing to reverse

		if (head == null || head.next == null || k == 1)
			return head;

		ListNode start = head, end = head;

		// find the kth node.
		int increment = k - 1;

		while (increment != 0) {
			end = end.next;
			// not enough nodes for K. return the entire list
			if (end == null)
				return head;

			increment -= 1;
		}

		ListNode nextHead = reverseKGroup(end.next, k);
		reverse(start, end);
		start.next = nextHead;
		return end;
	}

	private static void reverse(ListNode start, ListNode end) {
		ListNode current = start, prev = null, temp = null;

		while (prev != end) {
			temp = current.next;
			current.next = prev;
			prev = current;
			current = temp;
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

		ListNode result = reverseKGroup(node1, 2);

		while (result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}
	}
}
