package com.company.lab1_task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        University[] universities=new University[3];
        Student[] students1 = new Student[50];
        Student[] students2 = new Student[50];
        Student[] students3 = new Student[50];
        //First university
        universities[0] = new University();
        universities[0].setName("TUM");
        universities[0].setFoundationYear(1998);

        universities[1] = new University();
        universities[1].setName("ASEM");
        universities[1].setFoundationYear(1968);

        universities[2] = new University();
        universities[2].setName("USM");
        universities[2].setFoundationYear(1974);

        students1[0] = new Student("Elena", 17, 9.0f);
        students1[1] = new Student("Gheorghe", 17, 9.4f);
        students1[2] = new Student("Maria", 18, 7.0f);
        students1[3] = new Student("Elen", 17, 8.3f);

        universities[0].setStudents(students1);

        students2[0] = new Student("Sorin", 18, 8.1f);
        students2[1] = new Student("Marius", 20, 5.4f);
        students2[2] = new Student("Marin", 22, 7.7f);
        students2[3] = new Student("Olga", 25, 8.8f);
        students2[4] = new Student("Lera", 19, 9.88f);

        universities[1].setStudents(students2);

        students3[0] = new Student("Elisa", 17, 9.0f);
        students3[1] = new Student("Gregor", 16, 9.4f);
        students3[2] = new Student("Corina", 18, 10.0f);

        universities[2].setStudents(students3);

        System.out.println("The average mark is="+AvgMark(universities));
    }

   /* private static University[] inputData(){

        for (University university:universities){
            System.out.println("Give the number of students o university: ");
            int nr2=scanner.nextInt();
            Student[] students=new Student[nr2];
            for(Student student:students){
                student= new Student();

                System.out.println("Give the info about student:");
                System.out.println("Name:");
                String input_name =  scanner.nextLine();
                student.setName(input_name);

                System.out.println("Age:");
                Integer input_age =  scanner.nextInt();
                student.setAge(input_age);

                System.out.println("Mark:");
                Float string_mark=scanner.nextFloat();
                student.setMark(string_mark);
            }
            university.setStudents(students);
        }
       return  universities;
    }*/
    //Input the data


    //Calculate the average mark
    private static float AvgMark(University[] universities) {
        float studentsMarkSum = 0;
        int numberOfStudents = 0;

        for (University university : universities) {
            Student[] students = university.getListofStudents();
            for (Student student : students) {
            studentsMarkSum = student.getMark() + studentsMarkSum;
        }
        numberOfStudents = university.getListofStudents().length + numberOfStudents;
    }

    float avg = studentsMarkSum / numberOfStudents;
    return avg; }
    }
