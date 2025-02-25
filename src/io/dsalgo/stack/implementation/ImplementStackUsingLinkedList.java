package io.dsalgo.stack.implementation;

// implementation of stack using a linked list
public class ImplementStackUsingLinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
    static class StackUsingLL {
        Node top; // This will act as the top of the stack
        int size = 0; // This will track the size of the stack

        public StackUsingLL(){ } // constructor with zero arguments

        public void push(int data) {
            Node newNode = new Node(data); // create a new node
            if (top == null) {
                top = newNode; // If stack is empty, new node becomes head
            } else {
                newNode.next = top; // Link new node to current head
                top = newNode; // Update head to new node
            }
            size++;
        }

        public int pop() {
            if (top == null) return -1; // Stack is empty
            int poppedValue = top.data; // Get value from top node
            top = top.next; // Update head to next node
            size--;
            return poppedValue;
        }

        public int peek() {
            if (top == null) return -1; // Stack is empty
            return top.data; // Return value from top node without removing it
        }

        public int getSize() {
            return size; // Return current size of stack
        }

        public void display() {
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        StackUsingLL sll = new StackUsingLL();

        sll.push(10);
        sll.push(20);
        sll.push(30);
        sll.push(40);
        sll.push(50);

        sll.display();

        System.out.println("Popped value: " + sll.pop());
        System.out.println("Top value: " + sll.peek());
        System.out.println("Current size: " + sll.getSize());

        sll.display();
    }
}