
package javaapplication1;


abstract class Pokemon {
    int pokemonID;
    String pokemonadi;
    String pokemontip;
    public void pokemon(String pad,String ptip,int pıd){
        pokemonadi=pad;
        pokemontip=ptip;
        pokemonID=pıd;
    }

    public Pokemon(int pokemonID, String pokemonadi, String pokemontip) {
        this.pokemonID = pokemonID;
        this.pokemonadi = pokemonadi;
        this.pokemontip = pokemontip;
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

    String getImage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
