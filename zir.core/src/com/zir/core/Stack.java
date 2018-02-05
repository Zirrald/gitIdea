package com.zir.core;

import com.zir.util.Print;

import javax.swing.*;

public class Stack {

    private final int stack[];
    private int top;

    Stack(int size) {
        if (size < 1) {
            Print.ln("Stack size should be greater than 1");
            JOptionPane.showMessageDialog (
                    null,
                    "Stack size should be greater than 1",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            stack = new int[size];
        } else {
            stack = new int[size];
            Print.ln("Stack initialized with length: "+stack.length);
            JOptionPane.showMessageDialog (
                    null,
                    "Stack initialized with length: "+stack.length,
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        top = -1;
    }

    public void addValue (int value) {
        if (top == stack.length - 1) {
            Print.ln("Stack is full!");
            JOptionPane.showMessageDialog (
                    null,
                    "Stack is full!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else stack[++top] = value;
    }

    public int getValue () {
        if (top < 0) {
            Print.ln("Stack is empty!");
            JOptionPane.showMessageDialog (
                    null,
                    "Stack is empty!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return 0;
        } else return stack[top--];
    }
}
