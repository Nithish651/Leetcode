package studyplan.algorithm1;

import easy.ListNode;

public class DeleteNthNode {

	public static void main(String[] args) {

		ListNode head = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
		
		node5.setNext(node6);
		node4.setNext(node5);
		node3.setNext(node4);
		node2.setNext(node3);
		head.setNext(node2);
		
		ListNode afterDelete = removeNthFromEnd(head,5);
		
		while(afterDelete != null) {
			System.out.print(afterDelete.val+" ");
			afterDelete = afterDelete.next;
		}
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {

		if(head == null)
			return null;
		
		if(head.next == null && n==1)
			return null;

		
		ListNode slowPointer = head;
		ListNode fastPointer = head;
		ListNode prev = null;

		int counter = 1;

		while (counter < n) {
			fastPointer = fastPointer.next;
			counter++;
		}

		while (fastPointer.next != null && slowPointer.next != null) {
			fastPointer = fastPointer.next;
			prev = slowPointer;
			slowPointer = slowPointer.next;
		}
		
		if(prev != null)
			prev.next = slowPointer.next;
		else
			head = head.next;

		return head;
	}

}
