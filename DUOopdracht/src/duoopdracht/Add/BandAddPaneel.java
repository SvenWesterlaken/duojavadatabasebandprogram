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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.border.Border;

/**
 *
 * @author Sven
 */
public class BandAddPaneel extends JPanel {
    
    private JLabel lblID, lblNaam, lblBeschr;
    private JTextField tbID, tbNaam, tbBeschr;
    private JButton btnAdd, btnDel;
    
   
    public BandAddPaneel(){
        
lblID = new JLabel("ID: ");
lblNaam = new JLabel("Bandnaam: ");
lblBeschr = new JLabel("Beschrijving: ");
tbID = new JTextField(5);
tbNaam = new JTextField(30);
tbBeschr = new JTextField(70);
btnAdd = new JButton("Toevoegen");
btnDel = new JButton("Annuleer");


btnAdd.addActionListener(new AddHandler());
btnDel.addActionListener(new KnopHandler());

        
        
        
 add(lblID);
 add(tbID);
 add(lblNaam);
 add(tbNaam);
 add(lblBeschr);
 add(tbBeschr);
 add(btnDel);
 add(btnAdd);
 
        
        this.setLayout (new GridLayout (4,2,5,5));
        Border border = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        this.setBorder(border);
        
    }
    
    class AddHandler implements ActionListener {
          @Override
public void actionPerformed( ActionEvent e ) {

String bandID = tbID.getText();
String bandNaam = tbNaam.getText();
String bandBeschr = tbBeschr.getText();
 try {
Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/duo_1", "root", "");
Statement statement = connection.createStatement();
statement.executeUpdate("INSERT INTO `band_artiest` (`Sleutel`, `Naam`, `Beschrijving`) VALUES ( '" + bandID + ",'" + bandNaam + "','" + bandBeschr + "');");
       
               
} catch (Exception event){}
              
  tbID.setText("");
  tbNaam.setText("");
  tbBeschr.setText(""); 
  
  }

     }
    
class KnopHandler implements ActionListener {
    @Override
public void actionPerformed( ActionEvent d ) {
    if(d.getSource() == btnDel) {
  tbID.setText("");
  tbNaam.setText("");
  tbBeschr.setText("");  
 
     
     
      
  }
}
}



}

     
