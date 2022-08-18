package neetcode.io;

import easy.ListNode;

public class ReverseNodesKGroupII {

	public static ListNode reverseKGroup(ListNode head, int k) {

		if (head == null || head.next == null || k == 1)
			return head;

		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode beforeStart = dummy, end = head, start = null, temp = null;
		int i = 1;

		while (end != null) {
			// group of K has been reached
			if (i % k == 0) {
				// reverse the nodes.
				start = beforeStart.next;
				temp = end.next;
				reverse(start, end);
				beforeStart.next = end;
				start.next = temp;
				beforeStart = start;
				end = temp;
			} else {
				end = end.next;
			}

			i++;
		}
		return dummy.next;
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
