package Controller;

import Model.CalculatorModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonClickListener implements ActionListener {
    private final JTextArea displayArea;


    public ButtonClickListener(JTextArea displayArea) {
        this.displayArea = displayArea;
    }

    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        String buttonText = clickedButton.getText();

        switch (buttonText) {
            case "C":
                displayArea.setText("");

                break;
            case "+":
            case "-":
            case "/":
            case "*":
                displayArea.append("\n" + buttonText + "\n");
                break;
            case "=":
                Equal();
                break;
            default:
                displayArea.append(buttonText);
                break;
        }
    }

    private void Equal(){
        String[] parts = displayArea.getText().split("\n");

        String firstNumber = parts[0].trim();
        String secondNumber = parts[2].trim();
        String operator = parts[1].trim();


        displayArea.setText("");
        String s = CalculatorModel.calculate(Integer.parseInt(firstNumber), Integer.parseInt(secondNumber), operator);
        displayArea.append(firstNumber + operator + secondNumber + "=" + s);
    }
}