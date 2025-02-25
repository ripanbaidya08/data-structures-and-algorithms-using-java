package io.dsalgo.linkedlist.implementation.doubly;

public class DoublyLinkedListImplementation {
    public static void main(String[] args) {

        DoublyLinkedList dl = new DoublyLinkedList();

        System.out.println("Adding elements at first: ");
        dl.addFirst(10);
        dl.addFirst(20);
        dl.addFirst(30);
        dl.displayList();

        System.out.println("Adding elements at last: ");
        dl.addLast(40);
        dl.addLast(50);
        dl.displayList();

        System.out.println("Adding elements 100 at index: 4");
        dl.addAt(100, 4);
        dl.displayList();

        System.out.println("Delete first element or head");
        dl.deleteFirst();
        dl.displayList();

        System.out.println("Delete last element or tail");
        dl.deleteLast();
        dl.displayList();

        System.out.println("Delete at index 2");
        dl.deleteAt(2);
        dl.displayList();

        System.out.println("current length: "+dl.length());
    }
}
