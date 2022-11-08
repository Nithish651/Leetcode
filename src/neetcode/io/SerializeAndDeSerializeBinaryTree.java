package neetcode.io;

import java.util.LinkedList;
import java.util.Queue;

import easy.TreeNode;

public class SerializeAndDeSerializeBinaryTree {

	
    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
     
    	if(root == null)
    		return "#";
    	
    	StringBuilder builder = new StringBuilder();
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	queue.add(root);
    	
    	while(!queue.isEmpty()) {
    		TreeNode node = queue.poll();
    		
    		if(node == null) {
    			builder.append("#,");
    			continue;
    		}
    		
    		builder.append(node.val+",");
    		queue.add(node.left);
    		queue.add(node.right);
    	}
    	
    	return builder.toString();
    }
    
    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
    	if(data.equals("#")) return null;
    	
        String [] values = data.split(",");
        Queue<TreeNode> queue = new LinkedList<>();
        
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        queue.add(root);
        
        for(int i=1; i < values.length; i++) {
        	TreeNode parent = queue.poll();
        	if(!values[i].equals("#")) {
        		TreeNode left = new TreeNode(Integer.parseInt(values[i]));
        		parent.left = left;
        		queue.add(left);
        	}
        	
        	if(!values[++i].equals("#")) {
        		TreeNode right = new TreeNode(Integer.parseInt(values[i]));
        		parent.right = right;
        		queue.add(right);
        	}
        }
        
        return root;
    }    
	
	
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		
		node3.left = node4;
		node3.right = node5;
		
		node1.left = node2;
		node1.right = node3;
		
		System.out.println(serialize(node1));
		System.out.println(deserialize(serialize(node1)));
	}
}
