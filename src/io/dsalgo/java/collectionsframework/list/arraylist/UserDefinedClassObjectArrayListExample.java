package io.dsalgo.java.collectionsframework.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * We can Provide User defined class as a type. and can work on it.
 */
public class UserDefinedClassObjectArrayListExample {
    static class Student{
        String name;
        int roll;
        public Student(String name, int roll){
            this.name = name;
            this.roll = roll;
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("Jon", 1);
        Student s2 = new Student("Luke", 2);
        Student s3 = new Student("Bob", 3);

        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(s1);
        studentsList.add(s2);
        studentsList.add(s3);

        Iterator<Student> it = studentsList.iterator();
        while (it.hasNext()){
            Student student = it.next();
            System.out.println(student.name+" "+student.roll);
        }
    }
}
