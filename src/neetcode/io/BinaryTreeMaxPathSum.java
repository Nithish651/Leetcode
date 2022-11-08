package neetcode.io;

import easy.TreeNode;

public class BinaryTreeMaxPathSum {

    public static int maxPathSum(TreeNode root) {
        int [] max = new int[1];
        max[0] = Integer.MIN_VALUE;
    	maxPathSum(root,max);
    	return max[0];
    }

	private static int maxPathSum(TreeNode node, int[] max) {
		
		if(node == null)
			return 0;
		
		//avoiding negative sum to maximize the result
		int left = Math.max(0, maxPathSum(node.left,max));
		int right = Math.max(0,maxPathSum(node.right,max));
		
		max[0] = Math.max(max[0], node.val + left + right);
		return node.val + Math.max(left, right); 
	}
	
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(20);
		TreeNode node2 = new TreeNode(15);
		TreeNode node3 = new TreeNode(7);
		
		node1.left = node2;
		node1.right = node3;
		
		TreeNode node4 = new TreeNode(-10);
		TreeNode node5 = new TreeNode(9);
		
		node4.left = node5;
		node4.right = node1;
		
		System.out.println(maxPathSum(node4));
	}
}
