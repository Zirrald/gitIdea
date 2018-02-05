package com.zir.core;

import com.zir.util.Print;

public class Stack {

    private final int stack[];
    private int top;

    public Stack(int size) {
        if (size < 1) {
            Print.ln("Stack size should be greater than 1");
            stack = new int[size];
        } else {
            stack = new int[size];
            Print.ln("Stack initialized with length: "+stack.length);
        }
        top = -1;
    }

    public void addValue (int value) {
        if (top == stack.length - 1) {
            Print.ln("Stack is full!");
        } else stack[++top] = value;
    }

    public int getValue () {
        if (top < 0) {
            Print.ln("Stack is empty!");
            return 0;
        } else return stack[top--];
    }
}
