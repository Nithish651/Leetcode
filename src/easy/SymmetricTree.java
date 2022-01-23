package easy;

public class SymmetricTree {

	
	public static void main(String[] args) {
		TreeNode tree1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node21 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node31 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node41 = new TreeNode(4);

			node2.left = node3;
			node2.right = node4;
			
			node21.left = node41;
			node21.right = node31;
			
			tree1.left = node2;
			tree1.right = node21;
			
			System.out.println(isSymmetric(tree1));
	}
	
	
    public static boolean isSymmetric(TreeNode root) {
    	
        return checkSymmetry(root.left, root.right);
    }
    
    public static boolean checkSymmetry(TreeNode p, TreeNode q) {
    	
    	if(p == null && q == null)
    		return true;
    	
    	if(p == null || q == null)
    		return false;
    	
    	if(p.val == q.val)
    		return checkSymmetry(p.left, q.right) && checkSymmetry(p.right, q.left);
    	
    	return false;
    	
    }
}
