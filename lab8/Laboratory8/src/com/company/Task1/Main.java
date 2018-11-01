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

        //get the biggest Volume and Surface

        System.out.println("The biggest volume has "+
                GeometricBodyController.getBiggestVolume(shapes).getName()+
                ":"+GeometricBodyController.getBiggestVolume(shapes).getVolume());

        System.out.println("The biggest surface has "+
                GeometricBodyController.getBiggestSurface(shapes).getName()+
                ":"+GeometricBodyController.getBiggestSurface(shapes).getSurface());
    }
}
