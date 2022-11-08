package neetcode.io;

import easy.TreeNode;

public class CountGoodNodes {

    public static int goodNodes(TreeNode root) {
        int [] counter = new int[1];
        countGoodNodes(root,counter,Integer.MIN_VALUE);
        return counter[0];
    }
	
	private static void countGoodNodes(TreeNode node, int[] counter, int maxNodeValue) {
		if(node == null)
			return;
		
		if(node.val >= maxNodeValue)
			counter[0]++;
		
		maxNodeValue = Math.max(node.val, maxNodeValue);
		
		if(node.left != null)
			countGoodNodes(node.left,counter,maxNodeValue);
		
		if(node.right != null)
			countGoodNodes(node.right,counter,maxNodeValue);
	}

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(3);
		TreeNode node2 = new TreeNode(1);
		TreeNode node3 = new TreeNode(4);
		TreeNode node4 = new TreeNode(3);
		TreeNode node5 = new TreeNode(1);
		TreeNode node6 = new TreeNode(5);
		
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node3.left = node5;
		node3.right = node6;
		
		System.out.println(goodNodes(node1));
	}
}
