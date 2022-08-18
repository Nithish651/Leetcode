package neetcode.io;

import easy.TreeNode;

public class SameTreeII {

	public boolean isSameTree(TreeNode p, TreeNode q) {

		if(p == null || q== null)
			return p == q;
		
		return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	}

	public static void main(String[] args) {

	}
}
