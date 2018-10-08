package com.company.lab5_task1;

class A {
    protected String a="aaa";
    protected X x=new X("xxx");

    protected A() {
    }

    public A(String a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "A{" +
                "a='" + a + '\'' +
                ", x=" + x +
                '}';
    }

    public A(String a, X x) {
       //super(a,x);
        this.a=a;
        this.x=x;
    }


}
