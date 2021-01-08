package modelos;

public class Materia {

    private String codigo;
    private String nombre;
    private Facultad facultad;
    private Nota notas;

    public Materia(String codigo, String nombre, Facultad facultad, Nota notas) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.facultad = facultad;
        this.notas = notas;
    }

    public Materia(String codigo, String nombre, Facultad facultad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.facultad = facultad;
        this.notas = new Nota();
    }

    public double getNotaInicial() {
        return notas.getNotaInicial();
    }

    public void setNotaInicial(double nexamen, double ndeberes, double nlecciones, double ntalleres) {
        this.notas.setNotaInicial(calcularNota(nexamen, ndeberes, nlecciones, ntalleres));
        this.notas.setNotaTotal((getNotaFinal() + getNotaFinal())/2);
    }

    public void setNotaInicial(double notaInicial){
        this.notas.setNotaInicial(notaInicial);
        this.notas.setNotaTotal((getNotaFinal() + getNotaFinal())/2);
    }
    
    public double getNotaFinal() {
        return notas.getNotaFinal();
    }

    public void setNotaFinal(double nexamen, double ndeberes, double nlecciones, double ntalleres) {
        this.notas.setNotaFinal(calcularNota(nexamen, ndeberes, nlecciones, ntalleres));
        this.notas.setNotaTotal((getNotaFinal() + getNotaFinal())/2);
    }

    public void setNotaFinal(double notaFinal){
        this.notas.setNotaFinal(notaFinal);
        this.notas.setNotaTotal((getNotaFinal() + getNotaFinal())/2);
    }
    
    public static double calcularNota(double nexamen, double ndeberes, double nlecciones, double ntalleres) {
        return   (nexamen + ndeberes + nlecciones) * 0.80 + (ntalleres) * 0.20;
    }

    public double getNotaTotal() {
        return notas.getNotaTotal();
    }
    
}
