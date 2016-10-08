/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoopdracht;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Kevin & Sven
 */
public class DUOOpdracht {

    /**
     * 
     * @param args 
     * @throws java.sql.SQLException 
     */
    public static void main(String[] args) throws SQLException {
        HomeFrame HF = new HomeFrame();
        
        /*
                      -- Maak Connectie met Database DUO_1 --
                         Username: 'Root', Password: Geen
            Root is het standaard 'administrator' account in de database
        */
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/DUO_1", "root", "");
        Statement statement = connection.createStatement();
        ResultSet resultset = statement.executeQuery("SELECT * FROM band_artiest;");
        
        /*
        while (resultset.next()) {
            int Sleutel = resultset.getInt("Sleutel");
            String Naam = resultset.getString("Naam");
            String Beschrijving = resultset.getString("Beschrijving");
            System.out.println(Sleutel + " " + Naam + " " + Beschrijving);
        }
        */
    }
    
}
