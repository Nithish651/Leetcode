package neetcode.io;

import easy.TreeNode;

public class DiameterOfBinaryTree {
	
	
	
	public static int findHeight(TreeNode node, int []  diameter) {
		if(node == null)
			return 0;

		int leftHeight = node.left == null ? 0 : findHeight(node.left,diameter);
		int rightHeight = node.right == null ? 0 :findHeight(node.right,diameter);
		//calculate the max diameter at each node;
		diameter[0] = Math.max(diameter[0], leftHeight + rightHeight);
		return 1 + Math.max(leftHeight, rightHeight);
	}
	

    public static int diameterOfBinaryTree(TreeNode root) {
    	int [] diameter = new int[1];
    	findHeight(root,diameter);
        return diameter[0];
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
		
		System.out.println(diameterOfBinaryTree(node1));
	}
}
