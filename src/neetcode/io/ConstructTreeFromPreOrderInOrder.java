package neetcode.io;

import java.util.HashMap;
import java.util.Map;

import easy.TreeNode;

public class ConstructTreeFromPreOrderInOrder {

	public static TreeNode buildTree(int[] preorder, int[] inorder) {

		Map<Integer, Integer> inorderMap = new HashMap<>();

		for (int i = 0; i < inorder.length; i++) {
			inorderMap.put(inorder[i], i);
		}

		return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, inorderMap);
	}

	private static TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int instart, int inEnd,
			Map<Integer, Integer> inOrderMap) {

		if (preStart > preEnd || instart > inEnd)
			return null;

		TreeNode root = new TreeNode(preorder[preStart]);
		int rootIndex = inOrderMap.get(root.val);
		int numsLeft = rootIndex - instart;

		// creating left node
		// prestart will be the next node in the preorder array as it is Root -> Left ->
		// right
		root.left = buildTree(preorder, preStart + 1, preEnd + numsLeft, inorder, instart, rootIndex - 1, inOrderMap);
		// creating the right node
		root.right = buildTree(preorder, preStart + numsLeft + 1, preEnd, inorder, rootIndex + 1, inEnd, inOrderMap);

		return root;
	}

	public static void main(String[] args) {
		int[] preorder = { -1 };
		int[] inorder = { -1 };
		TreeNode root = buildTree(preorder, inorder);
		System.out.println(root);
	}
}
