public class Trie {

    /**
     * A Trie will always have a root
     */
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            /** get current character */
            char currentChar = word.charAt(i);
            /**
             * check if the currentChar already exists inside our node
             */
            if (!node.containsKey(currentChar)) {
                // we create a new entry
                node.put(currentChar, new TrieNode());
            }
            /**
             * update the node's value
             */
            node = node.get(currentChar);
        }
        /**
         * to mark that the word chain has ended.
         */
        node.setEnd();
    }

    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        return node != null && node.isEnd();
    }

    public boolean startsWith(String prefix) {
        TrieNode node = searchPrefix(prefix);
        return node != null;

    }

    private TrieNode searchPrefix(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (node.containsKey(currentChar)) {
                node = node.get(currentChar);
            } else {
                return null;
            }
        }
        return node;
    }

}
