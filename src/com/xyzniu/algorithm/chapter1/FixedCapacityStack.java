package com.xyzniu.algorithm.chapter1;


public class FixedCapacityStack <T> {
    
    private T[] ts;
    private int index;
    
    public FixedCapacityStack(int cap) {
        ts = (T[]) new Object[cap];
        index = 0;
    }
    
    public void push(T item) {
        ts[index++] = item;
    }
    
    public T pop() {
        return ts[--index];
    }
    
    public boolean isEmpty() {
        return size() == 0;
    }
    
    public int size() {
        return index;
    }
}
