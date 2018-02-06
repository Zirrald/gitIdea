package com.zir.core;

import com.zir.util.Print;

import javax.swing.JOptionPane;

public class Main {
    public static void main (String[] args) {
        JOptionPane.showMessageDialog (
                null,
                "Hello",
                "Yahoo!",
                JOptionPane.PLAIN_MESSAGE);

        Calculate tb;

        int input = Integer.parseInt(JOptionPane.showInputDialog (
                null,
                "Input integer number",
                10));

        tb = new Calculate(input).toBinary();
    }
}