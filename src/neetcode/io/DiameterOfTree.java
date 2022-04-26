package neetcode.io;

import easy.TreeNode;

public class DiameterOfTree {

	static int maxDiameter = 0;

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		TreeNode node8 = new TreeNode(8);
		
		node5.left = node7;
		node3.left = node5;
		node2.left = node3;
		
		node6.right = node8;
		node4.right = node6;
		node2.right = node4;
		
		node1.right = node2;
		
		System.out.println(diameterOfBinaryTree(node1));

	}

	public static int diameterOfBinaryTree(TreeNode root) {

		if (root == null)
			return 0;

		calculateHeight(root);
		return maxDiameter;

	}

	private static int calculateHeight(TreeNode root) {

		if (root == null)
			return 0;

		int left = calculateHeight(root.left);
		int right = calculateHeight(root.right);

		maxDiameter = Math.max(maxDiameter, left + right);
		return 1 + Math.max(left, right);
	}

}
