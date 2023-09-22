/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_jesusrodriguez;

import java.util.ArrayList;

/**
 *
 * @author Jesus
 */
public class Artista extends Usuario {
    private String nombreart;
    private ArrayList<Cancion> can= new ArrayList();
    private ArrayList<Album> al= new ArrayList();

    public Artista(String nombreart, String tipo, String username, String password, int age) {
        super(tipo, username, password, age);
        this.nombreart = nombreart;
    }

    public String getNombreart() {
        return nombreart;
    }

    public void setNombreart(String nombreart) {
        this.nombreart = nombreart;
    }

    public ArrayList<Cancion> getCan() {
        return can;
    }

    public void setCan(ArrayList<Cancion> can) {
        this.can = can;
    }

    public ArrayList<Album> getAl() {
        return al;
    }

    public void setAl(ArrayList<Album> al) {
        this.al = al;
    }
    

    
    
    
    
    public Artista(String tipo, String username, String password, int age) {
        super(tipo, username, password, age);
    }
 }
