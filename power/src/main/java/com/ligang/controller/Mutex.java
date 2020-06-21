package com.ligang.controller;

public class Mutex {
    public String a(){
        return "xxxx";
    }
    public void access() {
        synchronized (new Object()){
            try {
                Thread.sleep(1000);
                System.out.println("1111111111111");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    public static void main(String[] args) {
        final Mutex mutex=new Mutex();
        new Thread(mutex::access).start();
    }
}
