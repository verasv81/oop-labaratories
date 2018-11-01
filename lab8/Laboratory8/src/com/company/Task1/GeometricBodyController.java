package com.company.Task1;

public class GeometricBodyController {
    public static String getBiggestVolume(GeometricBody[] shapes){
        double maxVolume=shapes[0].getVolume();
        String name="";

        for(GeometricBody shape:shapes){
            if(shape.getVolume()>maxVolume)
                maxVolume=shape.getVolume();
        }

        for(GeometricBody shape:shapes){
            if(shape.getVolume()==maxVolume)
                name=shape.getName();
        }

        return "The biggest volume has "+name+":"+maxVolume;
    }

    public static String getBiggestSurface(GeometricBody[] shapes){
        double maxSurface=shapes[0].getSurface();
        String name="";

        for(GeometricBody shape:shapes){
            if(shape.getVolume()>maxSurface)
                maxSurface=shape.getSurface();
        }

        for(GeometricBody shape:shapes){
            if(shape.getSurface()==maxSurface)
                name=shape.getName();
        }

        return "The biggest surface has "+name+":"+maxSurface;
    }

}
