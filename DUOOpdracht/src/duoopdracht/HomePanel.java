package duoopdracht;
import duoopdracht.Add.*;
import duoopdracht.Change.*;
import duoopdracht.Remove.*;
import duoopdracht.View.*;
import javax.swing.*;
import java.awt.event.*; 
import javax.swing.border.*;
import java.awt.GridLayout;


public class HomePanel extends JPanel{
    
    JPanel HomePanel = new JPanel();
    //Categorie Labels
    private final JLabel labelbands, labelpodium, labeloptreden;
    //Informatie Labels
    private final JLabel labelnamen, labelschool;
    //Band buttons
    private final JButton btntoevoegen, btnverwijder, btnwijzig, btnview;
    //Optreden buttons
    private final JButton btntoevoegen2, btnverwijder2, btnwijzig2, btnview2;
    //Podium buttons
    private final JButton btntoevoegen3, btnverwijder3, btnwijzig3, btnview3;
    
    /**
     * Constructor
     */
        public HomePanel(){ 
            
            //Set Layout & Add Border
            this.setLayout (new GridLayout (4,6,5,5));
            Border border = BorderFactory.createEmptyBorder(10, 10, 10, 10);
            this.setBorder(border);
            
            //Labels
            labelbands = new JLabel("bands");
            labeloptreden = new JLabel("optreden");
            labelpodium = new JLabel ("podium");
            
            labelnamen = new JLabel("Kevin en Sven, 23IVT1C");
            labelschool = new JLabel("Avans Breda");
            
            //Align Labels Left
            labelbands.setHorizontalAlignment(JLabel.LEFT);
            labeloptreden.setHorizontalAlignment(JLabel.LEFT);
            labelpodium.setHorizontalAlignment(JLabel.LEFT);

            //Band Buttons
            btntoevoegen = new JButton("toevoegen");
            btnverwijder = new JButton("verwijder");
            btnwijzig = new JButton("wijzig");
            btnview = new JButton("bekijk");
            
            //Add ActionListeners
            btntoevoegen.addActionListener(new OpenHandler());
            btnverwijder.addActionListener(new OpenHandler());
            btnview.addActionListener(new OpenHandler());
            btnwijzig.addActionListener(new OpenHandler());
            
            //Optreden Buttons
            btntoevoegen2 = new JButton("toevoegen");
            btnverwijder2 = new JButton("verwijder");
            btnwijzig2 = new JButton("wijzig");
            btnview2 = new JButton("bekijk");
            
            //Add ActionListeners
            btntoevoegen2.addActionListener(new OpenHandler());
            btnverwijder2.addActionListener(new OpenHandler());
            btnwijzig2.addActionListener(new OpenHandler());
            btnview2.addActionListener(new OpenHandler());

            //Podium Buttons
            btntoevoegen3 = new JButton("toevoegen");
            btnverwijder3 = new JButton("verwijder");
            btnwijzig3 = new JButton("wijzig");
            btnview3 = new JButton("bekijk");
            
            //Add ActionListeners
            btntoevoegen3.addActionListener(new OpenHandler());
            btnverwijder3.addActionListener(new OpenHandler());
            btnwijzig3.addActionListener(new OpenHandler());
            btnview3.addActionListener(new OpenHandler());

            //Add All Labels & Buttons
            
            //Bands
            this.add(labelbands);
            this.add(btntoevoegen);
            this.add(btnverwijder);
            this.add(btnwijzig);
            this.add(btnview);

            //Optreden
            this.add(labeloptreden);
            this.add(btntoevoegen2);
            this.add(btnverwijder2);
            this.add(btnwijzig2);
            this.add(btnview2);

            //Podium
            this.add(labelpodium);
            this.add(btntoevoegen3);
            this.add(btnverwijder3);
            this.add(btnwijzig3);
            this.add(btnview3);

            //Info
            this.add(labelnamen);
            this.add(labelschool);
           
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

 