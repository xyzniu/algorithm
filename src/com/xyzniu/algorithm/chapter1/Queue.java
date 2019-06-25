package com.xyzniu.algorithm.chapter1;

public class Queue<Item> {
    
    private Node first;
    private Node last;
    private int N;
    
    private class Node {
        Item item;
        Node next;
    }
    
    
    public boolean isEmpty() {
        return first == null;
    }
    
    public int size() {
        return N;
    }
    
    public void enqueue(Item item) {
        Node n = new Node();
        n.item = item;
        n.next = null;
        if (first == null) {
            first = n;
            last = n;
        } else {
            last.next = n;
            last = n;
        }
        N++;
    }
    
    public Item dequeue() {
        Item item = first.item;
        first = first.next;
        if (first == null) {
            last = null;
        }
        N--;
        return item;
    }
}
