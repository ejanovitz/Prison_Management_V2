package com.outlook.ejanovitz;

public class Prisoner {

    private String firstName, lastName, crime;
    private int id;

    public Prisoner(int id, String firstName, String lastName, String crime){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.crime = crime;


    }

    public Prisoner(String firstName, String lastName, String crime){
        this.firstName = firstName;
        this.lastName = lastName;
        this.crime = crime;
    }

    public Prisoner(){}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getCrime() { return crime; }

    public void setCrime(String crime) { this.crime = crime; }
}
