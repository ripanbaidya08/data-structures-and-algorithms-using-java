package io.dsalgo.heap.implementation;

import java.util.ArrayList;

public class Heap {
    public ArrayList<Integer> li = new ArrayList<>();

    public void maxHeapify(int i){
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;

        if(left < li.size() && li.get(left) > li.get(largest)){
            largest = left;
        }
        if(right < li.size() && li.get(right) > li.get(largest)){
            largest = right;
        }
        // swap if largest is not i
        if(largest != i){
            int temp = li.get(i);
            li.set(i, li.get(largest));
            li.set(largest, temp);
            maxHeapify(largest);
        }
    }
    /*
             23
            / \
           12  18
          / \  / \
         6  9  15 20
        / \
        2 4
     * heapify will apply for internal nodes only.
     * and number of internal nodes.  n = 9
     * n/2 - 1= 4
     * [23 12 18 6 9 15 20 2 4]
     */
    public void insert(int val){
        li.add(val);
        for(int i = li.size()/2 - 1; i >= 0; i --){ // start from the last parent node
            maxHeapify(i);
        }
    }
    public int delete(){
        if(li.size() == 0) return -1;

        int val = li.get(0);
        li.set(0, li.get(li.size()-1));
        li.remove(li.size()-1);
        for(int i = li.size()/2 - 1; i >= 0; i --){ // start from the last parent node
            maxHeapify(i);
        }
        return val;
    }
    public int peek(){
        if(li.size() == 0) return -1;
        return li.get(0);
    }
    public int getSize(){
        return li.size();
    }
    public void display(){
        System.out.println(li);
    }
}
