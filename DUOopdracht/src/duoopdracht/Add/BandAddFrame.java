/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoopdracht.Add;

import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author Sven
 */
public class BandAddFrame extends JFrame{
    public BandAddFrame() {
        JFrame frame = this;
         setSize( 750, 200 );
        setLocation(100, 20); 
        JPanel paneel = new BandAddPaneel();
        frame.setContentPane(paneel);
        frame.setVisible(true);
        frame.setTitle("Band toevoegen");
        }
}
