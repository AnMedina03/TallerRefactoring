/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author Andrés Medina Jácome
 */
public class Persona {
    private String nombre, apellido, direccion, telefono;
    private int edad;
    private ArrayList<Paralelo> paralelos;
    
    public Persona(String nombre, String apellido, String direccion, String telefono, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public boolean agregarParalelo(Paralelo p){
        if(p == null){
            return false;
        }
        if(paralelos.contains(p)){
            return true;
        }
        getParalelos().add(p);
        return true;
    }
    
    public boolean quitarParalelo(Paralelo p){
        if(p == null){
            return false;
        }
        return paralelos.remove(p);
    }
    
    public ArrayList<Paralelo> getParalelos(){
        return paralelos;
    }
    
}
