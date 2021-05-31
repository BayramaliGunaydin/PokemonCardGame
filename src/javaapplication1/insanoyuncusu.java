/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.JTextField;


public class insanoyuncusu extends oyuncu {

    static void setOyuncuadi(JTextField jTextField1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    int kartlistesi;
    public insanoyuncusu(int oyuncuID, String oyuncuadi, int skor) {
        super(oyuncuID, oyuncuadi, skor);
    }
    
    public void KartSecim(){}

    public int getKartlistesi() {
        return kartlistesi;
    }

    public void setKartlistesi(int kartlistesi) {
        this.kartlistesi = kartlistesi;
    }

    public int getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public static String getOyuncuadi() {
        return oyuncuadi;
    }

    
    public static void setOyuncuadi(String oyuncuadi) {
        insanoyuncusu.oyuncuadi = oyuncuadi;
    }

    public static int getSkor() {
        return skor;
    }

    public static void setSkor(int skor) {
        insanoyuncusu.skor = skor;
    }
    
    
    
}
