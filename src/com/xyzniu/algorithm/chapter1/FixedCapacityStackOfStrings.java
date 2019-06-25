package com.xyzniu.algorithm.chapter1;

public class FixedCapacityStackOfStrings {
    
    private String[] strings;
    private int index;
    
    public FixedCapacityStackOfStrings(int cap) {
        strings = new String[cap];
        index = 0;
    }
    
    public void push(String item) {
        strings[index++] = item;
    }
    
    public String pop() {
        return strings[--index];
    }
    
    public boolean isEmpty() {
        return size() == 0;
    }
    
    public int size() {
        return index;
    }
    
    public boolean isFull() {
        return size() == strings.length;
    }
}
