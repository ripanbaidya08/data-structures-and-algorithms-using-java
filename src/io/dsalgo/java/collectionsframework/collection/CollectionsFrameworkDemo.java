package io.dsalgo.java.collectionsframework.collection;

import java.util.*;

public class CollectionsFrameworkDemo {

    static void showcaseCollectionsUsage() {  
        // Initialize an array of integers.  
        int[] numbersArray = new int[]{1, 2, 3, 4};  
        // Create an ArrayList to hold Integer objects.  
        List<Integer> numbersList = new ArrayList<>();  
        // Create a HashMap to map Integer keys to String values.  
        Map<Integer, String> numbersMap = new HashMap<>();  
        // Add elements to the ArrayList.  
        numbersList.add(1);  
        numbersList.add(2);  
        // Put key-value pairs into the HashMap.  
        numbersMap.put(1, "alpha");  
        numbersMap.put(2, "beta");  
        // Print the first element of the array.  
        System.out.println("First element of numbersArray: " + numbersArray[0]);  
        // Print the first element of the ArrayList.  
        System.out.println("First element of numbersList: " + numbersList.get(0));  
        // Print the value associated with key 1 in the HashMap.  
        System.out.println("Value for key 1 in numbersMap: " + numbersMap.get(1));  
        // Header for iterating over the array.  
        System.out.println("\nIterating over numbersArray:");  
        // Iterate through the array and print each element.  
        for (int num : numbersArray) {  
            System.out.println("Element: " + num);  
        }  
        // Header for iterating over the ArrayList.  
        System.out.println("\nIterating over numbersList:");  
        // Iterate through the ArrayList and print each element.  
        for (Integer num : numbersList) {  
            System.out.println("Element: " + num);  
        }  
        // Header for iterating over the HashMap.  
        System.out.println("\nIterating over numbersMap:");  
        // Iterate through the HashMap and print each key-value pair.  
        for (Map.Entry<Integer, String> entry : numbersMap.entrySet()) {  
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());  
        }  
    }  

    // main method
    public static void main(String[] args) {
        showcaseCollectionsUsage();  
    }  
}  