
package examen2p2_jesusrodriguez;


public class Cancion {
    private String titulo;
    private int duracion;
    private String referencia  ;
    private Album al;
    private Single sin;

    public Cancion(String titulo, int duracion, Album referencia) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.referencia = referencia.getNombre();
       
    }

     public Cancion(String titulo, int duracion, Single referencia) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.referencia = referencia.getNombre();
    }

  

    
     
     
     
    

    public Cancion() {
    }

    
    
    
    
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    
    
    
    
    
    
    
    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", duracion=" + duracion + ", referencia=" + referencia + '}';
    }
    
    
    
    
}
