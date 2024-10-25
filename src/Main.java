import View.CalculatorView;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        try{
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        }catch(Exception e){
            e.printStackTrace();
        }
        CalculatorView calculatorView = new CalculatorView();
        calculatorView.setVisible(true);


        
        
        

    }
}