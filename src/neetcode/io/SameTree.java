package neetcode.io;

import easy.TreeNode;

public class SameTree {

	
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        
    	if(p == null && q == null)
    		return true;
    	
    	if(p == null || q == null || q.val != p.val)
    		return false;
    	
    	return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
	
	
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(6);
		
		node1.left = node2;
		//node1.right = node3;
		
		TreeNode node1a = new TreeNode(1);
		TreeNode node2a = new TreeNode(2);
		TreeNode node3a = new TreeNode(3);
		
		//node1a.left = node2a;
		node1a.right = node3a;
		
		System.out.println(isSameTree(node1,node1a));
	}
}
