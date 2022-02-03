package easy;

public class MergeTwoSortedLists {
	
	
	 public static void main(String[] args) {
		ListNode list1 = new ListNode(1);
		list1.setNext(new ListNode(2));
		list1.next.setNext(new ListNode(4));
		
		ListNode list2 = new ListNode(1);
		list2.setNext(new ListNode(3));
		list2.next.setNext(new ListNode(4));
		
		ListNode merged = mergeTwoLists(list1,list2);
		
		while(merged != null) {
			System.out.print(merged.val+" ");
			merged = merged.getNext();
		}
	}
	
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if(list1 == null)
			return list2;
		
		if(list2 == null)
			return list1;
		
		if(list1.val < list2.val) {
			list1.setNext(mergeTwoLists(list1.getNext(), list2));
			return list1;
		}else {
			list2.setNext(mergeTwoLists(list1, list2.getNext()));
			return list2;
		}
	}

}

