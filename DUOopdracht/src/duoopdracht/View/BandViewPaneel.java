/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoopdracht.View;

import duoopdracht.Band;
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
public class BandViewPaneel extends JPanel{
    private JTextArea textArea;
    private final static String newline = "\n";
    private static ArrayList<Band> BandLijst = new ArrayList<>();
    
    public static void retrieveBands() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/duo_1", "root", "");
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM band_artiest");
        
        while (rs.next()) {
            int id = rs.getInt("sleutel");
            String name = rs.getString("naam");
            String description = rs.getString("beschrijving");
            
            Band band = new Band(id, name, description);
                               
            BandLijst.add(band);
        }
    }
    
      public BandViewPaneel() {
        textArea = new JTextArea(25, 30);
        JScrollPane jScrollPane = new JScrollPane(textArea); 
        textArea.setEditable(false);
        
                
        for (int i = 0; i < BandLijst.size(); i++) {
           textArea.append(BandLijst.get(i).toString() + newline);
        }
        
        this.add(textArea);
        this.add(jScrollPane);
      }
}
