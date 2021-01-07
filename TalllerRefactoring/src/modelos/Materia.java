package modelos;

public class Materia {

    public String codigo;
    public String nombre;
    public Facultad facultad;
    public double notaInicial;
    public double notaFinal;
    public double notaTotal;

    public double getNotaInicial() {
        return notaInicial;
    }

    public void setNotaInicial(double nexamen, double ndeberes, double nlecciones, double ntalleres) {
        this.notaInicial = calcularNota(nexamen, ndeberes, nlecciones, ntalleres);
    }

    public void setNotaInicial(double notaInicial){
        this.notaInicial = notaInicial;
    }
    
    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double nexamen, double ndeberes, double nlecciones, double ntalleres) {
        this.notaFinal = calcularNota(nexamen, ndeberes, nlecciones, ntalleres);
    }

    public void setNotaFinal(double notaFinal){
        this.notaFinal = notaFinal;
    }
    
    public static double calcularNota(double nexamen, double ndeberes, double nlecciones, double ntalleres) {
        double nota = (nexamen + ndeberes + nlecciones) * 0.80 + (ntalleres) * 0.20;
        return nota;
    }
}
