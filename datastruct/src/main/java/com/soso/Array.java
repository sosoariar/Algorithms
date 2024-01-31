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

    public void addLast(int e){
        if(size == data.length){
            throw new IllegalArgumentException("AddLast failed Array is full");
        }
        data[size]=e;
        size++;
    }




}
