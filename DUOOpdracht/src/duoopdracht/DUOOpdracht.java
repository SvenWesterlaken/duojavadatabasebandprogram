/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoopdracht;

import duoopdracht.View.*;

/**
 *
 * @author Kevin & Sven
 */
public class DUOOpdracht {

    /**
     * 
     * @param args 
     */
    public static void main(String[] args){
        HomeFrame HF = new HomeFrame();
        
        try {
            BandViewPaneel.retrieveBands();
            OptredenViewPaneel.retrieveOptredens();
            PodiumViewPaneel.retrievePodiums();
        } catch (Exception e) {}               
    }
    
    
}
