package io.dsalgo.stack.implementation;

/**
 * Here, We Implement the Stack using an Array
 * Implement all important methods of Stack like, push, pop, peek, size.
 * Make sure it follows the LIFO principle.
 */

public class ImplementStackUsingArray {
    static class StackUsingArray{
        int[] arr = null; // Initially never give any size, it wil set by user at the time of object Creation of the class
        int top;

        public StackUsingArray(int size){
            // Since, an array is not dynamic. so, It Sizes should be predefined
            arr = new int[size];
            top = -1; // Top value would depend on how we implement the stack
        }

        // check stack is full or not
        public boolean isFull(){
            return (top == (arr.length-1));
        }

        // check stack is empty or not
        public boolean isEmpty(){
            return (top == -1);
        }

        // push
        public void push(int data){
            if(isFull()){
                System.out.println("stack is full");
            } else {
                top ++; // first increment the top
                arr[top] = data; // assign value to the top
            }
        }

        // pop
        public int pop(){
            if(isEmpty()) return -1;
            else{
                int topValue = arr[top]; // store whatever the top value we need to pop, so that later we can return the value
                top--; // reduce the top pointer.
                // note: top is not pointer. **
                return topValue;
            }
        }

        // peek
        public int peek(){
            if(isEmpty()) return -1;
            else{
                return arr[top];
            }
        }
        // size
        // since, array has zero-based indexing, on whatever the value the top is pointing
        // add +1 with that, and this would be the size of the stack.
        public int size(){
            return top+1;
        }

        // Display all elements of the stack
        // Since, an array has followed the indexing.
        // We can use it for loop to display all the elements of the stack
        // Real Stack doesn't have any indexing.
        public void display(){
            if(isEmpty()) System.out.println("Stack is Empty!");
            else{
                for(int i = 0; i <= top; i ++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }

    }
    public static void main(String[] args) {
        StackUsingArray st = new StackUsingArray(5);

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.pop());
        System.out.println(st.peek());

        System.out.println(st.size());
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());

        System.out.println("Display elements: ");
        st.display();
    }
}
