
package examen2p2_jesusrodriguez;

import java.util.ArrayList;


public class Cliente extends Usuario {
    private ArrayList <Cancion> cancion= new ArrayList();
    private ArrayList <ListaRep> lis= new ArrayList();
    

    public Cliente(String tipo, String username, String password, int age) {
        super(tipo, username, password, age);
    }
}
