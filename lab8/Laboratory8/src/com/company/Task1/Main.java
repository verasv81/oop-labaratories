package com.company.Task1;

public class Main {
    public static void main(String[] args) {
        //Creation and initialization of shapes
        GeometricBody cube=new Cub(5.5);
        GeometricBody sphere=new Sphere(3);
        GeometricBody prism=new Parallelipiped(3,4,5);

        //Creating a list of shapes
        GeometricBody[] shapes={cube,sphere,prism};

        //get the Surface and Volume of all shapes
        int i=1;
        for(GeometricBody shape:shapes){
            System.out.println(i + "."+shape.getName());
            System.out.println("Surface="+shape.getSurface());
            System.out.println("Volume="+shape.getVolume());
            System.out.println();
            i++;
        }

        //get type of object with the biggest Volume and Shape
        String name1="",name2="";

        for(GeometricBody shape:shapes){
            if(shape.getVolume()==GeometricBodyController.getBiggestVolume(shapes)) {
                name1=shape.getName();
                if(shape.getSurface()==GeometricBodyController.getBiggestSurface(shapes))
                        name2=shape.getName();
            }
        }
        //get the biggest Volume and Surface
        System.out.println("The biggest volume has "+name1+":"+GeometricBodyController.getBiggestVolume(shapes));
        System.out.println("The biggest surface has "+name2+":"+GeometricBodyController.getBiggestSurface(shapes));
    }
}
