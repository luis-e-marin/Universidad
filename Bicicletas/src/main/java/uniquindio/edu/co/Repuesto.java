package uniquindio.edu.co;

public class Repuesto {
    private String nombre;
    private int cantidad;
    private double costoUnitario;

    public Repuesto(String nombre, int cantidad, double costoUnitario) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.costoUnitario = costoUnitario;
    }

    public double calcularCosto() {
        return cantidad * costoUnitario;
    }

    @Override
    public String toString() {
        return "Repuesto{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", costoUnitario=" + costoUnitario +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }
}
