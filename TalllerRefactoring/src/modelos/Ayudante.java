package modelos;

import java.util.ArrayList;

public class Ayudante {
    private Estudiante est;
    private ArrayList<Paralelo> paralelos;
    
    public Ayudante(Estudiante e){
    	est = e;
    }
    
    public String getMatricula() {
        return est.getMatricula();
    }
    
    public void setMatricula(String matricula) {
        est.setMatricula(matricula);
    }
    
    public String getNombre() {
        return est.getNombre();
    }

    public String getApellido() {
        return est.getApellido();
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
    
    public void MostrarParalelos(){
        for(Paralelo par:paralelos){
            //Muestra la info general de cada paralelo
        }
    }
}
