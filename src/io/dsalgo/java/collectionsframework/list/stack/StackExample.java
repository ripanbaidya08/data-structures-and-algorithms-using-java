package io.dsalgo.java.collectionsframework.list.stack;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Stack;

/**
 * The stack is a linear data structure that is used to store the collection of objects.
 * It is based on Last-In-First-Out (LIFO). In Java, the stack holds a special significance,
 * forming the backbone of many algorithms and applications.
 *
 * Stack class provides different operations such as push, pop, empty, contains, search, etc.
 *
 *          Iterable(I)
 *              | extends
 *         Collection(I)
 *              | extends
 *            List(I)
 *             | implements
 *           Vector(C)
 *            | extends
 *          Stack(C)
 */
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Check whether the Stack is empty or not
        System.out.println("Is Stack empty: "+stack.empty());

        // Adding an element to the stack using push()
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Removing an element from the stack using pop()
        System.out.println("pop element: "+stack.pop()); // remove the top most element from the stack

        // size of stack
        System.out.println("Size of Stack: "+stack.size());

        stack.push(40);
        stack.push(50);

        // peek element
        System.out.println("Peek element: "+stack.peek());

        // print all elements
        System.out.println(stack);

        // search an element from the stack
        System.out.println("Search element 10: "+ stack.search(10));

        // Contains object or not
        System.out.println(stack.contains(10));

        // print elements using forEach();
        stack.forEach(elements -> System.out.print(elements+" "));

        // Print elements using listIterator()
        ListIterator<Integer> it = stack.listIterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        // Using spliterator()
        Spliterator<Integer> spliterator = stack.spliterator();
        Spliterator<Integer> splitPart = spliterator.trySplit();

        // Using first spliterator (splitPart)
        System.out.println("Output from splitPart:");
        splitPart.forEachRemaining(System.out::println);

        // Using second spliterator (remaining elements in spliterator)
        System.out.println("Output from spliterator:");
        spliterator.forEachRemaining(System.out::println);
    }
}
