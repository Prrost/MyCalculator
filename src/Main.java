import View.CalculatorView;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
        How to use calculator:
        1)Run project
        2)Use buttons to add first number
        3)Use buttons to choose operator
        4)Use buttons to add second number
        5)Clock "="
        6)Now you have answer
        7)To perform next calculation use "C" to clear TextArea

        This calculator can only perform operations with two numbers
         */

        try{
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        }catch(Exception e){
            e.printStackTrace();
        }
        CalculatorView calculatorView = new CalculatorView();
        calculatorView.setVisible(true);


        
        
        

    }
}