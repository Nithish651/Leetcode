package neetcode.io;


class TrieNode{
	TrieNode [] links = new TrieNode[26];
	boolean isEnd;
	
	public boolean containsKey(char ch) {
		return links[ch - 'a'] != null;
	}
	
	public void put(char ch, TrieNode trieNode) {
		links[ch - 'a'] = trieNode;
	}
	
	public TrieNode get(char ch) {
		return links[ch - 'a'];
	}
	
	public void setEnd() {
		isEnd = true;
	}

	public boolean isEnd() {
		return isEnd;
	}
	
}

public class WordDictionary {
	
	TrieNode root;
	
    public WordDictionary() {
        root = new TrieNode();
    }
    
    public void addWord(String word) {
    	TrieNode node = root;
    	
        for(int i= 0; i < word.length(); i++) {
        	char ch = word.charAt(i);
        	
        	if(!node.containsKey(ch))
        		node.put(ch, new TrieNode());
        	
        	node = node.get(ch);
        }
        
        node.setEnd();
    }
    
	public boolean search(String word) {
		return searchNodes(root,word,0);
	}
    
    
	private boolean searchNodes(TrieNode node, String word, int index) {
		
		for(int i = index; i < word.length(); i++) {
			char ch = word.charAt(i);
			
			if(ch == '.'){
				for (TrieNode  temp : node.links) {
					if(temp != null && searchNodes(temp,word,i + 1))
						return true;
				}
				return false;
			}else {
				if(!node.containsKey(ch))
					return false;
				
				node = node.get(ch);
			}
		}
		
		return node.isEnd();
	}

	public static void main(String[] args) {
		WordDictionary di = new WordDictionary();
		di.addWord("bad");
		
		System.out.println(di.search(".ad"));
		System.out.println(di.search("bad"));
	}
}
