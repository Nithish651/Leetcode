package neetcode.io;

import easy.TreeNode;

public class LOwestCommonAncestorBinarySearchTree {
	
	
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    	
    	if(root == null)
    		return null;
    	
    	if(p.val < root.val && q.val < root.val)
    		return lowestCommonAncestor(root.left,p,q);
    	else if(p.val > root.val && q.val > root.val)
    		return lowestCommonAncestor(root.right,p,q);
    	else    	
    		return root;
    }
	
	public static void main(String[] args) {
		
		TreeNode node6 = new TreeNode(6);
		TreeNode node2 = new TreeNode(2);
		TreeNode node8 = new TreeNode(8);
		TreeNode node0 = new TreeNode(0);
		TreeNode node4 = new TreeNode(4);
		TreeNode node3 = new TreeNode(3);
		TreeNode node5 = new TreeNode(5);
		TreeNode node7 = new TreeNode(7);
		TreeNode node9 = new TreeNode(9);
		
		node4.left = node3;
		node4.right = node5;
		node2.left = node0;
		node2.right = node4;
		node8.left = node7;
		node8.right = node9;
		node6.left = node2;
		node6.right = node8;
		
		System.out.println(lowestCommonAncestor(node6,node2,node4));
	}

}
