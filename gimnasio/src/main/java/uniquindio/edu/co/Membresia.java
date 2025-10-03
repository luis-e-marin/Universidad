package uniquindio.edu.co;

public class Membresia {

        private TipoMembresia tipo;
        private String fechaVencimiento;


    /**
     * Constructor de la clase Membresia
     * @param tipo
     * @param fechaVencimiento
     */
    public Membresia(TipoMembresia tipo, String fechaVencimiento) {
            this.tipo = tipo;
            this.fechaVencimiento = fechaVencimiento;
        }

    @Override
    public String toString() {
        return "Membresia{" +
                "tipo=" + tipo +
                ", fechaVencimiento='" + fechaVencimiento + '\'' +
                '}';
    }

    public TipoMembresia getTipo() {
        return tipo;
    }

    public void setTipo(TipoMembresia tipo) {
        this.tipo = tipo;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}

