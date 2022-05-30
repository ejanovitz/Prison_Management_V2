package com.outlook.ejanovitz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrisonerDAO {

    public void addPrisoner(Prisoner prisoner) throws SQLException {
        Connection conn = Database.getInstance().getConnection();

        PreparedStatement p = conn.prepareStatement("INSERT INTO prisoner (firstName, lastName, crime) VALUES (?,?,?)");
        p.setString(1, prisoner.getFirstName());
        p.setString(2, prisoner.getLastName());
        p.setString(3, prisoner.getCrime());
        p.executeUpdate();
        p.close();
        conn.close();
    }

    public Prisoner findPrisoner(String nameToFind) throws SQLException {
        String firstName = "";
        String lastName = "";
        String crime = "";
        int id = 0;

        Connection conn = Database.getInstance().getConnection();
        PreparedStatement p = conn.prepareStatement("SELECT * FROM prisoner WHERE firstName = ?");
        p.setString(1, nameToFind);
        ResultSet resultSet = p.executeQuery();

        while(resultSet.next()){
            id = resultSet.getInt("idprisoner");
            firstName = resultSet.getString("firstName");
            lastName = resultSet.getString("lastName");
            crime = resultSet.getString("Crime");
        }

        p.close();
        conn.close();
        return new Prisoner(id, firstName, lastName, crime);
    }
}
