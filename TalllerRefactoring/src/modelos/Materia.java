package modelos;

public class Materia {

    private String codigo;
    private String nombre;
    private Facultad facultad;
    private double notaInicial;
    private double notaFinal;
    private double notaTotal;

    public double getNotaInicial() {
        return notaInicial;
    }

    public void setNotaInicial(double nexamen, double ndeberes, double nlecciones, double ntalleres) {
        this.notaInicial = calcularNota(nexamen, ndeberes, nlecciones, ntalleres);
        this.notaTotal = (getNotaFinal() + getNotaFinal())/2;
    }

    public void setNotaInicial(double notaInicial){
        this.notaInicial = notaInicial;
        this.notaTotal = (notaInicial + getNotaFinal())/2;
    }
    
    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double nexamen, double ndeberes, double nlecciones, double ntalleres) {
        this.notaFinal = calcularNota(nexamen, ndeberes, nlecciones, ntalleres);
        this.notaTotal = (getNotaFinal() + getNotaFinal())/2;
    }

    public void setNotaFinal(double notaFinal){
        this.notaFinal = notaFinal;
        this.notaTotal = (notaInicial + getNotaFinal())/2;
    }
    
    public static double calcularNota(double nexamen, double ndeberes, double nlecciones, double ntalleres) {
        return   (nexamen + ndeberes + nlecciones) * 0.80 + (ntalleres) * 0.20;
    }

    public double getNotaTotal() {
        return notaTotal;
    }
    
}
