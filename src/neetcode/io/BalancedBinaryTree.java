package neetcode.io;

import easy.TreeNode;

public class BalancedBinaryTree {
	
	public static void main(String[] args) {
		TreeNode node3 = new TreeNode(3);
		TreeNode node9 = new TreeNode(9);
		TreeNode node20 = new TreeNode(20);
		TreeNode node15 = new TreeNode(15);
		TreeNode node7 = new TreeNode(7);
		
		node20.left = node15;
		node20.right = node7;
		node3.left = node9;
		node3.right = node20;
		
		System.out.println(isBalanced(node3));
	}
	
	
	 public static  boolean isBalanced(TreeNode root) {
		 
		 if(root == null)
			 return true;
	        
		 return Math.abs(calculateHeight(root.left) - calculateHeight(root.right)) <= 1 
				 	&& isBalanced(root.left) && isBalanced(root.right);
		 
	 }


	private static int calculateHeight(TreeNode root) {
		if(root == null)
			return 0;
		
		return 1+Math.max(calculateHeight(root.left), calculateHeight(root.right));
	}

}
