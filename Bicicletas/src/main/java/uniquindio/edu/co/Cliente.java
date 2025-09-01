package uniquindio.edu.co;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String telefono;
    private String id;
    private List<Bicicleta> bicicletas;

    public Cliente(String nombre, String telefono, String id) {

            this.nombre = nombre;
            this.id=id;
            this.telefono = telefono;
            this.bicicletas = new ArrayList<>();
    }

    public void agregarBicicleta(Bicicleta bici) {
        bicicletas.add(bici);
    }

    public List<Bicicleta> getBicicletas() {
        return bicicletas;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setBicicletas(List<Bicicleta> bicicletas) {
        this.bicicletas = bicicletas;
    }
}
