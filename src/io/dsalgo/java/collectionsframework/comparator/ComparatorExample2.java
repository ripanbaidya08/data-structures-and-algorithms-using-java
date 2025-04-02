package io.dsalgo.java.collectionsframework.comparator;

import java.util.*;

// Custom Comparator
class sortStudentsBasedOnIdInDescendingOrder implements Comparator<Map.Entry<Integer, String>> {
    @Override
    public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
        return o2.getKey().compareTo(o1.getKey()); // sort in descending order
    }
}

public class ComparatorExample2 {
    public static void main(String[] args) {
        List<Map.Entry<Integer, String>> studentsList = getEntries();

        // Custom Sorting Using Comparator
        Collections.sort(studentsList, new sortStudentsBasedOnIdInDescendingOrder());

        // 3. Store Sorted Entries into LinkedHashMap
        LinkedHashMap<Integer, String > sortedStudents = new LinkedHashMap<>();
        for(Map.Entry<Integer, String> entry : studentsList){
            sortedStudents.put(entry.getKey(), entry.getValue());
        }

        // Display Sorted students
        for(Map.Entry<Integer, String> student : sortedStudents.entrySet()){
            System.out.println(student.getKey()+" "+student.getValue());
        }
    }

    private static List<Map.Entry<Integer, String>> getEntries() {
        HashMap<Integer, String> students = new HashMap<>(); // <id, name>

        // Add students
        students.put(1, "Ripan");
        students.put(5, "Raj");
        students.put(72, "Mohan");
        students.put(89, "Sunny");
        students.put(56, "Dhilon");
        students.put(93, "Satya");
        students.put(43, "Guru");
        students.put(83, "Sourav");

        // 1. convert hashmap into list of map entries
        List<Map.Entry<Integer, String>> studentsList = new ArrayList<>(students.entrySet());
        return studentsList;
    }
}
