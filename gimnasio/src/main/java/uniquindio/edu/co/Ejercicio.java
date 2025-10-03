package uniquindio.edu.co;

public class Ejercicio {
        private int id;
        private String nombre;
        private int series;
        private int repeticiones;
        private int tiempoDescanso; // en segundos

        public Ejercicio(int id, String nombre, int series, int repeticiones, int tiempoDescanso) {
            this.id = id;
            this.nombre = nombre;
            this.series = series;
            this.repeticiones = repeticiones;
            this.tiempoDescanso = tiempoDescanso;
        }

    @Override
    public String toString() {
        return "Ejercicio{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", series=" + series +
                ", repeticiones=" + repeticiones +
                ", tiempoDescanso=" + tiempoDescanso +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public int getTiempoDescanso() {
        return tiempoDescanso;
    }

    public void setTiempoDescanso(int tiempoDescanso) {
        this.tiempoDescanso = tiempoDescanso;
    }
}

