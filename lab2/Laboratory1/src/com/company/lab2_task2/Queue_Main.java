package com.company.lab2_task2;

public class Queue_Main {
    public static void main(String[] args) {
        Queue elements=new Queue(20);
        elements.addElement(5);
        elements.addElement(47);
        elements.addElement(50);
        elements.addElement(10);
        elements.addElement(7);
        System.out.println("-----");
        elements.showList();
        System.out.println("-----");
        System.out.println("Deleted element: "+elements.deleteElement());
        elements.showList();
        System.out.println("-----");
        System.out.println("Deleted element: "+elements.deleteElement());
        elements.showList();
    }
}
