/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoopdracht.Add;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.border.Border;

/**
 *
 * @author Sven
 */
public class OptredenAddPaneel extends JPanel {
    
    private JLabel lblID, lblPodium, lblBegTijd, lblEindTijd, lblBand;
    private JTextField tbID, tbPodium, tbBegTijd, tbEindTijd, tbBand;
    private JButton btnAdd, btnZoek;
    
    public OptredenAddPaneel(){
        
        lblID = new JLabel("ID: ");
        lblPodium = new JLabel("Podium: ");
        lblBegTijd = new JLabel("Begintijd: ");
        lblEindTijd = new JLabel("Eindtijd: ");
        lblBand = new JLabel("Band: ");
        tbID = new JTextField(5);
        tbPodium = new JTextField(5);
        tbBegTijd = new JTextField(10);
        tbEindTijd = new JTextField(10);
        tbBand = new JTextField(30);
        btnAdd = new JButton("Toevoegen");
   
        btnZoek = new JButton("Zoek");
      
        
        
        add(lblID);
        add(tbID);
        add(lblPodium);
        add(tbPodium);
        add(lblBegTijd);
        add(tbBegTijd);
        add(lblEindTijd);
        add(tbEindTijd);
        add(lblBand);
        add(tbBand);
        add(btnZoek);
        add(btnAdd);
        
           this.setLayout (new GridLayout (6,2,5,5));
            Border border = BorderFactory.createEmptyBorder(10, 10, 10, 10);
            this.setBorder(border);
      
    }
    class AddHandler implements ActionListener {
          @Override
public void actionPerformed( ActionEvent e ) {

String bandID = tbID.getText();
String bandNaam = tbBand.getText();
String podium = tbPodium.getText();
String begTijd = tbBegTijd.getText();
String eindTijd = tbEindTijd.getText();


 try {
Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/duo_1", "root", "");
Statement statement = connection.createStatement();
statement.executeUpdate("INSERT INTO `optreden` (`Sleutel`, `Podium`, `Starttijd`, `Eindtijd`, `Band_Artiest`) VALUES "
        + "('" + bandID + "','" + bandNaam + "','" + podium + "','" + begTijd + "','" + eindTijd + "';)");
       
               
} catch (Exception event){}
              
  tbID.setText("");
  tbID.setText("");
  tbPodium.setText("");
  tbBegTijd.setText("");
  tbEindTijd.setText("");
  
  
  }

     }    
    
}
