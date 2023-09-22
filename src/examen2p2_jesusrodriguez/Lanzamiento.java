/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_jesusrodriguez;

import java.util.Date;

/**
 *
 * @author Jesus
 */
public class Lanzamiento {
    private String nombre;
    private int likes;
   private Date fecha;

    public Lanzamiento(String nombre, int likes, Date fecha) {
        this.nombre = nombre;
        this.likes = likes;
        this.fecha = fecha;
    }

    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return nombre ;
    }
   
   
   
}
