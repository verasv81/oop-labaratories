package com.company.Task1;

public class Parallelipiped implements GeometricBody {

    private double height, width, length;

    public Parallelipiped(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    @Override
    public double getSurface() {
        return (2*length*width)+(2*height*width)+(2*length*height);
    }

    @Override
    public double getVolume() {
        return height*width*length;
    }

    @Override
    public String getName() {
        return "prism";
    }
}
