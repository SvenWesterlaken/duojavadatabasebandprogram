package duoopdracht;
import duoopdracht.Add.*;
import duoopdracht.Change.*;
import duoopdracht.Remove.*;
import duoopdracht.View.*;
import javax.swing.*;
import java.awt.event.*; 
import javax.swing.border.*;
import java.awt.Color;
import java.awt.GridLayout;


public class HomePanel extends JPanel{
    
    
 JPanel HomePanel = new JPanel();
 private final JLabel labelwelkom, labelnamen, labelbands, labelpodium, labeloptreden, labelschool, labelklas;
 private final JButton btntoevoegen, btntoevoegen2, btntoevoegen3 , btnverwijder ,btnverwijder2, btnverwijder3, 
 btnwijzig, btnwijzig2, btnwijzig3, btnview, btnview2, btnview3;
     
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

            btnview = new JButton("View");
            btnview.addActionListener(new OpenHandler());
            
            
            labeloptreden = new JLabel("optreden");
            labeloptreden.setHorizontalAlignment(JLabel.LEFT);


            btntoevoegen2 = new JButton("toevoegen");
            btntoevoegen2.addActionListener(new OpenHandler());

            btnverwijder2 = new JButton("verwijder");
            btnverwijder2.addActionListener(new OpenHandler());

            btnwijzig2 = new JButton("wijzig");
            btnwijzig2.addActionListener(new OpenHandler());

            btnview2 = new JButton("View");
            btnview2.addActionListener(new OpenHandler());

            labelpodium = new JLabel ("podium");
            labelpodium.setHorizontalAlignment(JLabel.LEFT);

            btntoevoegen3 = new JButton("toevoegen");
            btntoevoegen3.addActionListener(new OpenHandler());

            btnverwijder3 = new JButton("verwijder");
            btnverwijder3.addActionListener(new OpenHandler());

            btnwijzig3 = new JButton("wijzig");
            btnwijzig3.addActionListener(new OpenHandler());

            btnview3 = new JButton("View");
            btnview3.addActionListener(new OpenHandler());

            labelnamen = new JLabel("Kevin en Sven");
            labelklas = new JLabel("23IVT1C");
            labelschool = new JLabel("Avans Breda");

            add(labelbands);
            add(btntoevoegen);
            add(btnverwijder);
            add(btnwijzig);
            add(btnview);

            add(labeloptreden);
            add(btntoevoegen2);
            add(btnverwijder2);
            add(btnwijzig2);
            add(btnview2);


            add(labelpodium);
            add(btntoevoegen3);
            add(btnverwijder3);
            add(btnwijzig3);
            add(btnview3);

            add(labelnamen);
            add(labelklas);
            add(labelschool);
                  
        setLayout (new GridLayout (4,6,8,8));
    }
        class OpenHandler implements ActionListener {
        
          @Override
          public void actionPerformed( ActionEvent e ) {
              if (e.getSource() == btntoevoegen) {
                  new BandAddFrame();
              } else if (e.getSource () == btntoevoegen2) {
                  new OptredenAddFrame();
              } else if (e.getSource() == btntoevoegen3) {
                  new PodiumAddFrame();
              } else if (e.getSource() == btnverwijder) {
                  new BandRemoveFrame();
              } else if (e.getSource() == btnverwijder2) {
                  new OptredenRemoveFrame();
              } else if (e.getSource() == btnverwijder3) {
                  new PodiumRemoveFrame();
              } else if (e.getSource() == btnwijzig) {
                  new BandChangeFrame();
              } else if (e.getSource() == btnwijzig2) {
                  new OptredenChangeFrame();
              } else if (e.getSource() == btnwijzig3) {
                  new PodiumChangeFrame();
              } else if (e.getSource() == btnview) {
                  new BandViewFrame();
              } else if (e.getSource() == btnview2) {
                  new OptredenViewFrame();
              } else if (e.getSource() == btnview3) {
                  new PodiumViewFrame();
              }
          }   
        }
}

 