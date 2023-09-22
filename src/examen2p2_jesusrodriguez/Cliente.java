
package examen2p2_jesusrodriguez;

import java.util.ArrayList;


public class Cliente extends Usuario  {
    private ArrayList <Cancion> cancion= new ArrayList();
    private ArrayList <ListaRep> lis= new ArrayList();
    private ArrayList <ListaRep> lisr= new ArrayList();

    public Cliente(String tipo, String username, String password, int age) {
        super(tipo, username, password, age);
    }

    public ArrayList<Cancion> getCancion() {
        return cancion;
    }

    public void setCancion(ArrayList<Cancion> cancion) {
        this.cancion = cancion;
    }

    public ArrayList<ListaRep> getLis() {
        return lis;
    }

    public void setLis(ArrayList<ListaRep> lis) {
        this.lis = lis;
    }

    public ArrayList<ListaRep> getLisr() {
        return lisr;
    }

    public void setLisr(ArrayList<ListaRep> lisr) {
        this.lisr = lisr;
    }
    
 
}
