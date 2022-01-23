package easy;

public class RemoveDuplicatesFromSortedList {

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(1);
		ListNode node3 = new ListNode(2);
		ListNode node4 = new ListNode(3);
		ListNode node5 = new ListNode(3);
		
		node4.next = node5;
		node3.next = node4;
		node2.next = node3;
		node1.next = node2;
		
		ListNode withoutDuplicates = deleteDuplicates(null);
		while(withoutDuplicates != null) {
			System.out.print(withoutDuplicates.val+" ");
			withoutDuplicates = withoutDuplicates.next;
		}
	}
	
	public static ListNode deleteDuplicates(ListNode head) {

		ListNode curr = head;
		
		if(curr == null || curr.next == null)
			return curr;
		

		ListNode prev = curr;
		curr = curr.next;

		while (curr != null) {
			if (prev.val == curr.val) {
				prev.next = curr.next;
				curr = curr.next;
			} else {
				prev = curr;
				curr = curr.next;
			}
		}

		return head;
	}
}
