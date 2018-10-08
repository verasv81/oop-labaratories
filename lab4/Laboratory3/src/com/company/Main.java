package com.company;

import com.company.practice.Elev;
import com.company.practice.Om;

public class Main {

    public static void main(String[] args) {
	Om om=new Om();
        System.out.println(om.name);
        System.out.println(om.getNr());

	Elev elev= new Elev();
        System.out.println(elev.name);
        System.out.println(elev.getNr());

	Om oe=new Elev();
        System.out.println(oe.name);
        System.out.println(oe.getNr());


    }
}
