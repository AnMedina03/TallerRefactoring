package modelos;

import java.util.ArrayList;

public class Profesor {
    public String codigo;
    public Persona persona;
    public InformacionAdicionalProfesor info;
    public ArrayList<Paralelo> paralelos;

    public Profesor(String codigo, Persona persona) {
        this.codigo = codigo;
        this.persona = persona;
        paralelos= new ArrayList<>();
    }
    
    public Profesor(String codigo, Persona persona, InformacionAdicionalProfesor info) {
        this.codigo = codigo;
        this.persona = persona;
        this.info = info;
        paralelos= new ArrayList<>();
    }

    public InformacionAdicionalProfesor getInfo() {
        return info;
    }

    public void setInfo(InformacionAdicionalProfesor info) {
        this.info = info;
    }

    public ArrayList<Paralelo> getParalelos() {
        return paralelos;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getCodigo() {
        return codigo;
    }
    
    public void anadirParalelos(Paralelo p){
        paralelos.add(p);
    }
    
}
