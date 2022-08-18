package neetcode.io;

import easy.TreeNode;

public class BalancedBinaryTreeII {

	public static boolean isBalanced(TreeNode root) {
		if (root == null)
			return true;

		return findHeight(root) != -1;
	}

	private static int findHeight(TreeNode node) {
		if (node == null)
			return 0;

		int leftHeight = node.left == null ? 0 : findHeight(node.left);
		if (leftHeight == -1)
			return -1;
		int rightHeight = node.right == null ? 0 : findHeight(node.right);
		if (rightHeight == -1)
			return -1;
		if (Math.abs(leftHeight - rightHeight) > 1)
			return -1;
		return 1 + Math.max(leftHeight, rightHeight);
	}

	public static void main(String[] args) {

	}
}
