package com.datastructureexercice;

import java.util.Stack;

public class TheStackClass {

    public static void main(String[] args) {
   // creating a stack object
        Stack<Integer> stack =  new Stack<>();
   // adding elements to the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
   // displaying the stack
        System.out.println(stack.peek());
   // removing an elemnt  from the stack
        System.out.println(stack.pop());
   // displaying the stack after removing
        System.out.println(stack.peek());

    }
}
