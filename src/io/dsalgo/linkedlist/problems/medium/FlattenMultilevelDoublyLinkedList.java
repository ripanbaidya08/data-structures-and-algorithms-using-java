package io.dsalgo.linkedlist.problems.medium;

// leetcode 430. Flatten a Multilevel Doubly Linked List
class FlattenMultilevelDoublyLinkedList {
    static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }

    public Node flatten(Node head) {
        Node temp = head ; 

        while(temp != null){
            Node afterTempNode = temp.next ;  
            if(temp.child != null){
                Node childList = flatten(temp.child);
                Node findTail = childList ; 

                while(findTail.next != null){
                    findTail = findTail.next ; 
                }
                // connect to child node 
                temp.next = childList ;
                childList.prev = temp ; 

                // connect the end to the , childAfterNode 

                findTail.next = afterTempNode ;
                if(afterTempNode != null){
                    afterTempNode.prev = findTail ; 
                }
                temp.child = null ;
            }
            temp = afterTempNode ; 
        }
        return head ; 
    }
}