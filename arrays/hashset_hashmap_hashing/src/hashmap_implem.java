import java.util.*;
public class hashmap_implem {
    static class HashMap<K, V> { //generics
        private class Node {
            K key;
            V value;

            public Node {
                K key, V value
            }

            {
                this.key = key;
                this.value = value;
            }
        }

        private int n;//nodes
        private int N;//buckets
        private LinkedList<Node> buckets[];
        @SuppressWarnings("unchecked");
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];//intializing array of type linkedlist
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>(); //creating a empty ll so that data can be sored as previously it was null
            }
            public void put (, V value)
            {

            }
        }

    }
}