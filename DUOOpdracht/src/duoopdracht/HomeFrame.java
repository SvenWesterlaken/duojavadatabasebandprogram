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
public class HomeFrame extends JFrame{
    
    public HomeFrame(){
            
      
    setSize( 750, 200 );
    setLocation(100, 20);    //added 
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    
    setTitle( "Opdracht 4.1" );
    setContentPane( new HomePanel() );
    setVisible( true );
      }
        
    }


    

