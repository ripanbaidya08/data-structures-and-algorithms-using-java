package io.dsalgo.java.collectionsframework.list.arraylist;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Serialization and deserialization in Java are processes used to convert objects into byte streams
 * for storage or transmission and then reconstruct the objects from those byte streams, respectively.
 * This mechanism allows objects to be saved to files, sent over networks, or stored in databases.
 */
public class JavaArrayListSerializationAndDeserializationExample {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>(List.of(1, 2, 3, 4, 5)); // ArrayList with elements

        try{
            // Serialization
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.obj"));
            oos.writeObject(li); // Write the ArrayList Object to the file
            oos.close();

            // Deserialization
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.obj"));

            // Read the ArrayList object from the file and cast it to ArrayList<String>
            ArrayList<Integer> deserializedObj = (ArrayList<Integer>) ois.readObject();
            System.out.println(deserializedObj); // Print the deserialized ArrayList

            ois.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
