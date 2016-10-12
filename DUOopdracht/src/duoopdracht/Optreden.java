/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duoopdracht;

/**
 *
 * @author Sven
 */
public class Optreden {
    private int ID;
    private String band, podium, beginTijd, eindTijd;
    
    public Optreden(int id, String p, String begin, String eind, String b) {
        ID = id;
        podium = p;
        beginTijd = begin;
        eindTijd = eind;
        band = b;
    }
    
    public int getID() {
        return ID;
    }

    public String getBand() {
        return band;
    }

    public String getPodium() {
        return podium;
    }
    
    public String getBeginTijd() {
        return beginTijd;
    }
    public String getEindTijd() {
        return eindTijd;
    }

   @Override
   public String toString() {
        return ("ID: " + this.getID() + "\n" + 
                "Podium: " + this.getPodium() + "\n" + 
                "Begintijd: " + this.getBeginTijd() + "\n" +
                "Eindtijd: " + this.getEindTijd() + "\n" +
                "Band: " + this.getBand() + "\n");
   }
}
