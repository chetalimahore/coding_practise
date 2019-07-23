import java.util.*;

class TrieNode
{
	char ch;
	HashMap<Character, TrieNode> map=new HashMap<Character, TrieNode>();
	int frequency;
	TrieNode(){}
	TrieNode(char ch)
	{
		this.ch=ch;
		frequency=1;
	}
}

class Trie
{
	TrieNode root;
	public Trie()
	{
		root=new TrieNode();
	}
	
	public void insertWord(String str) {
		HashMap<Character, TrieNode> child=root.map;    //starts searching from the root's map
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);    // iterates for each character
			TrieNode t;       //creates a reference
			if(child.containsKey(ch))   //if the existing map contains the character
			{
				t=child.get(ch);       // it finds the present character's node and then increase its frequency
				t.frequency++;     
			}
			else {
				t=new TrieNode(ch);     // create a new node for the character
				child.put(ch, t);    // put the mapping of the new character into child's 
			}
			child=t.map;     // creates a new empty map for the upcoming node
		}
	}
	
	public String findPrefix(String str) {
		if(str==null || str.length()<=0) {
			return null;
		}
		
		StringBuilder build=new StringBuilder();
		HashMap<Character, TrieNode> map=root.map;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			TrieNode t;
			if(map.containsKey(ch)) {
				t=map.get(ch);
				map=t.map;
				build.append(ch);
				if(t.frequency==1)
					return build.toString();
			}
			else {
				return null;
			}
		}
		return build.toString();
	}
	
	public ArrayList<String> prefix(ArrayList<String> arr){
		if(arr==null || arr.size()<=0) {
			return null;
		}
		
		ArrayList<String> result=new ArrayList<String>();
		Trie node=new Trie();
		for(String s:arr) {
			node.insertWord(s);
		}
		for(String s:arr) {
			String res=node.findPrefix(s);
			result.add(res);
		}
		return result;
	}
}


public class FindPrefix {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Trie oper=new Trie();
		ArrayList<String> list=new ArrayList<String>();
		ArrayList<String> result=new ArrayList<String>();
		list.add("abcd");
		list.add("abc");
		list.add("cdf");
		list.add("cdfgh");
		result=oper.prefix(list);
		for(String s:result) {
			System.out.println(s);
		}
	}

}
