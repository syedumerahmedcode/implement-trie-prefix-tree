public class TrieNode {
    /**
     * R links to node children
     */
    private TrieNode[] links;

    /**
     * it can only hold 'a till z' alphabets
     */
    private final int R = 26;
    /**
     * Signifies if a word chain has ended
     */
    private boolean isEnd;

    public TrieNode() {
        links = new TrieNode[R];
    }

    /**
     * Check if the given key is contained in the word link or not?
     * 
     * @param ch
     * @return
     */
    public boolean containsKey(char ch) {
        return links[ch - 'a'] != null;
    }

    /**
     * Returns the trienode for the given character
     * 
     * @param ch
     * @return
     */
    public TrieNode get(char ch) {
        return links[ch - 'a'];
    }

    /**
     * Creates a Trienode for the given character
     * 
     * @param ch
     * @param node
     */
    public void put(char ch, TrieNode node) {
        links[ch - 'a'] = node;
    }

    /**
     * Mark the word chain as ended
     */
    public void setEnd() {
        this.isEnd = true;
    }

    /**
     * Returns the status if the word link has ended
     */
    public boolean isEnd() {
        return this.isEnd;
    }

}
