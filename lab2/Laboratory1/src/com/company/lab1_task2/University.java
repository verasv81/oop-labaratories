package com.company.lab1_task2;

import com.company.lab1_task2.Student;

public class University {
    //name,foundation year, list of students
    private
    String name;
    int foundationYear;
    Student[] students;

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setFoundationYear(int year){
        foundationYear=year;
    }

    public int getYear(){
        return foundationYear;
    }

    public void setStudents(Student[] s){
        students=s;
    }

    public Student[] getListofStudents(){
        return students;
    }

}
