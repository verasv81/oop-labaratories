package com.company.lab2;

public class lab2 {
    public static void main(String[] args) {
        Box box1=new Box();
        Box box2=new Box(5.5);
        Box box3=new Box(5.5,4.2,2.1);

        System.out.println("Box1 \n Surface:"+box1.getSurface()+"\n Volume:"+box1.getVolume());
        System.out.println("Box2 \n Surface:"+box2.getSurface()+"\n Volume:"+box2.getVolume());
        System.out.println("Box3 \n Surface:"+box3.getSurface()+"\n Volume:"+box3.getVolume());
    }
}
