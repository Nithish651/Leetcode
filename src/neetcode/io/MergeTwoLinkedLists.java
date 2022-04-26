package neetcode.io;

import easy.ListNode;

public class MergeTwoLinkedLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
    	ListNode dummy = new ListNode();
    	ListNode current = dummy;
    	
    	while(list1 != null && list2 != null) {
    		if(list1.val < list2.val) {
    			current.next = list1;
    			list1 = list1.next;
    		}else {
    			current.next = list2;
    			list2 = list2.next;
    		}
    		current = current.next;
    	}
    	
    	if(list1 != null) {
    		current.next = list1;
    	}else if(list2 != null) {
    		current.next = list2;
    	}
    	
    	return dummy.next;
    }
    
    
 public static ListNode mergeTwoListsRecursive(ListNode list1, ListNode list2) {
	 
	 if(list1 == null)
		 return list2;
	 
	 if(list2 == null)
		 return list1;
	 
	 if(list1.val < list2.val) {
		 list1.next = mergeTwoListsRecursive(list1.next, list2);
		 return list1;
	 }else {
		 list2.next = mergeTwoListsRecursive(list1,list2.next);
		 return list2;
	 }
	 
 }
	
	
	public static void main(String[] args) {
		ListNode list1 = new ListNode(1); 
		list1.setNext(new ListNode(2));
		list1.next.setNext(new ListNode(4));
		
		ListNode list2 = new ListNode(1);
		list2.setNext(new ListNode(3));
		list2.next.setNext(new ListNode(4));
		
		/*
		 * ListNode result = mergeTwoLists(list1,list2);
		 * 
		 * 
		 * while(result != null) { System.out.print(result.val+" "); result =
		 * result.next; }
		 */
		
		ListNode result2 = mergeTwoListsRecursive(list1,list2);
		while(result2 != null) {
			System.out.print(result2.val+" ");
			result2 = result2.next;
		}
		
	
		
	}
}
