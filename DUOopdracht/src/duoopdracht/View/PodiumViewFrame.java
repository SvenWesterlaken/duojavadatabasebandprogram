/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoopdracht.View;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Sven
 */
public class PodiumViewFrame extends JFrame{
    public PodiumViewFrame() {
        JFrame frame = this;
        frame.setSize(400,400);
        frame.setVisible(true);
        setTitle( "Podiums" );
        JPanel paneel = new PodiumViewPaneel();
        frame.setContentPane(paneel);
    }
}
