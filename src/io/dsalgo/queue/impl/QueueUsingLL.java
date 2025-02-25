package io.dsalgo.queue.impl;

class QNode{
    int data;
    QNode next;

    public QNode(int data){
        this.data = data;
        next = null;
    }
}
class QueueLL{
    QNode front = null;
    QNode rear = null;
    int size = 0;

    public void push(int data){
        QNode newNode = new QNode(data);
        if(front == null && rear == null){
            // queue is empty
            front = newNode;
            rear = newNode;
        } else {
            // at least one element is there in the queue
            rear.next = newNode;
            rear = newNode;
        }
        size ++; // add new element
    }

    public int pop(){
        int poopedValue = 0;
        if(front == null && rear == null){
            return -1;
        } else {
            // element is there in the queue
            poopedValue = front.data;
            front = front.next;
            size --; // remove one element
        }
        return poopedValue;
    }

    public int peek(){
        if(front == null && rear == null){
            return -1;
        }
        return front.data;
    }
    public int getSize(){
        return size;
    }

    public void display(){
        QNode temp = front;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class QueueUsingLL {
    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        q.push(50);
        q.push(60);
        q.push(70);

        q.display();
        System.out.println("current peek: "+q.peek());
        System.out.println("pooped value: "+q.pop());

        q.display();
        System.out.println("current peek: "+q.peek());
        System.out.println("pooped value: "+q.pop());
        System.out.println("pooped value: "+q.pop());
        q.display();
        System.out.println("current size: "+q.getSize());
    }
}
