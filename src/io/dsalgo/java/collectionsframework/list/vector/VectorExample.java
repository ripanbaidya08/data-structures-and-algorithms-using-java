package io.dsalgo.java.collectionsframework.list.vector;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        //Create a vector
        Vector<String> vec = new Vector<String>();

        //Adding elements using add() method of List
        vec.add("Tiger");
        vec.add("Lion");
        vec.add("Dog");
        vec.add("Elephant");

        //Adding elements using addElement() method of Vector
        vec.addElement("Rat");
        vec.addElement("Cat");
        vec.addElement("Deer");

        // Adding elements using addFirst() & addLast() method
        vec.addFirst("Dinosaur");
        vec.addLast("Cow");

        // Printing all elements
        System.out.println("Elements are: " + vec);
    }
}
