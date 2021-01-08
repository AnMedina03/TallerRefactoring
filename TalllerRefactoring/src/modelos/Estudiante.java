package modelos;

import java.util.ArrayList;

public class Estudiante {

    private Persona persona;
    private String matricula;
    private Facultad facultad;

    public Estudiante(String matricula, Facultad facultad, Persona persona) {
        this.matricula = matricula;
        this.facultad = facultad;
        this.persona = persona;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }
    
    public String getNombre(){
        return persona.getNombre();
    }

    public String getApellido(){
        return persona.getApellido();
    }
    
    public double CalcularNota(Paralelo p, double nota, boolean parcial) {
        for (Paralelo par : persona.getParalelos()) {
            if (p.equals(par)) {
                if (parcial) par.getMateria().setNotaInicial(nota);
                else par.getMateria().setNotaFinal(nota);
                return nota;
            }
        }
        return 0;
    }

    public double CalcularNotaTotal(Paralelo p) {
        for (Paralelo par : persona.getParalelos()) {
            if (p.equals(par)) return p.getMateria().getNotaTotal();
        }
        return 0;
    }
    
    public void agregarParalelo(Paralelo p){
        persona.agregarParalelo(p);
    }
    
    public void quitarParalelo(Paralelo p){
        persona.quitarParalelo(p);
    }
    
    public ArrayList<Paralelo> getParalelos(){
        return persona.getParalelos();
    }
}
