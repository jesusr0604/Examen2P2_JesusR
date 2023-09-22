
package examen2p2_jesusrodriguez;

import java.util.ArrayList;
import java.util.Date;


public class Album extends Lanzamiento {
    private ArrayList<Cancion> canciones= new ArrayList();
    private int cantidadcancion;

    public Album(String nombre, int likes, Date fecha) {
        super(nombre, likes, fecha);
    }

    public Album(int cantidadcancion, String nombre, int likes, Date fecha) {
        super(nombre, likes, fecha);
        this.cantidadcancion = cantidadcancion;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public int getCantidadcancion() {
        return cantidadcancion;
    }

    public void setCantidadcancion(int cantidadcancion) {
        this.cantidadcancion = cantidadcancion;
    }

   
    
    
    
    
    
}
