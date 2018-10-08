package com.company.lab5_task1;

public class Main {
   public static void main(String args[]){
       A aa=new A();
       B bb=new B();
       C cc=new C();
       D dd=new D();
       E ee=new E();
       F ff=new F();
       G gg=new G();
       H hh=new H();
       I ii=new I();
       J jj=new J();

       System.out.println(aa.toString());
       System.out.println(bb.toString());
       System.out.println(cc.toString());
       System.out.println(dd.toString());
       System.out.println(ee.toString());
       System.out.println(ff.toString());
       System.out.println(gg.toString());
       System.out.println(hh.toString());
       System.out.println(ii.toString());
       System.out.println(jj.toString());

       A aaa= new A("aaa",new X("xxx"));
       System.out.println(aaa.toString());
   }
}
