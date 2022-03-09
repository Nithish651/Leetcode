package easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreOrderTraversal {

	static List<Integer> preOrder = new ArrayList<>();
	static List<Integer> postOrder = new ArrayList<>();

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);

		node1.right = node2;
		node2.left = node3;

		System.out.println(preorderTraversal(node1));
		System.out.println(postOrderTraversal(node1));

	}

	public static List<Integer> preorderTraversal(TreeNode root) {
		if (root != null) {
			preOrder.add(root.val);
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
		return preOrder;
	}

	public static List<Integer> postOrderTraversal(TreeNode root) {
		if (root != null) {
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			postOrder.add(root.val);
		}
		return postOrder;
	}

}
