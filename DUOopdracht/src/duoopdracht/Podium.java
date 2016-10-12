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
public class Podium {
    private String podiumID, beschrijving;

    public Podium(String id, String beschr) {
        podiumID = id;
        beschrijving = beschr;
        
        System.out.println(podiumID);
    }

}
