package uniquindio.edu.co;

public class Mecanico {
    private String id;
    private String nombre;
    private String especialidad;

    public Mecanico(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Mecanico{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
