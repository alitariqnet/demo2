package com.example2.demo2.Inheritance;

public class SubClass extends SuperClass{
    String name;
    public SubClass(String name) {
        //super should be the first line here can't write anything before its execution
        super(name);
        System.out.println("Inside sub class after sending in Super");
        this.name = name;
    }

    // no need to implement the print() method
    public void sayHello(){
        System.out.println("Hello from subclass");
    }

    public static void main(String[] args) {
        SubClass sb = new SubClass("Umar");
        sb.sayHello();
//        SuperClass sp = new SubClass();
//        sp.sayHello();
//        SuperClass sp2 = new SubClass();
//        sp2.sayHello();
//        sp2.divideByZero();
//        sp2.sayGodIsGreat();
    }
}
