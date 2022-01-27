package easy;

public class ArrayToBinarySearchTree {
	
	public static void main(String[] args) {
		
		int [] arr = {-10,-3,0,5,9};
		TreeNode root = sortedArrayToBST(arr);
		
		preOrder(root);
		
	}
	
    private static void preOrder(TreeNode root) {
    	if(root == null)
    		return;
    	
		System.out.println(root.val);
		preOrder(root.left);
		preOrder(root.right);
	}

	public static TreeNode sortedArrayToBST(int[] nums) {
    	if(nums.length == 0)
    		return null;
    	
    	return constructTree(nums, 0 , nums.length - 1);
    }

	private static TreeNode constructTree(int[] nums, int left, int right) {
		
		if(left > right)
			return null;
		
		int mid = left + (right - left)/2;
		
		TreeNode root = new TreeNode(nums[mid]);
		root.left = constructTree(nums, left, mid - 1);
		root.right = constructTree(nums, mid + 1, right);
		return root;
	}

}
