package com.company.lab2;

public class Box {
    private double height;
    private double width;
    private double depth;

    public Box(){
        height=1;width=1;depth=1;
    }

    public Box(double value){
        height=value;width=value;depth=value;
    }

    public Box(double height,double width,double depth){
        this.height=height;this.width=width;this.depth=depth;
    }

    public double getVolume(){
        return height*width*depth;
    }

    public double getSurface(){
        return  2*(height*width+height*depth+width*depth);
    }

}
