package easy;



public class MaxDepthOfBinaryTree {
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		TreeNode node1 = new TreeNode(9);
		TreeNode node2 = new TreeNode(20);
		TreeNode node3 = new TreeNode(15);
		TreeNode node4 = new TreeNode(7);
		
		node2.left = node3;
		node2.right = node4;
		root.left = node1;
		root.right = node2;
		
		System.out.println(maxDepth(root));
	}

	public static int maxDepth(TreeNode root) {
		if (root != null) {
			return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
		}
		return 0;
	}
}
