package com.ligang.controller;

public class Rest {
    public static void main(String[] args) {
        Integer i=1;
//        StringBuffer str=new StringBuffer("a");
        Object b= new String ("a");

        method(i,b);
        System.out.println(i);
        System.out.println(b);

    }
    private static void method(Integer i,Object a){
        i=i+3;
        a = new String("a+b");

    }
}
