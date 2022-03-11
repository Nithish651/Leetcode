package easy;

public class IntersectionOfLinkedLists {

	public static void main(String[] args) {
		
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
		ListNode node7 = new ListNode(7);
		ListNode node8 = new ListNode(8);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		//node8.next = node3;
		
		
		System.out.println( );
		
	}
	
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		ListNode p1 = headA;
		ListNode p2 = headB;

		while (p1 != p2) {
			p1 = p1 != null ? p1.next : headB;
			p2 = p2 != null ? p2.next : headA;
		}
		return p1;
	}
	
}
