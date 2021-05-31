package javaapplication1;

import javax.swing.ImageIcon;


public class psyduck extends Pokemon {   
   private static int hasarpuani=20;
    private static String image="src\\img\\psyduck.png";
    ImageIcon icon=new ImageIcon(image);
    public  psyduck(){
      super(6,"pysduck","su"); 
        pokemonadi="psyduck";
        pokemontip="su";
        pokemonID=6;
}
    public psyduck(int ID,String tip,String ad ){
              super(ID,ad,tip);
              ID=pokemonID;
              tip=pokemontip;
              ad=pokemonadi;
    }

    public int getHasarpuani() {
        return hasarpuani;
    }

    public void setHasarpuani(int hasarpuani) {
        this.hasarpuani = hasarpuani;
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