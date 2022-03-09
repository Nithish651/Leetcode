package easy;

public class LinkedListCycle {

	public static void main(String[] args) {

		ListNode node3 = new ListNode(3);
		ListNode node2 = new ListNode(2);
		ListNode node0 = new ListNode(0);
		ListNode node4 = new ListNode(4);

		System.out.println(hasCycle(node0));
		node3.next = node2;
		node2.next = node0;
		node0.next = node4;
		node4.next = node2;

		

		
		

	}

	public static  boolean hasCycle(ListNode head) {

		if (head == null)
			return false;

		ListNode slow = head;
		ListNode fast = head;

		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (fast == slow)
				return true;
		}

		return false;

	}

}
