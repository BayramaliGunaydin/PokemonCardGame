
package javaapplication1;


abstract class oyuncu {
    int oyuncuID;
    static String oyuncuadi;
    static int skor=0;

    public oyuncu(int oyuncuID, String oyuncuadi, int skor) {
        this.oyuncuID = oyuncuID;
        this.oyuncuadi = oyuncuadi;
        oyuncu.skor = skor;
    }
    
    public void KartSecim(){
    
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
        oyuncu.oyuncuadi = oyuncuadi;
    }

    public static int getSkor() {
        return skor;
    }

    public static void setSkor(int skor) {
        oyuncu.skor = skor;
    }
    
}
