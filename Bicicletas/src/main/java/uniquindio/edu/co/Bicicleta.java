package uniquindio.edu.co;

public class Bicicleta {
    private String id;
    private String marca;
    private String modelo;
    private String color;

    public Bicicleta(String id, String marca, String modelo, String color) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "id='" + id + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
