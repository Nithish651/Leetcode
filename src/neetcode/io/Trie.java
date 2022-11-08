package neetcode.io;

class TNode {
	TNode [] links = new TNode[26];
	boolean isWord;
	
	public boolean containsKey(char ch) {
		return links[ch - 'a'] != null;
	}
	public void put(char ch, TNode tNode) {
		links[ch - 'a'] = tNode;
	}
	public void setEnd() {
		isWord = true;
	}
	public TNode get(char ch) {
		return links[ch - 'a'];
	}
	public boolean isEnd() {
		return isWord;
	}
}


public class Trie {
	
	TNode root;
	
    public Trie() {
        root = new TNode();
    }
    
	public void insert(String word) {
		TNode node = root;

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (!node.containsKey(ch)) {
				node.put(ch, new TNode());
			}
			node = node.get(ch);
		}
		node.setEnd();
	}
    
    public boolean search(String word) {
        TNode node = root;
        for(int i=0; i < word.length(); i++) {
        	char ch = word.charAt(i);
        	
        	if(!node.containsKey(ch))
        		return false;
        	
        	node = node.get(ch);
        }
        
        if(node.isEnd())
        	return true;
        
        return false;
    }
    
    public boolean startsWith(String prefix) {
    	 TNode node = root;
         for(int i=0; i < prefix.length(); i++) {
         	char ch = prefix.charAt(i);
         	
         	if(!node.containsKey(ch))
         		return false;
         	
         	node = node.get(ch);
         }
         //if the trie traversed through all characters of prefix
         //it means atleast one word that starts with the prefix;
         return true;
    }
    
    public static void main(String[] args) {
		Trie trie = new Trie();
		trie.insert("apple");
		System.out.println(trie.search("app"));
		trie.insert("app");
		System.out.println(trie.search("app"));
		System.out.println(trie.startsWith("appl"));
		System.out.println(trie.search("appl"));
	}
}
