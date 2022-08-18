package neetcode.io;

import easy.TreeNode;

public class MaxDepthOfBinaryTree {

	public static int maxDepth(TreeNode root) {
		if (root == null)
			return 0;

		int leftDepth = root.left != null ? maxDepth(root.left) : 0;
		int rightDepth = root.right != null ? maxDepth(root.right) : 0;
		return 1 + Math.max(leftDepth, rightDepth);
	}

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(3);
		TreeNode node2 = new TreeNode(9);
		TreeNode node3 = new TreeNode(20);
		TreeNode node4 = new TreeNode(15);
		TreeNode node5 = new TreeNode(7);

		node3.left = node4;
		node3.right = node5;

		node1.left = node2;
		node1.right = node3;

		System.out.println(maxDepth(node1));

	}

}
