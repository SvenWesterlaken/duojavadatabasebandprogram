package duoopdracht;
import duoopdracht.BandAdd.BandAddFrame;
import javax.swing.*;
import java.awt.event.*; 
import javax.swing.border.*;
import java.awt.Color;
import java.awt.GridLayout;


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
        btntoevoegen.addActionListener(new OpenHandler());
            
        btnverwijder = new JButton("verwijder");
        btnverwijder.addActionListener(new OpenHandler());
            
        btnwijzig = new JButton("wijzig");
        btnwijzig.addActionListener(new OpenHandler());
            
            
        labeloptreden = new JLabel("optreden");
        labeloptreden.setHorizontalAlignment(JLabel.LEFT);
            
            
         btntoevoegen2 = new JButton("toevoegen");
         btntoevoegen2.addActionListener(new OpenHandler());
            
         btnverwijder2 = new JButton("verwijder");
         btnverwijder2.addActionListener(new OpenHandler());
            
         btnwijzig2 = new JButton("wijzig");
         btnwijzig2.addActionListener(new OpenHandler());
            
            
          labelpodium = new JLabel ("podium");
          labelpodium.setHorizontalAlignment(JLabel.LEFT);
            
          btntoevoegen3 = new JButton("toevoegen");
          btntoevoegen3.addActionListener(new OpenHandler());
            
            btnverwijder3 = new JButton("verwijder");
            btnverwijder3.addActionListener(new OpenHandler());
            
            btnwijzig3 = new JButton("wijzig");
            btnwijzig3.addActionListener(new OpenHandler());
            
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
        class OpenHandler implements ActionListener {
        
          public void actionPerformed( ActionEvent e ) {
              if (e.getSource() == btntoevoegen) {
                  new BandAddFrame();
              } else if (e.getSource () == btntoevoegen2) {
                  
              }
          }   
        }
}

 