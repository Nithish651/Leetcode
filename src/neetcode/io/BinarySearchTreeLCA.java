package neetcode.io;

import easy.TreeNode;

public class BinarySearchTreeLCA {

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
        	return root;
        
        if(root.val > p.val && root.val > q.val)
        	return lowestCommonAncestor(root.left, p, q);
        
        if(root.val < p.val && root.val < q.val)
        	return lowestCommonAncestor(root.right,p,q);
        
        return root;
    }
	
	public static void main(String[] args) {
		
	}
	
}
