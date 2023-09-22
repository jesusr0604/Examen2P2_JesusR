
package examen2p2_jesusrodriguez;

import java.util.ArrayList;


public class ListaRep {
    private String name;
    private int likes;
    private ArrayList <Cancion> can= new ArrayList();

    public ListaRep(String name, int likes) {
        this.name = name;
        this.likes = likes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public ArrayList<Cancion> getCan() {
        return can;
    }

    public void setCan(ArrayList<Cancion> can) {
        this.can = can;
    }
    
    
    
    
}
