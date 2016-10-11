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
public class Band {
    private int bandID;
    private String naam;
    private String beschrijving;

    public Band() {
        
    }

    public Band(int id, String na, String beschr) {
        bandID = id;
        naam = na;
        beschrijving = beschr;
        
        System.out.println(naam);
    }
}
