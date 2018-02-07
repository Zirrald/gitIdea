package com.zir.core;

import com.zir.util.Print;

import javax.swing.JOptionPane;

public class Calculate {

    private int number;
    private int stackLength;

    Calculate (int number) {
        this.number = number;
    }

    public Calculate toBinary () {

        /* Local vars */
        String result = "In binary: ";
        int tempVal = number;

        /* Calculate stack length */
        for (stackLength=0; tempVal != 0; tempVal /= 2, stackLength++);

        /* Register stack */
        Stack stack = new Stack(stackLength);

        /* Fill up stack */
        for (; number != 0; stack.addValue(number % 2), number /= 2);

        /* Form output */
        for (int i=0, counter = 0; i < stackLength; result += stack.getValue(), i++, counter++) {
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
