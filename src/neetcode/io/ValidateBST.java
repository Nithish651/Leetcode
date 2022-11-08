package neetcode.io;

import easy.TreeNode;

public class ValidateBST {

	public static boolean isValidBST(TreeNode root) {
		return checkBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
	}

	private static boolean checkBST(TreeNode node, long minValue, long maxValue) {
		//did not fail at any case.
		if(node == null)
			return true;
					
		if(node.val <= minValue || node.val >= maxValue)
			return false;
		
		return checkBST(node.left, minValue, node.val) && checkBST(node.right, node.val, maxValue);

	}

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(5);
		TreeNode node2 = new TreeNode(4);
		TreeNode node3 = new TreeNode(6);
		TreeNode node4 = new TreeNode(3);
		TreeNode node5 = new TreeNode(7);

		node1.left = node2;
		node1.right = node3;
		node3.left = node4;
		node3.right = node5;

		System.out.println(isValidBST(node1));
	}
}
