package Atividade2;

public class Carta {
   private final String face, naipe;

    public Carta(String face, String naipe) {
        this.face = face;
        this.naipe = naipe;
    }
    
    public String toString(){
        return face+" de "+naipe;    
    }
}