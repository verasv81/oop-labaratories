package com.company.Task1;

public class Sphere implements GeometricBody {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSurface() {
        return 4*Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getVolume() {
        return (double)(4/3)*Math.PI*Math.pow(radius,3);
    }

    @Override
    public String getName() {
        return "sphere";
    }
}
