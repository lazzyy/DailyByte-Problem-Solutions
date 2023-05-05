import DataStructures.Trie;

public class CreateTrie {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("programming");
        System.out.println(trie.search("programming"));
        System.out.println(trie.search("computer"));
    }
}