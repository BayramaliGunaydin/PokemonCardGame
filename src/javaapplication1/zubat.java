package javaapplication1;

import javax.swing.ImageIcon;


public class zubat extends Pokemon {   
    private static int hasarpuani=50;
    private static String image="src\\img\\zubat.png";
    ImageIcon icon=new ImageIcon(image);
    public  zubat(){
      super(8,"zubat","hava"); 
        pokemonadi="zubat";
        pokemontip="hava";
        pokemonID=8;
}
    public zubat(int ID,String tip,String ad ){
              super(ID,ad,tip);
              ID=pokemonID;
              tip=pokemontip;
              ad=pokemonadi;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }

    public int getHasarpuani() {
        return hasarpuani;
    }

    public void setHasarpuani(int hasarpuani) {
        this.hasarpuani = hasarpuani;
    }

    public int getPokemonID() {
        return pokemonID;
    }

    public void setPokemonID(int pokemonID) {
        this.pokemonID = pokemonID;
    }

    public String getPokemonadi() {
        return pokemonadi;
    }

    public void setPokemonadi(String pokemonadi) {
        this.pokemonadi = pokemonadi;
    }

    public String getPokemontip() {
        return pokemontip;
    }

    public void setPokemontip(String pokemontip) {
        this.pokemontip = pokemontip;
    }
}