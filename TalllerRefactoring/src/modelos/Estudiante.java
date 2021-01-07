package modelos;

import java.util.ArrayList;

public class Estudiante {

    public Persona persona;
    public String matricula;
    public Facultad facultad;
    public ArrayList<Paralelo> paralelos;

    public Estudiante(String matricula, Facultad facultad, Persona persona) {
        this.matricula = matricula;
        this.facultad = facultad;
        this.persona = persona;
        paralelos = new ArrayList<>();
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

    public double CalcularNota(Paralelo p, double nota, boolean parcial) {
        for (Paralelo par : paralelos) {
            if (p.equals(par)) {
                if (parcial) par.getMateria().setNotaInicial(nota);
                else par.getMateria().setNotaFinal(nota);
            }
        }
        return nota;
    }

    public double CalcularNotaTotal(Paralelo p) {
        double notaTotal = 0;
        for (Paralelo par : paralelos) {
            if (p.equals(par)) notaTotal = (p.getMateria().notaInicial + p.getMateria().notaFinal) / 2;
        }
        return notaTotal;
    }
}
