package com.company.lab5_task1;

 class D extends C {
    protected String d="ddd";

     protected X x=new X("xdx");

     protected D() {
    }

    protected D(String d) {
        this.d = d;
    }

     public D(String c, String d) {
         super(c);
         this.d = d;
     }

     public D(String b, String c, String d) {
         super(b, c);
         this.d = d;
     }

     public D(String a, String b, String c, String d) {
         super(a, b, c);
         this.d = d;
     }

     @Override
     public String toString() {
         return "D{" +
                 "d='" + d + '\'' +
                 ", c='" + c + '\'' +
                 ", b='" + b + '\'' +
                 ", a='" + a + '\'' +
                 ", x=" + x +
                 '}';
     }
 }
