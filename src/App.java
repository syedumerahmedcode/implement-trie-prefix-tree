public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /**
         * A trie (pronounced as "try") or prefix tree is a tree data structure used to
         * efficiently store and retrieve keys in a dataset of strings. There are
         * various applications of this data structure, such as autocomplete and
         * spellchecker.
         * 
         * Implement the Trie class:
         * 
         * Trie() Initializes the trie object.
         * void insert(String word) Inserts the string word into the trie.
         * boolean search(String word) Returns true if the string word is in the trie
         * (i.e., was inserted before), and false otherwise.
         * boolean startsWith(String prefix) Returns true if there is a previously
         * inserted string word that has the prefix prefix, and false otherwise.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input
         * ["Trie", "insert", "search", "search", "startsWith", "insert", "search"]
         * [[], ["apple"], ["apple"], ["app"], ["app"], ["app"], ["app"]]
         * Output
         * [null, null, true, false, true, null, true]
         * 
         * Explanation
         * Trie trie = new Trie();
         * trie.insert("apple");
         * trie.search("apple"); // return True
         * trie.search("app"); // return False
         * trie.startsWith("app"); // return True
         * trie.insert("app");
         * trie.search("app"); // return True
         * 
         */
        Trie trie = new Trie();

        // Insert words
        trie.insert("apple");
        trie.insert("app");
        trie.insert("bat");
        trie.insert("ball");

        // Test search
        System.out.println("Can we find the word 'apple': " + trie.search("apple")); // Output: true
        System.out.println("Can we find the word 'app': " + trie.search("app")); // Output: true
        System.out.println("Can we find the word 'bat': " + trie.search("bat")); // Output: true
        System.out.println("Can we find the word 'bad': " + trie.search("bad")); // Output: false

        // Test startsWith
        System.out.println("Do a word starts with 'app': " + trie.startsWith("app")); // Output: true
        System.out.println("Do a word starts with 'ba': " + trie.startsWith("ba")); // Output: true
        System.out.println("Do a word starts with 'cat': " + trie.startsWith("cat")); // Output: false

        // Edge case
        System.out.println("Can we find an empty string: " + trie.search("")); // Should be false, as empty string is
                                                                               // not a valid word
    }
}
