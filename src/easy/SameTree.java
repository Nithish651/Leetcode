package easy;

public class SameTree {
	
	public static void main(String[] args) {
		
		TreeNode tree1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
	
		
		TreeNode tree2 = new TreeNode(1);
		TreeNode node21 = new TreeNode(2);
		TreeNode node22 = new TreeNode(3);TreeNode node23 = new TreeNode(4);
		
		tree2.left = node21;
		tree2.right = node22;
		
		tree1.left = node2;
		tree1.right = node3;
		
		System.out.println(isSameTree(tree1,tree2));
	}
	
public static  boolean isSameTree(TreeNode p, TreeNode q) {
    
	if(p == null && q == null)
		return true;
	
	if(p == null || q == null)
		return false;
	
	if(p.val == q.val)
		return isSameTree(p.left,q.left) && isSameTree(p.right,q.right) ;
	
	return false;
}

}
