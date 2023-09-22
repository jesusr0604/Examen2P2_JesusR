
package examen2p2_jesusrodriguez;

import java.util.Date;


public class Single extends Lanzamiento{
    private Cancion cancion;

    public Single(Cancion cancion, String nombre, int likes, Date fecha) {
        super(nombre, likes, fecha);
        this.cancion = cancion;
    }

  

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }
    
    
}
