package neetcode.io;

import easy.TreeNode;

public class SubtreeOfAnotherTree {
	
	
    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
    	
   	
    	if(subRoot == null)
    		return true;
    	
    	if(root == null)
    		return false;
    	
    	if(isSameTree(root,subRoot))
    		return true;
    	
    	return isSubtree(root.left, subRoot) || isSubtree(root.right,subRoot);
        
    }
	
	private static boolean isSameTree(TreeNode p, TreeNode q) {
		if(p == null && q == null)
			return true;
		
		if(p == null || q == null || p.val != q.val)
			return false;
		
		return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
	}

	public static void main(String[] args) {
		
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(3);
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

		
		System.out.println(isSubtree(node1, node1a));
		
	}

}
