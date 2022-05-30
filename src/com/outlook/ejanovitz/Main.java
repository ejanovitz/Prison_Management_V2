package com.outlook.ejanovitz;

import javax.swing.*;


public class Main {

    private static void createAndShowGUI(){
        Prisoner p = new Prisoner();
        View v = new View();
        Controller c = new Controller(p, v);
        c.initController();

    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
