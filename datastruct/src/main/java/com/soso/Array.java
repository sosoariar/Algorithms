package com.soso;

public class Array {

    private int[] data;
    private int size;

    public Array(int capacity){
        data = new int[capacity];
        size = 0;
    }

    public Array(){
        this(10);
    }

    public int getSize(){
        return size;
    }

    public int getCapacity(){
        return data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void add(int index,int e) {
        if (size == data.length) {
            throw new IllegalArgumentException("fail");
        }

        if (index < 0 || index > size) {
            throw new IllegalArgumentException("fail");
        }

        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }

    }

    public void addFirst(int e){
        add(0,e);
    }

    public void addLast(int e){
        add(size,0);
    }

}
