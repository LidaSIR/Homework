package oop.week_6_hashTable;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Lida on 10.08.2016.
 */
public class WorkersHashMap<K, V> implements Map<K, V> {

    public static final int DEFAULT_TABLE_SIZE = 25;
    private int size;
    private Node[] table;

    public WorkersHashMap() {
        table = (Node[]) new Object[DEFAULT_TABLE_SIZE];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean containsKey(Object key) {
        if (key == null) {
            return false;
        }
        int position = getPosition(key);
        if (table[position] == null) {
            return false;
        }
        Node iter = table[position];
        while (iter != null) {
            if (iter.key.equals(key)) {
                return true;
            }
        }

        return false;
    }


    private int getPosition(Object o) {
        int hash = Math.abs(o.hashCode());
        int position = hash % table.length;
        return position;
    }

    @Override
    public boolean containsValue(Object value) {
        for (Node node : table) {
            while (node != null) {
                if (node.value.equals(value)) {
                    return true;
                }
                node = node.next;
            }
        }
        return false;
    }

    @Override
    public V get(Object key) {
        if (key == null) {
            return null;
        }
        int position = getPosition(key);
        if (table[position] == null) {
            return null;
        } else {
            Node iter = table[position];
            while (iter != null) {
                if (iter.key.equals(key)) {
                    return null;
                }
            }
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        if (key != null) {
            int position = getPosition(key);

            if (table[position] == null) {
                table[position] = new Node(key, value, null, null);
            } else {
                Node iter = table[position];
                while (iter.next != null) {
                    if (iter.key.equals(key)) {
                        return null;
                    }
                    iter = iter.next;
                }
                Node last = iter;
                if (last.key.equals(key)) {
                    return null;
                } else {
                    last.next = new Node(key, value, last, null);
                    return value;
                }
            }
        }
        return null; // TODO: 12.08.2016  make exception !!!
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {

        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> entrySet;


        return null;
    }
// по чому має бігти: ноді чи ентрі?!!!
    private class MyIterator implements Iterator<Node<K, V>> {

        private Node<K, V> currentNode;
        private int currNodeBucket;

        public MyIterator() {
           if(!isEmpty()){
              currNodeBucket = findFirstNotNull(0);
               currentNode = table[currNodeBucket];
           }
        }

        private int findFirstNotNull(int start){
           for(; start < table.length && table[start] == null; start++){
           }
            return start;
        }


        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public Node<K, V> next() {
            Node <K,V> forRet = currentNode;

            if(forRet.next != null){
                 currentNode = forRet.next;
             } else{
                int notNull = findFirstNotNull(currNodeBucket + 1);
                if(notNull == table.length){
                    currentNode = null;
                }else{
                    currNodeBucket = notNull;
                    currentNode = table[currNodeBucket];
                }
            }

            return forRet;
        }


    }

    public class Node<K, V> {
        K key;
        V value;
        Node next;
        Node previous;

        public Node(K key, V value, Node previous, Node next) {
            this.key = key;
            this.value = value;
            this.previous = previous;
            this.next = next;
        }
    }

    public class MyEntry implements Entry<K, V> {
        K key;
        V value;

        public MyEntry(K kay, V value) {
            this.key = kay;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {

            V retValue = this.value;
            this.value = value;

            return retValue;
        }
    }
}
