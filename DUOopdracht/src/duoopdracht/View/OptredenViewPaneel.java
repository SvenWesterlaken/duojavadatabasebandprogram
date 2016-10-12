/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoopdracht.View;

import duoopdracht.Optreden;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Sven
 */
public class OptredenViewPaneel extends JPanel{
    private static ArrayList<Optreden> OptredenLijst = new ArrayList<>();
    private JTextArea textArea;
    private final static String newline = "\n";
    
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
    
    public OptredenViewPaneel() {
        textArea = new JTextArea(25, 30);
        JScrollPane jScrollPane = new JScrollPane(textArea); 
        textArea.setEditable(false);
        
                
        for (int i = 0; i < OptredenLijst.size(); i++) {
           textArea.append(OptredenLijst.get(i).toString() + newline);
        }
        
        this.add(textArea);
        this.add(jScrollPane);
    }
}
