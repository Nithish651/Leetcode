package neetcode.io;

import easy.ListNode;
import easy.MergeTwoSortedLists;

public class MergeSortedLinkedLists {
	//list1 = [1,2,3] //list2 = [1,2];
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		if (list1 == null)
			return list2;

		if (list2 == null)
			return list1;

		ListNode dummy = new ListNode();
		ListNode current = dummy;

		while (list1 != null && list2 != null) {
			if (list1.val <= list2.val) {
				current.next = list1;
				list1 = list1.next;
			} else {
				current.next = list2;
				list2 = list2.next;
			}
			current = current.next;
		}

		current.next = (list1 == null) ? list2 : list1;
		return dummy.next;
	}
	
	
	public static ListNode mergeTwoListsRecursive(ListNode list1, ListNode list2) {

		if (list1 == null)
			return list2;

		if (list2 == null)
			return list1;

		if (list1.val <= list2.val) {
			list1.next = mergeTwoListsRecursive(list1.next, list2);
			return list1;
		} else {
			list2.next = mergeTwoListsRecursive(list1, list2.next);
			return list2;
		}

	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l11 = new ListNode(1);
		ListNode l12 = new ListNode(2);
		ListNode l13 = new ListNode(3);
		
		l1.next = l2;
		
		l11.next = l12;
		l12.next = l13;
		
		//ListNode result = mergeTwoLists(null, null);
		ListNode result = mergeTwoListsRecursive(l1, l11);

		while(result != null) {
			System.out.print(result.val+" ");
			result = result.next;
		}
		
	}
}
