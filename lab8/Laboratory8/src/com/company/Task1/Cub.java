package com.company.Task1;

public class Cub implements GeometricBody{
    private double side;

    public Cub(){}

    public Cub(double side) {
        this.side = side;
    }

    @Override
    public double getSurface() {
        return 6*Math.pow(side,2);
    }

    @Override
    public double getVolume() {
        return Math.pow(side,3);
    }

    @Override
    public String getName() {
        return "cube";
    }

}
