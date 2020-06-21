package com.ligang;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import javax.annotation.sql.DataSourceDefinition;
import java.util.Vector;

public class TestClone {
    private String name;
    private int age;
    private Vector v;

    public TestClone() {
        System.out.println("XXXXXXXX");;
    }

    public TestClone newInstance()  {
        try {
            return (TestClone) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Vector getV() {
        return v;
    }

    public void setV(Vector v) {
        this.v = v;
    }
    @Test
    public void test(){
        TestClone t1=new TestClone();
        t1.setName("maomao");
        Vector vec=new Vector();
        vec.add(111);
        t1.setV(vec);

        TestClone t2=t1.newInstance();
        t2.setName("fanfan");
        t2.getV().add("222");

        System.out.println("------------------");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t1==t2);
        System.out.println(t1.getV().get(0));
        System.out.println(t2.getV().get(0));

    }
}
