package com.example2.demo2.Inheritance;

public class SuperClass implements DingDongInterface {
    String name;
    public SuperClass(String name) {
        System.out.println("Inside super class after sending in Super");
        this.name = name;

    }

    /**
     *
     */
    @Override
    public void printName() {

    }

    public void sayHello(){
        System.out.println("Hello from superclass");
    }

    /**
     *
     */
//    @Override
//    public void sayGodIsGreat() {
//        System.out.println("Inside SuperClass and God is Great!");
//    }

    public void divideByZero() throws ArithmeticException{
//            System.out.println(1 / 0);
    }

    public static void main(String[] args) {
//        SubClass sb = new SubClass();
//        sb.sayHello();

    }
}
