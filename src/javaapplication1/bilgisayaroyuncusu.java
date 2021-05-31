
package javaapplication1;


public class bilgisayaroyuncusu extends oyuncu {
    
    int kartlistesi;
    public bilgisayaroyuncusu(int oyuncuID, String oyuncuadi, int skor) {
        super(oyuncuID, oyuncuadi, skor);
    }
    public void KartSecim(){
        
    }

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
        bilgisayaroyuncusu.oyuncuadi = oyuncuadi;
    }

    public static int getSkor() {
        return skor;
    }

    
    public static void setSkor(int skor) {
        bilgisayaroyuncusu.skor = skor;
    }
    
}
