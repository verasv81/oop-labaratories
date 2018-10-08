package com.company.lab5_task1;

public class I extends H {

    public I(String a, String b, String c, String d, String e, String f, String g, String h, String i) {
        super(a, b, c, d, e, f, g, h);
        this.i = i;
    }

    protected String i="iii";
    protected I() {
    }

    protected I(String i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "I{" +
                "i='" + i + '\'' +
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
