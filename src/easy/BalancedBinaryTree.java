package easy;

public class BalancedBinaryTree {
	
	public static void main(String[] args) {
		TreeNode node3 = new TreeNode(3);
		TreeNode node9 = new TreeNode(9);
		TreeNode node20 = new TreeNode(20);
		TreeNode node15 = new TreeNode(15);
		TreeNode node7 = new TreeNode(7);
		node20.left = node15;
		node20.right = node7;
		node3.right = node20;
		node3.left = node9;
		
		
		TreeNode node1 = new TreeNode(1);
		TreeNode node21 = new TreeNode(2);
		TreeNode node22 = new TreeNode(2);
		TreeNode node31 = new TreeNode(3);
		TreeNode node32 = new TreeNode(3);
		TreeNode node41 = new TreeNode(4);
		TreeNode node42 = new TreeNode(4);
		
		node31.left = node41;
		node31.right = node42;
		node21.left = node31;
		node21.right = node32;
		node1.left = node21;
		node1.right = node22;
		
		//System.out.println(isBalanced(node1));		
		//System.out.println(isBalanced(node3));
		//System.out.println(isBalanced(null));
	}
	
	
    public static boolean isBalanced(TreeNode root) {
    	if(root == null)
    		return true;
    	
    	int leftSubTreeHeight = 0;
    	int rightSubTreeHeight = 0;
    	
    	if (root.left != null) 
    		leftSubTreeHeight = calculateHeight(root.left);
    	
    	if (root.right != null) 
    		 rightSubTreeHeight = calculateHeight(root.right);
    	

    	System.out.println(leftSubTreeHeight+" "+rightSubTreeHeight);
    	
    	//check for the root node and all the other nodes
    	return Math.abs(leftSubTreeHeight - rightSubTreeHeight) <= 1
    			&& isBalanced(root.left)
    			&& isBalanced(root.right);
    	
    }
    
    
    
    public static int calculateHeight(TreeNode node) {
    	
    	if(node == null)
    		return 0;
    	
    	return 1 + Math.max( calculateHeight(node.left), calculateHeight(node.right));
    	
    }
	

}
