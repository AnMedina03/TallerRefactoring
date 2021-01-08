package modelos;

import java.util.ArrayList;

public class Profesor {
    private String codigo;
    private Persona persona;
    private InformacionAdicionalProfesor info;

    public Profesor(String codigo, Persona persona) {
        this.codigo = codigo;
        this.persona = persona;
    }
    
    public Profesor(String codigo, Persona persona, InformacionAdicionalProfesor info) {
        this.codigo = codigo;
        this.persona = persona;
        this.info = info;
    }

    public InformacionAdicionalProfesor getInfo() {
        return info;
    }

    public void setInfo(InformacionAdicionalProfesor info) {
        this.info = info;
    }

    public ArrayList<Paralelo> getParalelos() {
        return persona.getParalelos();
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
    
    public void agregarParalelo(Paralelo p){
        persona.agregarParalelo(p);
    }
    
    public void quitarParalelo(Paralelo p){
        persona.quitarParalelo(p);
    }
    
}
