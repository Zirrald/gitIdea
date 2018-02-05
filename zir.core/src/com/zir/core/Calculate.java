package com.zir.core;

import com.zir.util.Print;

import javax.swing.*;

public class Calculate {

    private int number;
    private int stackLength;

    Calculate () {
        Print.ln("Error: missing required arguments!");
        JOptionPane.showMessageDialog (
                null,
                "Error: missing required arguments!",
                "Error",
                JOptionPane.ERROR_MESSAGE);
    }

    Calculate (int number) {
        this.number = number;
    }

    public Calculate toBinary () {

        /* Local vars */
        int reminder;
        String result = "In binary: ";

        /* Calculate stack length */
        int tempVal = number;
        for (stackLength=0; tempVal != 0; stackLength++) {
            tempVal /= 2;
        }

        /* Register stack */
        Stack stack = new Stack(stackLength);

        // Fill up stack
        for (; number != 0;) {
            reminder = number % 2;
            stack.addValue(reminder);
            number /= 2;
        }

        /* Form output */
        int counter = 0;
        for (int i=0; i < stackLength; i++) {
            result += stack.getValue();
            counter++;
            if (counter == 4) {
                result += " ";
                counter = 0;
            }
        }

        /* Release output */
        Print.ln(result);
        JOptionPane.showMessageDialog (
                null,
                result,
                "Result",
                JOptionPane.INFORMATION_MESSAGE);

        return null;
    }
}
