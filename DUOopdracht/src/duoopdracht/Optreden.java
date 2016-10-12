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
    private String band;
    private String podium;
    private String beginTijd;
    private String eindTijd;

    public Optreden(int id, String p, String begin, String eind, String b) {
        ID = id;
        podium = p;
        beginTijd = begin;
        eindTijd = eind;
        band = b;
        
        System.out.println(ID + podium + beginTijd + eindTijd + band);

    }
}
