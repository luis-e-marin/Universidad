package uniquindio.edu.co;

import java.util.ArrayList;
import java.util.List;

    public class Rutina {
        private int id;
        private String objetivo;
        private int duracionSemanas;
        private TipoNivel nivel;
        private String fechaActualizacion;
        private Entrenador entrenador;
        private List<Ejercicio> ejercicios;

        public Rutina(int id, String objetivo, int duracionSemanas, TipoNivel nivel, String fechaActualizacion, Entrenador entrenador) {
            this.id = id;
            this.objetivo = objetivo;
            this.duracionSemanas = duracionSemanas;
            this.nivel = nivel;
            this.fechaActualizacion = fechaActualizacion;
            this.entrenador = entrenador;
            this.ejercicios = new ArrayList<>();
        }

        @Override
        public String toString() {
            return "Rutina{" +
                    "idRutina=" + id +
                    ", objetivo='" + objetivo + '\'' +
                    ", duracionSemanas=" + duracionSemanas +
                    ", nivel=" + nivel +
                    ", fechaUltimaActualizacion='" + fechaActualizacion + '\'' +
                    ", entrenador=" + entrenador +
                    ", ejercicios=" + ejercicios +
                    '}';
        }

        public int getIdRutina() {
            return id;
        }

        public void setIdRutina(int idRutina) {
            this.id = idRutina;
        }

        public String getObjetivo() {
            return objetivo;
        }

        public void setObjetivo(String objetivo) {
            this.objetivo = objetivo;
        }

        public int getDuracionSemanas() {
            return duracionSemanas;
        }

        public void setDuracionSemanas(int duracionSemanas) {
            this.duracionSemanas = duracionSemanas;
        }

        public TipoNivel getNivel() {
            return nivel;
        }

        public void setNivel(TipoNivel nivel) {
            this.nivel = nivel;
        }

        public String getFechaUltimaActualizacion() {
            return fechaActualizacion;
        }

        public void setFechaUltimaActualizacion(String fechaUltimaActualizacion) {
            this.fechaActualizacion = fechaUltimaActualizacion;
        }

        public Entrenador getEntrenador() {
            return entrenador;
        }

        public void setEntrenador(Entrenador entrenador) {
            this.entrenador = entrenador;
        }

        public List<Ejercicio> getEjercicios() {
            return ejercicios;
        }

        public void setEjercicios(List<Ejercicio> ejercicios) {
            this.ejercicios = ejercicios;
        }
    }
