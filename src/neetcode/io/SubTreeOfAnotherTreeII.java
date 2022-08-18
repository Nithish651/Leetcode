package neetcode.io;

import easy.TreeNode;

public class SubTreeOfAnotherTreeII {

	public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
		if (root == null || subRoot == null)
			return root == subRoot;

		if (root.val == subRoot.val) {
			boolean sameTree = isSameTree(root, subRoot);
			if (sameTree)
				return true;
		}

		return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
	}

	private static boolean isSameTree(TreeNode root, TreeNode subRoot) {
		if (root == null || subRoot == null)
			return root == subRoot;

		return root.val == subRoot.val && isSameTree(root.left, subRoot.left) && isSameTree(root.right, subRoot.right);

	}

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(3);
		
		node4.left = node1;
		node4.right = node2;
		
		node3.left = node4;
		node3.right = node5;
		
		
		TreeNode node4a = new TreeNode(4);
		TreeNode node1a = new TreeNode(1);
		TreeNode node2a = new TreeNode(2);


		node4a.left = node1a;
		node4a.right = node2a;

		
		System.out.println(isSubtree(node3, node4a));
	}

}
