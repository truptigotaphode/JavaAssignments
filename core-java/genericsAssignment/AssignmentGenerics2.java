package genericsAssignment;

import java.util.*;


public class AssignmentGenerics2 {
	public static void main(String[] args) {
       
        HashMap<Integer, Double> randomPairs = new HashMap<>();

        
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            int randomKey = random.nextInt(100); 
            double randomValue = random.nextDouble() * 100.0; 

            randomPairs.put(randomKey, randomValue);
        }

        
        for (HashMap.Entry<Integer, Double> entry : randomPairs.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

