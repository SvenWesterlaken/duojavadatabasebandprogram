/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoopdracht;
import javax.swing.*;
import java.awt.event.*; 
import javax.swing.border.*;
import java.awt.Color;
import java.awt.GridLayout;

/**
 *
 * @author kvand
 */
public class HomePanel extends JPanel{
    
    
        JPanel HomePanel = new JPanel();
        private JLabel labelwelkom, labelbeschrijving, labelnamen, labelbands, labelpodium, labeloptreden;
        private JButton btntoevoegen, btntoevoegen2, btntoevoegen3 , btnverwijder ,btnverwijder2,btnverwijder3 , 
                btnwijzig, btnwijzig2, btnwijzig3;
     
        public HomePanel(){   
            labelwelkom = new JLabel("Welkom");
            labelwelkom.setHorizontalAlignment(JButton.CENTER);
            
            labelbands = new JLabel("bands");
            labelbands.setHorizontalAlignment(JLabel.LEFT);
            
            btntoevoegen = new JButton("toevoegen");
            btntoevoegen.addActionListener(new ToevoegHandler());
            
            btnverwijder = new JButton("verwijder");
            btnverwijder.addActionListener(new VerwijderHandler());
            
            btnwijzig = new JButton("wijzig");
            btnwijzig.addActionListener(new WijzigHandler());
            
            
            labeloptreden = new JLabel("optreden");
            labeloptreden.setHorizontalAlignment(JLabel.LEFT);
            
            
            btntoevoegen2 = new JButton("toevoegen");
            btntoevoegen2.addActionListener(new Toevoeg2Handler());
            
            btnverwijder2 = new JButton("verwijder");
            btnverwijder2.addActionListener(new Verwijder2Handler());
            
            btnwijzig2 = new JButton("wijzig");
            btnwijzig2.addActionListener(new Wijzig2Handler());
            
            
            labelpodium = new JLabel ("podium");
            labelpodium.setHorizontalAlignment(JLabel.LEFT);
            
            btntoevoegen3 = new JButton("toevoegen");
            btntoevoegen3.addActionListener(new Toevoeg3Handler());
            
            btnverwijder3 = new JButton("verwijder");
            btnverwijder3.addActionListener(new Verwijder3Handler());
            
            btnwijzig3 = new JButton("wijzig");
            btnwijzig3.addActionListener(new Wijzig3Handler());
            
            labelnamen = new JLabel("Kevin en Sven");
            
            
            
            
            
            
            
            add(labelbands);
            add(btntoevoegen);
            add(btnverwijder);
            add(btnwijzig);
            
            add(labeloptreden);
            add(btntoevoegen2);
            add(btnverwijder2);
            add(btnwijzig2);
            
            add(labelpodium);
            add(btntoevoegen3);
            add(btnverwijder3);
            add(btnwijzig3);
            
            add(labelnamen);
                  
        setLayout (new GridLayout (4,5,10,8));
    }
        class ToevoegHandler implements ActionListener {
        
        public void actionPerformed( ActionEvent e ) {
         
         
         
            
        }
    
}
                class Toevoeg2Handler implements ActionListener {
        
        public void actionPerformed( ActionEvent e ) {
         if (e.getSource()== btntoevoegen2) {
             
             
         }
                 
         
            
        }
                }
               class Toevoeg3Handler implements ActionListener {
       
        public void actionPerformed( ActionEvent e ) {
         
         
         
            
        }
        
    
}
                       class WijzigHandler implements ActionListener {
        
        public void actionPerformed( ActionEvent e ) {
         
         
         
            
        }
    
}
                                              class Wijzig2Handler implements ActionListener {
        
        public void actionPerformed( ActionEvent e ) {
         
         
         
            
        }
    
}
                                                                     class Wijzig3Handler implements ActionListener {
        
        public void actionPerformed( ActionEvent e ) {
         
         
         
            
        }
    
}
                               class VerwijderHandler implements ActionListener {
        
        public void actionPerformed( ActionEvent e ) {
         
         
         
            
        }
    
}
                                  class Verwijder2Handler implements ActionListener {
        
        public void actionPerformed( ActionEvent e ) {
         
         
         
            
        }
    
}
                                 class Verwijder3Handler implements ActionListener {
        
        public void actionPerformed( ActionEvent e ) {
         
         
         
            
        }
    
}
    
}



