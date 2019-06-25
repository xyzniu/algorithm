package com.xyzniu.algorithm.chapter1;


public class Stack<Item> {
    
    private Node first;
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
    
    public void push(Item item) {
        Node n = new Node();
        n.item = item;
        n.next = first;
        first = n;
        N++;
    }
    
    public Item pop() {
        Node n = first;
        first = first.next;
        N--;
        return n.item;
    }
    
    public Item peek() {
        Node n = first;
        return n.item;
    }
    
}
