package io.dsalgo.java.collectionsframework.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Sort the String based on there length using comparator
// eg. raj ripan pritam .....
public class ComparatorExample {
    public static void main(String[] args) {
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() < o2.length())
                    return 1;
                else
                    return -1;
            }
        };
        List<String> names = new ArrayList<>(List.of("Ripan", "Dip", "Raj", "SouravHaldar", "SnehaS", "Charle", "AryanKumar", "Badal", "Sayan", "Rounak"));

        Collections.sort(names, comp);

        // sort based on string length
        System.out.println(names);
    }
}
