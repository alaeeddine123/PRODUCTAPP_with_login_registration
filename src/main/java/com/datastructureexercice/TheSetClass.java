package com.datastructureexercice;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

public class TheSetClass {

    public static void main(String[] args) {
        Set<ThePersonClass> person = new HashSet<>();

        person.add(new ThePersonClass("alex", 21));
        person.add(new ThePersonClass("alex", 21));
        person.add(new ThePersonClass("hamid", 31));
        person.add(new ThePersonClass("lotfi", 51));
        // to remove
        person.remove(new ThePersonClass("lotfi", 51));
        System.out.println(person.size());
        person.forEach(System.out::println);

    }

    // added this block of code to make haset display duplicatesn
   /* static class ThePersonClass {
        private  String name;
        private  int age;

        public ThePersonClass(String name , int age){
                this.name =  name;
                this.age  = age ;
            }
    // overridding equals and to String for a proper usage of hashset no duplicates
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ThePersonClass that = (ThePersonClass) o;
            return age == that.age && Objects.equals(name, that.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public String toString() {
            return "ThePersonClass{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }*/


}
