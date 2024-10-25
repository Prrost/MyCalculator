package View;

import Controller.ButtonClickListener;

import javax.swing.*;
import java.awt.*;

public class CalculatorView extends JFrame {
    private JTextArea displayArea;
    private JButton[] buttons;
    private JPanel buttonPanel;
    private JPanel mainPanel;


    public CalculatorView() {
        setTitle("MyCalculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 500);
        setLocationRelativeTo(null);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(Color.BLACK);

        displayArea = new JTextArea();
//        displayArea.setEditable(false);
        displayArea.setFont(new Font("Arial", Font.PLAIN, 24));
        displayArea.setLineWrap(true);
        displayArea.setWrapStyleWord(true);
        displayArea.setBackground(Color.BLACK);
        displayArea.setForeground(Color.WHITE);
        displayArea.setRows(3);
        mainPanel.add(displayArea, BorderLayout.NORTH);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));
//        buttonPanel.setBackground(Color.BLACK);

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "C", "0", "=", "+"
        };

        buttons = new JButton[buttonLabels.length];
        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].setFont(new Font("Arial", Font.BOLD, 20));
            buttons[i].setForeground(Color.WHITE);
            buttons[i].setBackground(Color.DARK_GRAY);
            buttons[i].setOpaque(true);
            buttonPanel.add(buttons[i]);
            buttons[i].addActionListener(new ButtonClickListener(displayArea));
        }
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        add(mainPanel, BorderLayout.CENTER);
    }

    public JTextArea getDisplay() {
        return displayArea;
    }

    public JButton[] getButtons() {
        return buttons;
    }
}
