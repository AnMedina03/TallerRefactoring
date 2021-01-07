/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Facultad {
    private String nombre;
    private List<Estudiante> list_est;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Estudiante> getList_est() {
        return list_est;
    }

    public void setList_est(List<Estudiante> list_est) {
        this.list_est = list_est;
    }
    
    
}
