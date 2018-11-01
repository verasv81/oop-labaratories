package com.company.Task1;

public class GeometricBodyController {

    public  static GeometricBody getBiggestVolume(GeometricBody[] shapes){
        double maxVolume=shapes[0].getVolume();
        GeometricBody auxShape = null;

        for(GeometricBody shape:shapes){
            if(shape.getVolume()>maxVolume) {
                maxVolume = shape.getVolume();
            }
        }
        for(GeometricBody shape:shapes){
            if(shape.getVolume()==maxVolume) {
                auxShape=shape;
            }
        }

        return auxShape;
    }

    public  static GeometricBody getBiggestSurface(GeometricBody[] shapes){
        double maxSurface=shapes[0].getSurface();
        GeometricBody auxShape = null;

        for(GeometricBody shape:shapes){
            if(shape.getSurface()>maxSurface) {
                maxSurface = shape.getSurface();
            }
        }
        for(GeometricBody shape:shapes){
            if(shape.getSurface()==maxSurface) {
                auxShape=shape;
            }
        }

        return auxShape;
    }

}
