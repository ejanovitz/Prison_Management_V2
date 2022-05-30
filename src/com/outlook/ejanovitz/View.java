package com.outlook.ejanovitz;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class View {
    private final JTextField firstNameTextField;
    private final JTextField lastNameTextField;
    private final JTextField crimeTextField;

    private final JButton findButton;
    private final JButton enterButton;
    private final JButton exitButton;

    private final JTextArea resultsTextArea;

    public JFrame getMainFrame() {
        return mainFrame;
    }

    private final JFrame mainFrame;
    public JTextField getFirstNameTextField() {
        return firstNameTextField;
    }

    public JTextField getLastNameTextField() {
        return lastNameTextField;
    }

    public JButton getFindButton() {
        return findButton;
    }

    public JButton getEnterButton() {
        return enterButton;
    }

    public JButton getExitButton() {
        return exitButton;
    }

    public void setResultsTextArea(String data) {
        this.resultsTextArea.append(data);
    }

    public JTextField getCrimeTextField() { return crimeTextField; }

    public View(){
        mainFrame = new JFrame();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel firstNamePanel = new JPanel();
        JPanel lastNamePanel = new JPanel();
        JPanel crimePanel = new JPanel();
        JPanel buttonPanel = new JPanel(new GridBagLayout());
        JPanel centralPanel = new JPanel();

        JLabel titleLabel = new JLabel("Prison Management System");
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        JLabel firstNameLabel = new JLabel("First Name");
        JLabel lastNameLabel = new JLabel("Last Name");
        JLabel crimeLabel = new JLabel("Crime");

        firstNameTextField = new JTextField("", 15);
        lastNameTextField = new JTextField("", 15);
        crimeTextField = new JTextField("", 15);

        findButton = new JButton("Find");
        enterButton = new JButton("Enter");
        exitButton = new JButton("Exit");

        resultsTextArea = new JTextArea(4, 15);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,10,5,10);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;

        firstNamePanel.add(firstNameLabel);
        firstNamePanel.add(firstNameTextField);

        lastNamePanel.add(lastNameLabel);
        lastNamePanel.add(lastNameTextField);

        crimePanel.add(crimeLabel);
        crimePanel.add(crimeTextField);

        centralPanel.add(firstNamePanel);



        gbc.gridy = 0;
        buttonPanel.add(findButton, gbc);
        gbc.gridy = 1;
        buttonPanel.add(enterButton, gbc);
        gbc.gridy = 2;
        buttonPanel.add(exitButton, gbc);




        mainFrame.add(titleLabel, BorderLayout.NORTH);
        mainFrame.add(centralPanel, BorderLayout.CENTER);
        //mainFrame.add(lastNamePanel);
        //mainFrame.add(crimePanel);
        mainFrame.add(buttonPanel, BorderLayout.WEST);
        mainFrame.add(resultsTextArea, BorderLayout.SOUTH);


        mainFrame.pack();
        mainFrame.setVisible(true);


    }
}
