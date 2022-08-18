package neetcode.io;

import easy.ListNode;

public class MergeKSortedList {
	
	
    public static ListNode mergeKLists(ListNode[] lists) {
    	
    	if(lists == null)
    		return null;
    	
        if(lists.length == 0)
        	return null;
        
        if(lists.length == 1)
        	return lists[0];
        
        ListNode mergedHead = null;
        
        for(int i = 0; i < lists.length; i++) {
        	mergedHead = mergeLists(mergedHead,lists[i]);
        }
        
        return mergedHead;
        
    }
    
    
	private static ListNode mergeLists(ListNode head1, ListNode head2) {
		ListNode p1 = head1;
		ListNode p2 = head2;
		ListNode dummy = new ListNode(0);
		ListNode current = dummy;
		
		while(p1 != null && p2 != null) {
			if(p1.val <= p2.val) {
				current.next = p1;
				p1 = p1.next;
			}else {
				current.next = p2;
				p2 = p2.next;
			}
			current = current.next;
		}
		
		current.next = p1 == null ? p2 : p1;
		return dummy.next;
	}


	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		
		node4.next = node5;
		node1.next = node4;
		
		ListNode node13 = new ListNode(1);
		ListNode node14 = new ListNode(3);
		ListNode node15 = new ListNode(4);
		
		node14.next = node15;
		node13.next = node14;
		
		ListNode node22 = new ListNode(2);
		ListNode node24= new ListNode(6);
		
		node22.next = node24;
		
		ListNode [] arr = new ListNode[3];
		arr[0] = node1;
		arr[1] = node13;
		arr[2] = node22;

		ListNode result = mergeKLists(null);
		
		while(result != null) {
			System.out.print(result.val+" ");
			result = result.next;
		}
	}

}
