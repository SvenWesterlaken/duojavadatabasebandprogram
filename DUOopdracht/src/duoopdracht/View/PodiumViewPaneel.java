/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoopdracht.View;

import duoopdracht.Podium;
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
public class PodiumViewPaneel extends JPanel{
    private static ArrayList<Podium> PodiumLijst = new ArrayList<>();
    private JTextArea textArea;
    private final static String newline = "\n";
    
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
    
    public PodiumViewPaneel() {
        textArea = new JTextArea(25, 30);
        JScrollPane jScrollPane = new JScrollPane(textArea); 
        textArea.setEditable(false);
        
                
        for (int i = 0; i < PodiumLijst.size(); i++) {
           textArea.append(PodiumLijst.get(i).toString() + newline);
        }
        
        this.add(textArea);
        this.add(jScrollPane);
      }
}
