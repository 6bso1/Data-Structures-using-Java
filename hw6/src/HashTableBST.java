public class HashTableBST<K extends Comparable<K>,V> implements KWHashMap<K,V> {
    private MyBST<Entry<K, V>>[] table;
    private int numKeys;
    private static final int CAPACITY = 101;
    private static final double LOAD_THRESHOLD = 3.0;
    @SuppressWarnings("unchecked")
    public HashTableBST() {
        table = new MyBST[CAPACITY];
    }

    /**
     * This method returns the value of the given key
     * @param key key of the value wanted
     * @return value of the given key
     */
    @Override
    public V get(K key) {
        int index = key.hashCode() % table.length;
        if (index < 0)
            index += table.length;
        if (table[index] == null)
            return null; 
        for (Entry<K, V> nextItem : table[index].getData()) {
            if (nextItem.getKey().equals(key))
                return nextItem.getValue();
        }
        return null;
    }

    /**
     * This method returns whether the map is empty or not
     */
    @Override
    public boolean isEmpty() {
        
        return false;
    }

    /**
     * This method puts the given value to the given key
     * @param key key that the value will be put onto
     * @param value value to be put 
     * @return old value of the key
     */
    @Override
    public V put(K key, V value) {

        int index = key.hashCode() % table.length;
        if (index < 0)
            index += table.length;
        if (table[index] == null) {
            table[index] = new MyBST<Entry<K, V>>();
        }
        
        for (Entry<K, V> nextItem : table[index].getData()) {
            if (nextItem.getKey().equals(key)) {
                V oldVal = nextItem.getValue();
                nextItem.setValue(value);
                return oldVal; 
            }
        }
        table[index].add(new Entry<>(key, value));
        numKeys++;
        if (numKeys > (LOAD_THRESHOLD * table.length))
        rehash();
        return null;
    }
    
    /**
     * This method removes given key and its value
     * @param key key of the value that will be removed
     * @return key that will be removed
     */
    @Override
    public V remove(K key) {
        int index = key.hashCode() % table.length;
        if (index < 0)
            index += table.length;
        if (table[index] == null) 
            return null;
        for (Entry<K, V> nextItem : table[index].getData()) {
            if (nextItem.getKey().equals(key)) {
                V oldVal = nextItem.getValue();
                table[index].remove(nextItem);
                numKeys--;
                if (table[index].size()==0) {
                    table[index]=null;
                }
                return oldVal; 
            }
        }      
        return null;
    }

    /**
     * This method returns the size of the map
     * @return size
     */
    @Override
    public int size() {
        return numKeys;
    }

    /**
     * This method does the rehashing
     */
    @SuppressWarnings("unchecked")
    private void rehash() {
        MyBST<Entry<K, V>>[] oldTable = table;
        table = new MyBST[2 * oldTable.length + 1];
        numKeys = 0;
        for (int i = 0; i < oldTable.length; i++) {
            if (oldTable[i] != null) {
                for (Entry<K,V> nextItem : oldTable[i].getData()) {
                    put(nextItem.getKey(), nextItem.getValue());
                }
            }
        }
    }
       
    /**
     * This class implements Entry
     */
    private static class Entry<K extends Comparable<K>, V> implements Comparable<Entry<K,V>>{
        private final K key;
        private V value;
        
        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
        
        /**
         * This method returns entry's key
         * @return key
         */
        public K getKey() {
            return key;
        }
        
        /**
         * This method returns entry's value
         * @return
         */
        public V getValue() {
            return value;
        }
       
        /**
         * This method sets the entry's value to given value
         * @param val value to be set
         * @return entry's old value
         */
        public V setValue(V val) {
            V oldVal = value;
            value = val;
            return oldVal;
        }

        /**
         * This method implements the comparable interface for entry class
         */
        public int compareTo(Entry<K,V> other){
            return key.compareTo(other.key);
        }
    }
}