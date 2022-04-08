package easy;

public class RemoveLinkedLlistElements {

	public static ListNode removeElements(ListNode head, int val) {
		
		if(head == null)
			return null;
		
		while(head != null && head.val == val) {
			head = head.next;
		}
		
		ListNode current = head;
		ListNode prev = null;
		
		while(current != null) {
			if(current.val == val) {
				prev.next = current.next;
			}else {
				prev = current;
			}
			current = current.next;
		}
		
		return head;
	}

	public static void main(String[] args) {

		ListNode head = new ListNode(1);
		ListNode node2 = new ListNode(1);
		ListNode node6 = new ListNode(1);
		ListNode node3 = new ListNode(1);

		node2.next = node6;
		node6.next = node3;
		head.next = node2;

		ListNode result = removeElements(head, 1);

		while (result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}

	}

}
