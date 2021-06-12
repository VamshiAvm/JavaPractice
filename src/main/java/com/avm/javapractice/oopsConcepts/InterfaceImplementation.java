package com.avm.javapractice.oopsConcepts;

public class InterfaceImplementation implements B,D,C{

    @Override
    public void method1() {
        // TODO Auto-generated method stub
        
        System.out.println("in method1");
    }

    @Override
    public String method3(String a) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String method2(String a) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void methodD() {
        // TODO Auto-generated method stub
        
    }
    public static void main(String[] args) {
        InterfaceImplementation ii = new InterfaceImplementation();
        System.out.println(ii.methodC("vamshi"));
    }

    
}

interface A{
    public void method1();
    public String method2(String a);
}

interface B{
    public void method1();
    public String method3(String a);
}

interface C{
   default public String methodC(String a){
        return "This is interface"+a;
    }
}

interface D extends A {
    public void methodD();
}