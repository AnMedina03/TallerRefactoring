package modelos;

public class calcularSueldoProfesor {
    
    public double calcularSueldo(Profesor prof){
        return prof.getInfo().getAñosdeTrabajo() *600 + prof.getInfo().getBonoFijo();
    }  
}
