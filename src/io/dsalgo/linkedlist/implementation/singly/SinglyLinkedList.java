package io.dsalgo.linkedlist.implementation.singly;

/**
 * @class: SinglyLinkedList
 * This class implements methods for linked list operations.
 * <br>
 * add- addFirst(), addLast(), addAt()
 * <br>
 * delete - deleteFirst(), deleteLast(), deleteAt()
 * <br>
 * length()
 * display()
 */
public class SinglyLinkedList {
    private int len = 0; // initialize the length, which is empty for now
    private ListNode head = null;

    /**
     * @param val
     * @method addFirst()
     * It will add an element at the front of the linked list.
     */
    public void addFirst(int val) {
        ListNode newListNode = new ListNode(val);
        newListNode.next = head; // make new node point to current head
        head = newListNode; // update head to new node
        len++;
    }

    /**
     * @param val
     * @method addLast()
     * It will add an element at the last position of the linked list.
     */
    public void addLast(int val) {
        ListNode newListNode = new ListNode(val);
        if (head == null) { // if list is empty, set head to new node
            head = newListNode;
        } else {
            ListNode cur = head;
            while (cur.next != null) { // reach to last node
                cur = cur.next;
            }
            cur.next = newListNode; // link last node to new node
        }
        len++;
    }

    /**
     * @param val   The val to be added.
     * @param index The index at which to add the element.
     * @method addAt()
     * Adds an element at a specified index in the linked list.
     */
    public void addAt(int val, int index) {
        if (index < 0 || index > len) return; // index out of bounds
        if (index == 0) {
            addFirst(val); // handle adding at head
            return;
        }
        if (index == len) {
            addLast(val); // handle adding at end
            return;
        }

        ListNode newListNode = new ListNode(val);
        ListNode cur = head;

        for (int i = 0; i < index - 1; i++) { // reach (index-1)th node
            cur = cur.next;
        }

        newListNode.next = cur.next; // link new node to current's next node
        cur.next = newListNode; // link current node to new node
        len++;
    }

    /**
     * @method deleteFirst()
     * Deletes the first element of the linked list.
     */
    public void deleteFirst() {
        if (head != null) { // check if list is not empty
            head = head.next; // move head to the next node
            len--;
        }
    }

    /**
     * @method deleteLast()
     * Deletes the last element of the linked list.
     */
    public void deleteLast() {
        if (head == null) return; // check if list is empty

        if (head.next == null) { // only one element in list
            head = null;
        } else {
            ListNode cur = head;
            while (cur.next.next != null) { // reach second last node
                cur = cur.next;
            }
            cur.next = null; // remove last node by setting next of second last to null
        }
        len--;
    }

    /**
     * @param index The index of the element to be deleted.
     * @method deleteAt()
     * Deletes an element at a specified index in the linked list.
     */
    public void deleteAt(int index) {
        if (index < 0 || index >= len) return; // index out of bounds

        if (index == 0) {
            deleteFirst(); // handle deleting from head
            return;
        }

        if (index == len - 1) {
            deleteLast(); // handle deleting from end
            return;
        }

        ListNode cur = head;

        for (int i = 0; i < index - 1; i++) { // reach (index-1)th node
            cur = cur.next;
        }

        cur.next = cur.next.next; // bypass deleted node
        len--;
    }

    /**
     * @method displayList()
     * Displays all elements in the linked list.
     */
    public void displayList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        ListNode cur = head;

        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }

        System.out.println();
    }

    /**
     * @method length()
     * Returns the number of elements in the linked list.
     */
    public int length() {
        return len;
    }
    /**
     * public int getLength(Node head) {
     *         int len = 0;
     *         Node cur = head;
     *         while(cur!= null){
     *             len ++;
     *             cur = cur.next;
     *         }
     *         return len;
     *     }
     */
}
