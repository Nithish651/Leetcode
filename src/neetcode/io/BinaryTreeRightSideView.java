package neetcode.io;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import easy.TreeNode;

public class BinaryTreeRightSideView {

	public static List<Integer> rightSideView(TreeNode root) {

		List<Integer> result = new ArrayList<>();
		if (root == null)
			return result;

		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			int size = queue.size();
			TreeNode node = null;
			for (int i = 0; i < size; i++) {
				node = queue.poll();
				if (node.left != null)
					queue.offer(node.left);
				if (node.right != null)
					queue.offer(node.right);
			}
			result.add(node.val);
		}

		return result;

	}
	
	public static List<Integer> rightSideViewII(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		addRightNodes(root,result,0);
		return result;
	}

	private static void addRightNodes(TreeNode node, List<Integer> result, int level) {
			if(node == null)
				return;
			
			if(result.size() == level)
				result.add(node.val);
		
			addRightNodes(node.right, result,level+1);
			addRightNodes(node.left,result,level+1);
			
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

		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);

		n1.left = n2;
		
		TreeNode p1 = new TreeNode(1);
		TreeNode p2 = new TreeNode(2);
		TreeNode p3 = new TreeNode(3);
		TreeNode p4 = new TreeNode(4);
		
		p1.left = p2;
		p1.right = p3;
		p2.left = p4;
		
		System.out.println(rightSideView(p1));
		System.out.println(rightSideViewII(p1));
	}
}
