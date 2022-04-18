package com.datastructureexercice;

import java.util.LinkedList;
import java.util.List;

public class ThePersonClass {

    private String name ;
    private int age;

    public ThePersonClass(String name, int age) {
        this.name = name;
        this.age = age;
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

    public static void main(String[] args) {

        List<ThePersonClass> Person = new LinkedList<>();
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ThePersonClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
