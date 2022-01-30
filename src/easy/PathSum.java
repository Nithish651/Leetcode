package easy;

public class PathSum {
	
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		node1.left = node2;
		//node1.right = node3;
		
		System.out.println(hasPathSum(node1,1));
	}
	
	public static boolean hasPathSum(TreeNode root, int targetSum) {
		
		if(root == null)
			return false;
				
		int currentSum = targetSum - root.val;
		
		if(currentSum == 0 && root.left == null && root.right == null)
				return true;
		
		return hasPathSum(root.left, currentSum) || hasPathSum(root.right,currentSum);

    }

	
}
