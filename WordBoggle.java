import java.util.*;

class TrieNode{
	char ch;
	int frequency;
	HashMap<Character, TrieNode> map = new HashMap<Character, TrieNode>();
	TrieNode(){}
	TrieNode(char ch){
		this.ch = ch;
		frequency = 1;
	}
}

public class WordBoggle {

	TrieNode root;
	
	int x[]= {-1, -1, -1, 0, 1, 1, 1, 0};
	int y[]= {1, 0, -1, -1, -1, 0, 1, 1};
	
	char ch[][]={{'G','I','Z'},
                {'U','E','K'},
                {'Q','S','E'}};
	
	int row = 3, col = 3, length = 8;
	
	WordBoggle() {
		root = new TrieNode();
	}
	
	public void insertTrie(String str) {
		if(str == null) {
			return;
		}
		HashMap<Character, TrieNode> hmap = root.map;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			TrieNode t;
			if( hmap.containsKey(ch) ) {
				//System.out.println(ch+"------------");
				t = hmap.get(ch);
				t.frequency++;
			}
			else {
				//System.out.println("----------------"+ch);
				t = new TrieNode(ch);
				hmap.put(ch, t);
			}
			hmap = t.map;
		}
		
	}
	
	public void checkWord() {
		
		int i = 0, j = 0, rd, cl; 
		boolean flag = true;
		
		while( (i < row && j < col ) && flag == true)
			if( !root.map.containsKey(ch[i][j]) ) {
				flag = false; 
				break;
			}
			else {
				for( int k = 0 ; k < length ; k++ ) {
				  rd = i + x[k] ; 
				  cl = j + y[k];
				  if( rd > row || rd < 0 || cl > col || cl < 0) {
					  continue;
				  }
				  else {
					  TrieNode t= root.map.get(ch[rd][cl]);
					  while(t.map.containsKey(ch[i][j])) {
						  
					  }
				  }
				
			}
		}
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordBoggle word=new WordBoggle();
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("geeks");
		arr.add("go");
		arr.add("gfg");
		arr.add("gello");
		Iterator itr=arr.iterator();
		while(itr.hasNext()) {
			word.insertTrie((String) itr.next());
			itr.remove();
		}
		
	}

}
