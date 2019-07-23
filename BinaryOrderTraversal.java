import java.util.*;


class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }


public class BinaryOrderTraversal {
	
	 public static List<List<Integer>> levelOrderBottom(TreeNode root) {
	        
	        List<List<Integer>> result = new ArrayList<List<Integer>>();
	        
	        if(root == null) {
	            return result;
	        }
	        else{
	            List<TreeNode> queue = new ArrayList<TreeNode>();  //list of all the nodes 
	            List<Integer> elementQueue = new ArrayList<Integer>();   //list of node values
	            queue.add(root);
	            elementQueue.add(root.val);
	            result.add(elementQueue);
	            
	            while(!queue.isEmpty()){
	                List<TreeNode> que = new ArrayList<TreeNode>();  //list of child nodes
	                List<Integer> childQue = new ArrayList<Integer>();   //list of child nodes values
	                
	                while(!queue.isEmpty())
	                {
	                    TreeNode node = queue.remove(0);
	                
	                    if(node.left != null) {
	                        que.add(node.left);
	                        childQue.add(node.left.val);
	                    }
	                    if(node.right != null) {
	                        que.add(node.right);
	                        childQue.add(node.right.val);
	                    }
	                }
	                
	                
	                
	                if(childQue != null)
	                {
	                    result.add(childQue);
	                    queue = que;
	                } 
	                
	            }
	            
	            Collections.reverse(result);       
	            
	            result.removeIf(p -> p.isEmpty());
	            
	            return result;
	            
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(3);
		levelOrderBottom(root);
	}

}
