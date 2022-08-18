package neetcode.io;

import easy.TreeNode;

public class BinaryTreeLCA {

	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		// base case
		if (root == null || root.val == p.val || root.val == q.val)
			return root;

		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);

		if (left == null)
			return right;
		else if (right == null)
			return left;
		else
			return root;

	}

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		
		node4.left = node1;
		node4.right = node2;
		
		node3.left = node4;
		node3.right = node5;
		
		System.out.println(lowestCommonAncestor(null, node2, node5));
	}
}
