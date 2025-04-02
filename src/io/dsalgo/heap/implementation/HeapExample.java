package io.dsalgo.heap.implementation;

public class HeapExample {
    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.insert(10);
        heap.insert(34);
        heap.insert(53);
        heap.insert(58);
        heap.insert(43);

        System.out.println(heap.peek());
        System.out.println(heap.delete());
        System.out.println(heap.peek());
        System.out.println(heap.getSize());

        heap.display();
    }
}
