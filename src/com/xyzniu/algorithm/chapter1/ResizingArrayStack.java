package com.xyzniu.algorithm.chapter1;

import java.util.Iterator;

public class ResizingArrayStack<Item> implements Iterable {
    
    private Item[] items;
    private int index;
    
    public ResizingArrayStack() {
        items = (Item[]) new Object[16];
        index = 0;
    }
    
    public boolean isEmpty() {
        return size() == 0;
    }
    
    public int size() {
        return index;
    }
    
    private void resize(int max) {
        Item[] newItems = (Item[]) new Object[max];
        for (int i = 0; i < index; i++) {
            newItems[i] = items[i];
        }
        items = newItems;
    }
    
    public void push(Item item) {
        items[index++] = item;
        if (index >= items.length / 2) {
            resize(items.length * 2);
        }
    }
    
    public Item pop() {
        Item rst = items[--index];
        items[index] = null;
        if (items.length >= 32 && index <= items.length / 4) {
            resize(items.length / 2);
        }
        return rst;
    }
    
    
    @Override
    public Iterator iterator() {
        return new ArrayIterator();
    }
    
    private class ArrayIterator implements Iterator<Item> {
        
        private int i = 0;
        
        @Override
        public boolean hasNext() {
            return i < index;
        }
        
        @Override
        public Item next() {
            return items[i++];
        }
    }
}
