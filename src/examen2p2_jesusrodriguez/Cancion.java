
package examen2p2_jesusrodriguez;


public class Cancion {
    private String titulo;
    private int duracion;
    private String referencia  ;

    public Cancion(String titulo, int duracion, String referencia) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.referencia = referencia;
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
