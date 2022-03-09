package stackPropblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import utils.Node;

public class NAryPreOrderTraversal {

	static List<Integer> preOrder = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node3 = new Node(3);
		node3.children = new ArrayList<>();
		node3.children.add(node5);
		node3.children.add(node6);
		Node node2 = new Node(2);
		Node node4 = new Node(4);
		Node node1 = new Node(1);
		node1.children = new ArrayList<>();
		node1.children.add(node3);
		node1.children.add(node2);
		node1.children.add(node4);
		
		System.out.println(preorder(node1));
	}
	
	public static List<Integer> preorder(Node root) {
		
		if(root == null)
			return preOrder;
		
		Stack<Node> nodeStack = new Stack<>();
		nodeStack.push(root);
		
		while (!nodeStack.isEmpty()) {
			Node topNode = nodeStack.pop();
			preOrder.add(topNode.val);
			if (topNode.children != null) {
				Collections.reverse(topNode.children);
				for (Node node : topNode.children) {
					nodeStack.push(node);
				}

			}
		}
		
		
       return preOrder;    
    }
}
