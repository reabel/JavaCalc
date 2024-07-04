package com.reabelx.JavaCalc;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MigSample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        // Create a text pane
        final JTextPane textPane = new JTextPane();
        String paneText = "0";
        textPane.setText(paneText);
        textPane.setPreferredSize(new Dimension(200, 200));
        // create radio buttons

        textPane.setText(paneText);

        // Define button labels
        final String[] buttonLabels = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };

        // Create a panel to hold the buttons
        JPanel numberPanel = new JPanel();
        numberPanel.setLayout(new GridLayout(4, 3));
        // Iterate over the button labels
        //TODO: for each actionlistener, add to an array, then when pressing = we'll use both arrays to calculate the result.
        for (final String label : buttonLabels) {
            // Create a new JButton for each label
            JButton button = new JButton(label);
        
            // Add an ActionListener to append the label to textPane's text
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textPane.setText(textPane.getText() + label);
                }
            });
        
            // Add the button to the panel
            numberPanel.add(button);
        }

        // create the panel that contains the other buttons
        // JPanel buttonPanel = new JPanel(new MigLayout("filly, wrap 2")); // filly
        // tells it to take up all the vertical space
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3,2));
        final String[] operatorStrings = { "+", "-", "*", "/", "=" };
        //TODO: handle = differently.  It should evaluate the expression and display the result.
        for (final String operator : operatorStrings) {
            JButton button = new JButton(operator);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textPane.setText(textPane.getText() + '\n' + operator + '\n');
                }
            });
            buttonPanel.add(button);
        }
        // add growy to all components so they will fit the cell height
        // buttonPanel.add(equalBtn, "span 1 2, growy"); // span 1 2 tells this component to span 1 column and 2 rows
        // buttonPanel.add(addBtn, "growy");
        // buttonPanel.add(subBtn, "growy");
        // buttonPanel.add(mulBtn, "growy");
        // buttonPanel.add(divBtn, "growy");

        // create the main contentPane
        // JPanel contentPane = new JPanel(new MigLayout("filly")); // again, we want to
        // fill the vertical space so the 2 panels will have the same height
        JPanel contentPane = new JPanel();
        contentPane.add(textPane, "growy");
        contentPane.add(numberPanel, "growy");
        contentPane.add(buttonPanel, "growy");

        frame.setContentPane(contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}