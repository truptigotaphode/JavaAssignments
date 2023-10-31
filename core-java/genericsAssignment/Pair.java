package genericsAssignment;

import java.util.*;


public class Pair<K,V> {
	private K key;
    private V value;

    public void setKey(K key) {
        if (key instanceof String) {
            this.key = key;
        } else {
            throw new IllegalArgumentException("Key must be of type String");
        }
    }
    
    public void setValue(V value) {
        if (value instanceof String || value instanceof Date) {
            this.value = value;
        } else {
            throw new IllegalArgumentException("Value must be of type String or Date");
        }
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
    
    public static void main(String[] args) {
       
        Pair<String, String> pairA = new Pair<>();
        pairA.setKey("1");
        pairA.setValue("Hello");
        System.out.println("Scenario a - Key: " + pairA.getKey() + ", Value: " + pairA.getValue());

        
        Pair<String, Date> pairB = new Pair<>();
        pairB.setKey("Today is");
        pairB.setValue(new Date());
        System.out.println("Scenario b - Key: " + pairB.getKey() + ", Value: " + pairB.getValue());
    }
}
