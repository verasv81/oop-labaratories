package com.company.lab5_task1;

public class J extends I {
    protected String j="jjj";
    protected J() {
    }

    public J(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j) {
        super(a, b, c, d, e, f, g, h, i);
        this.j = j;
    }

    protected J(String j) {
        this.j = j;
    }

    @Override
    public String toString() {
        return "J{" +
                "j='" + j + '\'' +
                ", i='" + i + '\'' +
                ", h='" + h + '\'' +
                ", g='" + g + '\'' +
                ", f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                //", x=" + x +
                '}';
    }
}
