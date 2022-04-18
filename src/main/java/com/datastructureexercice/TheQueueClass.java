package com.datastructureexercice;

import javax.xml.namespace.QName;
import java.util.LinkedList;
import java.util.Queue;

public class TheQueueClass {

    public static void main(String[] args) {
        Queue<ThePersonClass> supermarket = new LinkedList<>();
        // filling the Queue
        supermarket.add(new ThePersonClass("alex",21));
        supermarket.add(new ThePersonClass("ahmed",22));
        supermarket.add(new ThePersonClass("hassan",26));
        // displaying size
        System.out.println(supermarket.size());
        // displaying the queue ( peek here shows the first element  )
        System.out.println(supermarket.peek());
        System.out.print("peek end here \n");
        //  poll shows the first element and retrieve it
        System.out.println(supermarket.poll());
        System.out.print("poll end here \n");
        //displaying
        System.out.println(supermarket.peek());



    }
}