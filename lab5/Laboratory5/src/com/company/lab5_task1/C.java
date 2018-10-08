package com.company.lab5_task1;

class C extends B {
    protected String c="ccc";
    public C() {
    }

    public C(String c) {
        this.c = c;
    }

    public C(String b, String c) {
        super(b);
        this.c = c;
    }

    public C(String a, String b, String c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public String toString() {
        return "C{" +
                "c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}
