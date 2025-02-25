package io.dsalgo.linkedlist.implementation.singly;

/**
 * @class LinkedListImplementation
 * Main class to demonstrate linked list operations.
 */
public class LinkedListImplementation {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Add elements at the front
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        System.out.print("After adding first: ");
        list.displayList();

        // Add elements at the last
        list.addLast(40);
        list.addLast(60);
        System.out.print("After adding last: ");
        list.displayList();

        // Add element at a specific index
        list.addAt(100, 4);
        System.out.print("After adding at index 4: ");
        list.displayList();

        // Delete first element
        list.deleteFirst();
        System.out.print("After deleting first: ");
        list.displayList();

        // Delete last element
        list.deleteLast();
        System.out.print("After deleting last: ");
        list.displayList();

        // Delete element at a specific index
        list.deleteAt(2);
        System.out.print("After deleting at index 2: ");
        list.displayList();

        System.out.println("Length of the linked list: " + list.length());
    }
}