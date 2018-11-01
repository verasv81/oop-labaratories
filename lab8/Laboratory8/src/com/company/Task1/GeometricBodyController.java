package com.company.Task1;

public class GeometricBodyController {
    public static double getBiggestVolume(GeometricBody[] shapes){
        double maxVolume=shapes[0].getVolume();

        for(GeometricBody shape:shapes){
            if(shape.getVolume()>maxVolume)
                maxVolume=shape.getVolume();
        }

        return maxVolume;
    }

    public static double getBiggestSurface(GeometricBody[] shapes){
        double maxSurface=shapes[0].getSurface();

        for(GeometricBody shape:shapes){
            if(shape.getVolume()>maxSurface)
                maxSurface=shape.getSurface();
        }

        return maxSurface;
    }

}
