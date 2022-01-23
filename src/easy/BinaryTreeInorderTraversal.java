package easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

	static List<Integer> inorder = new ArrayList<>();
	
	public static void main(String[] args) {
		
		//TreeNode node1 = new TreeNode(1,new TreeNode(2),new TreeNode(3));
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		node2.left = new TreeNode(3);
		node1.right = node2;
		System.out.println(inorderTraversal(new TreeNode(1)));
	}
	
	public static List<Integer> inorderTraversal(TreeNode root) {
        
		if(root != null) {
			inorderTraversal(root.left);
			inorder.add(root.val);
			inorderTraversal(root.right);
		}
		return inorder;
    }
}
