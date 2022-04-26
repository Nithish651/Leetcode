package neetcode.io;

import easy.TreeNode;

public class InvertBinaryTree {

	
	public static void preOrderTraversal(TreeNode root) {
		if(root != null) {
			System.out.print(root.val+" ");
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}
	
	public static TreeNode invertTree(TreeNode root) {
		if (root == null)
			return root;

		TreeNode temp = root.right;
		root.right = root.left;
		root.left = temp;

		invertTree(root.left);
		invertTree(root.right);

		return root;
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6); 	
		TreeNode node7 = new TreeNode(7);
		TreeNode node9 = new TreeNode(9); 	
		TreeNode node1 = new TreeNode(1);
		
		node7.left = node6;
		node7.right = node9;
		
		node2.left = node1;
		node2.right = node3;
		
		root.left = node2;
		root.right = node7;
		
		preOrderTraversal(root);
		System.out.println();
		preOrderTraversal(invertTree(root));
		
	}
}
