package io.dsalgo.linkedlist.problems.medium;

// 707. Design Linked List
class DesignLinkedList {
    static class Node{
        // Initialization of a linked list
        int val;
        Node next;

        public Node(int val){
            this.val = val;
            next = null;
        }
    }
    
    private Node head = null; 
    private int len = 0;

    public int getLen(){
        return len; 
    }

    public DesignLinkedList() { } // constructor
    
    public int get(int index) {
        if(index < 0 || index >= len) return -1; // invalid index.

        Node cur = head; 
        for(int i = 0; i <= index -1; i ++){
            cur = cur.next; 
        }
        return cur.val;     
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);

        newNode.next = head;
        head = newNode;
        len ++;
    }
    
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null) { // if a list is empty, set head to the new node
            head = newNode;
        } else {
            Node cur = head;
            while (cur.next != null) { // reach to last node
                cur = cur.next;
            }
            cur.next = newNode; // link last node to new node
        }
        len++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > len) return; // index out of bounds
        if (index == 0) {
            addAtHead(val); // handle adding at head
            return;
        }
        if (index == len) {
            addAtTail(val); // handle adding at end
            return;
        }

        Node newNode = new Node(val);
        Node cur = head;

        for (int i = 0; i < index - 1; i++) { // reach (index-1)th node
            cur = cur.next;
        }

        newNode.next = cur.next; // link new node to current's next node
        cur.next = newNode; // link current node to new node
        len++;
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= len) return;
        if(index == 0){
            if(head != null){
                head = head.next;
                len --;
                return;
            }
        }
       
        Node cur = head;
        for(int i = 0; i < index-1; i++){
            cur = cur.next;
        }
        cur.next = cur.next.next;
        len --;
    }
}
/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */