package neetcode.io;

import java.util.ArrayList;
import java.util.List;

import easy.TreeNode;

public class KthSmallestInBST {
	
	
    public static int kthSmallest(TreeNode root, int k) {
    	List<Integer> list = new ArrayList<>();
    	inOrder(root,list);
    	return list.get(k-1);
    }	



	private static void inOrder(TreeNode node, List<Integer> list) {
		if(node == null)
			return;
		
		if(node.left != null)
			inOrder(node.left,list);
		
		list.add(node.val);
		
		if(node.right != null)
			inOrder(node.right,list);
		
	}



	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		
		node3.left = node1;
		node3.right = node4;
		
		node1.right = node2;
		
		System.out.println(kthSmallest(node3, 1));
	}
}
