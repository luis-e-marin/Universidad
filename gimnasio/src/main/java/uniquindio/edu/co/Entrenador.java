package uniquindio.edu.co;

public class Entrenador {
        private int id;
        private String nombre;
        private String certificacion;
        private int aniosExperiencia;
        private boolean disponibilidad;

        public Entrenador(int id, String nombre, String certificacion, int aniosExperiencia, boolean disponible) {
            this.id = id;
            this.nombre = nombre;
            this.certificacion = certificacion;
            this.aniosExperiencia = aniosExperiencia;
            this.disponibilidad = disponible;
        }

    @Override
    public String toString() {
        return "Entrenador{" +
                "idEntrenador=" + id +
                ", nombre='" + nombre + '\'' +
                ", certificacion='" + certificacion + '\'' +
                ", aniosExperiencia=" + aniosExperiencia +
                ", disponible=" + disponibilidad +
                '}';
    }

    public int getIdEntrenador() {
        return id;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.id = idEntrenador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCertificacion() {
        return certificacion;
    }

    public void setCertificacion(String certificacion) {
        this.certificacion = certificacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public boolean isDisponible() {
        return disponibilidad;
    }

    public void setDisponible(boolean disponible) {
        this.disponibilidad = disponible;
    }
}

