package com.company.lab5_task1;

public class G extends F {
    protected String g="ggg";
    protected G() {
    }

    protected G(String g) {
        this.g = g;
    }

    public G(String a, String b, String c, String d, String e, String f, String g) {
        super(a, b, c, d, e, f);
        this.g = g;
    }

    @Override
    public String toString() {
        return "G{" +
                "g='" + g + '\'' +
                ", f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}
