package com.company.lab1_task2;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Student {
    //name, age, mark
    private
    String name;
    int age;
    float mark;

    public Student() {
    }

    public Student(String name, int age, float mark) {
        this.mark = mark;
        this.name=name;
        this.age=age;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }

    public void setMark(float mark){
        this.mark=mark;
    }

    public float getMark(){
        return mark;
    }


    public void showStudent(){
        System.out.println("Student: "+name+", "+age+" years, "+mark);
    }

}
