/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoopdracht;

import java.util.ArrayList;

/**
 *
 * @author Sven
 */
public class Band {

    public int bandID;
    public String BandNaam;
    public String BandBeschrijving;

    public Band(int id, String na, String beschr) {
        bandID = id;
        BandNaam = na;
        BandBeschrijving = beschr;
    }

    public int getBandID() {
        return bandID;
    }

    public String getBandNaam() {
        return BandNaam;
    }

    public String getBandBeschrijving() {
        return BandBeschrijving;
    }
    
    
   @Override
   public String toString() {
        return ("ID: " + this.getBandID() + "\n" + "Naam: " + this.getBandNaam() + "\n" + "Beschrijving: " + this.getBandBeschrijving() + "\n");
   }
}
