package com.company.lab5_task1;

public class B extends A {
    protected String b="bbb";
    protected B() {
    }

    protected B(String b) {
        this.b = b;
    }

    protected B(String a, String b) {
        super(a);
        this.b = b;
    }

    @Override
    public String toString() {
        return "B{" +
                "b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}
