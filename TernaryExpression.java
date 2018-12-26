import java.util.*;

class Node{
	char ch;
	Node left;
	Node right;
	
	Node(char ch){
		this.ch = ch;
	}
}

public class TernaryExpression {
	
	Node root;
	
	public void form(String s) {
		char ch = s.charAt(0);
		root=formTree (ch, root);
		for( int i = 1; i < s.length(); i++ ) {
			ch = s.charAt(i);
			formTree (ch, root);
		}
	}
	
	public Node formTree(char ch, Node node) {
		if(ch == ':') {
			return node;
		}
		
		if( node == null && (ch >='a' && ch <= 'z' )) {
			node = new Node(ch);
			return node;
		}
		else if( ch == '?' ) {
			return node.left = formTree(ch, node.left);
		}
		else return node.right = formTree(ch, node.right);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> tree= new TreeMap<Integer, String>();
		tree.put(5, "V");
		tree.put(10, "X");
		tree.put(50, "L");
		System.out.println(tree.floorKey(400));
	}

}
