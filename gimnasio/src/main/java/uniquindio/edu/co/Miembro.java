package uniquindio.edu.co;

import java.util.ArrayList;
import java.util.List;

    public class Miembro {
        private int id;
        private String nombre;
        private String documentoIdentidad;
        private Membresia membresia;
        private List<Rutina> rutinas;

        public Miembro(int id, String nombre, String documentoIdentidad, Membresia membresia) {
            this.id = id;
            this.nombre = nombre;
            this.documentoIdentidad = documentoIdentidad;
            this.membresia = membresia;
            this.rutinas = new ArrayList<>();
        }

        @Override
        public String toString() {
            return "Miembro{" +
                    "idMiembro=" + id +
                    ", nombre='" + nombre + '\'' +
                    ", documentoIdentidad='" + documentoIdentidad + '\'' +
                    ", membresia=" + membresia +
                    ", rutinas=" + rutinas +
                    '}';
        }

        public int getIdMiembro() {
            return id;
        }

        public void setIdMiembro(int idMiembro) {
            this.id = idMiembro;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDocumentoIdentidad() {
            return documentoIdentidad;
        }

        public void setDocumentoIdentidad(String documentoIdentidad) {
            this.documentoIdentidad = documentoIdentidad;
        }

        public Membresia getMembresia() {
            return membresia;
        }

        public void setMembresia(Membresia membresia) {
            this.membresia = membresia;
        }

        public List<Rutina> getRutinas() {
            return rutinas;
        }

        public void setRutinas(List<Rutina> rutinas) {
            this.rutinas = rutinas;
        }
    }

