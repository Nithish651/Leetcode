package easy;

public class RemoveDuplicatesFromSortedList {

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(1);
		ListNode node3 = new ListNode(2);
		ListNode node4 = new ListNode(3);
		ListNode node5 = new ListNode(3);
		
		node4.setNext(node5);
		node3.setNext(node4);
		node2.setNext(node3);
		node1.setNext(node2);
		
		ListNode withoutDuplicates = deleteDuplicates(null);
		while(withoutDuplicates != null) {
			System.out.print(withoutDuplicates.val+" ");
			withoutDuplicates = withoutDuplicates.getNext();
		}
	}
	
	public static ListNode deleteDuplicates(ListNode head) {

		ListNode curr = head;
		
		if(curr == null || curr.getNext() == null)
			return curr;
		

		ListNode prev = curr;
		curr = curr.getNext();

		while (curr != null) {
			if (prev.val == curr.val) {
				prev.setNext(curr.getNext());
				curr = curr.getNext();
			} else {
				prev = curr;
				curr = curr.getNext();
			}
		}

		return head;
	}
}
