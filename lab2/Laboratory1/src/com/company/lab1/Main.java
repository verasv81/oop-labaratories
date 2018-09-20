package com.company.lab1;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Initialization
        Monitor monitor1 = new Monitor();
        //Read from console
        System.out.println("Give info about monitor:");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name:");
        String input_name =  scanner.nextLine();
        monitor1.name=input_name;

        System.out.print("Color:");
        String input_color =  scanner.nextLine();
        monitor1.color=input_color;

        System.out.print("Diagonal:");
        String string_input_diagonal =  scanner.nextLine();
        Float input_diagonal = Float.parseFloat(string_input_diagonal);
        monitor1.diagonal=input_diagonal;

        System.out.print("Resolution:");
        String input_resolution =  scanner.nextLine();
        monitor1.resolution=input_resolution;
        System.out.println();

        Monitor monitor3=new Monitor("LG","Black",15,"1024x1058");
        Monitor monitor2=new Monitor("Philips","Red",17,"1882x1058");

        //Show Monitors
           monitor1.ShowMonitor();
           monitor2.ShowMonitor();
           monitor3.ShowMonitor();

           //Update color of monitor
        System.out.print("Enter the new color:");
        String new_color =  scanner.nextLine();
           monitor1.UpdateColor(new_color);
           monitor1.ShowMonitor();

        //Comparison between two monitors by diagonal
        System.out.println("Monitor with bigger diagonal is: ");
        monitor1.Compare(monitor2);
    }
}
