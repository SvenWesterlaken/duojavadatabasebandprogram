/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoopdracht.View;

import duoopdracht.Band;
import duoopdracht.Optreden;
import duoopdracht.Podium;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Sven
 */
public class ViewDAO {
    private static ArrayList<Optreden> OptredenLijst = new ArrayList<>();
    private static ArrayList<Podium> PodiumLijst = new ArrayList<>();
    
    public static void retrieveOptredens() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/duo_1", "root", "");
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM optreden");
        
        while (rs.next()) {
            int id = rs.getInt("sleutel");
            String podium = rs.getString("podium");
            String starttime = rs.getString("starttijd");
            String endtime = rs.getString("eindtijd");
            String bandID = rs.getString("Band_artiest");
            
            Optreden optreden = new Optreden(id, podium, starttime, endtime, bandID);
                               
            OptredenLijst.add(optreden);
            
            
        }
    }
    
    public static void retrievePodiums() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/duo_1", "root", "");
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM podium");
        
        while (rs.next()) {
            String id = rs.getString("ID");
            String description = rs.getString("Beschrijving");
            
            Podium podium = new Podium(id, description);
                               
            PodiumLijst.add(podium);
            
            
        }
    }
   
}
