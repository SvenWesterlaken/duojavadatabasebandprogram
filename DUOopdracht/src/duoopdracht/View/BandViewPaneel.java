/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoopdracht.View;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Sven
 */
public class BandViewPaneel extends JPanel{
    public JTextArea textArea;
    private final static String newline = "\n";
    
      public BandViewPaneel() {
        textArea = new JTextArea(25, 30);
        JScrollPane scrollPane = new JScrollPane(textArea); 
        textArea.setEditable(false);
        
                
        textArea.append(ViewDAO.getBand().toString() + newline);
        
        this.add(textArea);
      }
}
