package com.company.lab1;

public class Monitor {
    //color,dimension and resolution
    String name;
    String color;
    float diagonal;
    String resolution;

    //create, update, comparison between two monitors

    //implicit constructor
    public Monitor() {
    }

    //Create
    public Monitor(String name, String color, float diagonal,String resolution){
        this.name=name;
        this.color=color;
        this.diagonal=diagonal;
        this.resolution=resolution;
    }


    void ShowMonitor(){
        System.out.println("Info about monitor:");
        System.out.println("Name:"+name+";");
        System.out.println("Color:"+color+";");
        System.out.println("Diagonal:"+diagonal+";");
        System.out.println("Resolution:"+resolution+";");
    }

    public void UpdateName(String n){
        name=n;
    }

    public void UpdateColor(String c){
        color=c;
    }

    public void UpdateDiagonal(float d){
        diagonal=d;
    }

    public void UpdateResolution(String r){
        resolution=r;
    }

    //Comparison
    public void Compare(Monitor m1){
        if(m1.diagonal>diagonal) System.out.println(m1.name);
        else if(m1.diagonal<diagonal) System.out.println(name);
        else System.out.println("Both monitor have the same diagonal!");
    }

}
