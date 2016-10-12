/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoopdracht.View;
import javax.swing.*;


/**
 *
 * @author Sven
 */
public class BandViewFrame extends JFrame{
    public BandViewFrame() {
        JFrame frame = this;
        frame.setSize(400,400);
        setTitle( "Bekijk Bands en Artiesten" );
        JPanel paneel = new BandViewPaneel();
        frame.setContentPane(paneel);
        frame.setVisible(true);
    }
}
