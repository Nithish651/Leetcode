package neetcode.io;

import java.util.LinkedList;
import java.util.Queue;

import easy.TreeNode;

public class MaximumDepthOfBinaryTree {

	public static int maxDepth(TreeNode root) {

		if (root == null)
			return 0;

		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}

	public static int maxDepthBFS(TreeNode root) {
		
		if(root == null)
			return 0;
		
		Queue<TreeNode> queue = new LinkedList<>();
		int depth = 0;
		queue.add(root);
		
		while(!queue.isEmpty()){
			for(int i=0; i <queue.size(); i++) {
				TreeNode temp = queue.remove();
				if(temp.left != null)
					queue.add(temp.left);
				
				if(temp.right != null)
					queue.add(temp.right);
			}
			depth+=1;
		}
		
		return depth;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		TreeNode node9 = new TreeNode(9);
		TreeNode node20 = new TreeNode(20);
		TreeNode node15 = new TreeNode(15);
		TreeNode node7 = new TreeNode(7);

		node20.left = node15;
		node20.right = node7;

		root.left = node9;
		root.right = node20;

		System.out.println(maxDepth(root));
		System.out.println(maxDepthBFS(root));

	}

}
