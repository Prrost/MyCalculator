package Controller;

import Model.CalculatorModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonClickListener implements ActionListener {
    private JTextArea displayArea;
    private int num1;
    private int num2;
    private String sign;

    public ButtonClickListener(JTextArea displayArea) {
        this.displayArea = displayArea;
    }

    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        String buttonText = clickedButton.getText();


        if (buttonText.equals("C")) {
            displayArea.setText("");
            num1 = 0;
            num2 = 0;
        }
        else if (buttonText.equals("+")) {
            displayArea.append("\n+\n");
            sign = buttonText;
        }
        else if (buttonText.equals("-")) {
            displayArea.append("\n-\n");
        }
        else if (buttonText.equals("*")) {
            displayArea.append("\n*\n");
        }
        else if (buttonText.equals("/")) {
            displayArea.append("\n/\n");
        }
        else if (buttonText.equals("=")) {
            String[] parts = displayArea.getText().split("\n");
            String firstNumber = parts[0].trim();
            String secondNumber = parts[2].trim();
            String operator = parts[1].trim();
            num1 = Integer.parseInt(firstNumber.trim());
            num2 = Integer.parseInt(secondNumber);
            sign = operator;
            displayArea.setText("");
            String s = CalculatorModel.calculate(num1, num2, sign);
            displayArea.append(num1 + sign + num2 + "=" + s);
        } else {
            displayArea.append(buttonText);
        }
    }
}