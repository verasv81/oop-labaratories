package com.company.lab2_task2;

public class Queue {
    private int[] list;
    private int capacity;//list allocated size
    private int i;
    private int n=0;

    public Queue(int capacity){
        this.capacity = capacity;
        list = new int[this.capacity];
        i=capacity-1;
    }

    public void showList(){
        System.out.println("The list");
        for(int element:list) System.out.print(element+",");
        System.out.println();
    }

    //add
    public void addElement(int newElement){

            list[i]=newElement;
            i--;
            System.out.println(newElement+ " is added to queue");
            n++;

    }

    //delete
    public int deleteElement(){
        int aux=0;
        aux=list[capacity-1];
        list[capacity-1]=0;
        System.arraycopy(list, 0, list, 1, capacity-1);
        return aux;
    }

    public boolean isFull(){
        if(n==capacity) return true;
        else return false;
    }

    public boolean isEmpty(){
        if(n==0) return true;
        else return false;
    }
}
