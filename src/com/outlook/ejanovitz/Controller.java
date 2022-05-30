package com.outlook.ejanovitz;

import java.sql.SQLException;

public class Controller {

    private Prisoner prisoner;
    private View view;
    private PrisonerDAO prisonerDAO = new PrisonerDAO();


    public Controller(Prisoner p, View v){
       this.prisoner = p;
       this.view = v;

    }

    public void initController(){
        view.getEnterButton().addActionListener(e -> addName());
        view.getExitButton().addActionListener(e -> exit());
        view.getFindButton().addActionListener(e -> findPrisoner());
    }

    private void addName(){
        String firstName = view.getFirstNameTextField().getText();
        String lastName = view.getLastNameTextField().getText();
        String crime = view.getCrimeTextField().getText();
        try{
            prisonerDAO.addPrisoner(new Prisoner(firstName, lastName, crime));
        } catch(SQLException throwables){
            throwables.printStackTrace();
        }
    }

    private void exit(){
        view.getMainFrame().dispose();
    }

    private void findPrisoner(){
        String nameToFind = view.getFirstNameTextField().getText();

        try{
            Prisoner prisoner = prisonerDAO.findPrisoner(nameToFind);
            view.setResultsTextArea(prisoner.getId() + " - " + prisoner.getFirstName() + ", " + prisoner.getLastName() + " - " + prisoner.getCrime() + "\n");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
