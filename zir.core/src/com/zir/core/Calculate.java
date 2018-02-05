package com.zir.core;

import com.zir.util.Print;

import javax.swing.*;

public class Calculate {

    private int number;
    private int tempVal = number;
    private int counter;
    private int stacklength;

    Calculate() {
        Print.ln("Error: missing required arguments!");
        JOptionPane.showMessageDialog(
                null,
                "Error: missing required arguments!",
                "Error",
                JOptionPane.ERROR_MESSAGE);
    }

    Calculate(int number) {
        this.number = number;
        counter = 0;
    }
}
