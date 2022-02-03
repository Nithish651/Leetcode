package studyplan.algorithm1;

import easy.ListNode;

public class MiddleOfLinkedList {

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
		
		System.out.println(middleNode(head).val);
		System.out.println(nthNode(head, 1).val);
	}

	public static ListNode middleNode(ListNode head) {

		if(head == null)
			return null;
		
		ListNode slowPointer = head;
		ListNode fastPointer = head;

		while (fastPointer != null && fastPointer.getNext() != null) {
			slowPointer = slowPointer.getNext();
			fastPointer = fastPointer.getNext().getNext();
		}

		return slowPointer;
	}
	
	public static ListNode nthNode(ListNode head, int position) {
		
		if(head == null)
			return null;
		
		ListNode slowPointer = head;
		ListNode fastPointer = head;
		

		
		int counter = 0;
		
		while(counter < position) {
			fastPointer = fastPointer.next;
			counter++;
		}
		
		while(fastPointer != null) {
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next;
		}
		
		return slowPointer;
	}

}
