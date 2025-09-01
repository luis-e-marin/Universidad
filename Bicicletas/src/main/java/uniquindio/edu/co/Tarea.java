package uniquindio.edu.co;

public class Tarea {
    private String descripcion;
    private double costo;

    public Tarea(String descripcion, double costo) {
        this.descripcion = descripcion;
        this.costo = costo;
    }


    @Override
    public String toString() {
        return "Tarea{" +
                "descripcion='" + descripcion + '\'' +
                ", costo=" + costo +
                '}';
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
