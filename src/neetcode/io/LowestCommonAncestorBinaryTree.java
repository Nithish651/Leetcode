package neetcode.io;

import easy.TreeNode;

public class LowestCommonAncestorBinaryTree {
	
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		
		if(root == null || root.val == p.val || root.val == q.val)
			return root;
		
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);
		
		if(left == null)
			return right;
		else if(right == null)
			return left;
		else
			return root;
	}
	
	
	public static void main(String[] args) {
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node10 = new TreeNode(10);
		
		node4.left = node5;
		node5.right = node10;
		node4.right = node6;
		
		System.out.println(lowestCommonAncestor(node4, node5, node6).val);
	}

}
