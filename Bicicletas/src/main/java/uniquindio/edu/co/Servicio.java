package uniquindio.edu.co;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Servicio {
    private String id;
    private Bicicleta bicicleta;
    private String descripcionProblema;
    private LocalDate fechaIngreso;
    private String estado;
    private Mecanico mecanico;
    private List<Tarea> tareas;
    private List<Repuesto> repuestos;
    private List<Bicicleta> bicicletas;
    private List<Servicio> servicios;

    public Servicio(String id, Bicicleta bicicleta, String descripcionProblema,  LocalDate fechaIngreso) {
        this.id = id;
        this.bicicleta = bicicleta;
        this.descripcionProblema = descripcionProblema;
        this.fechaIngreso = fechaIngreso;
        this.estado = "Recibida";
        this.tareas = new ArrayList<>();
        this.repuestos = new ArrayList<>();
    }

    public void asignarMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public void agregarRepuesto(Repuesto repuesto) {
        repuestos.add(repuesto);
    }

    public double calcularCostoTotal() {
        double total = 0;
        for (Tarea t : tareas) total += t.getCosto();
        for (Repuesto r : repuestos) total += r.calcularCosto();
        return total;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }
    public boolean verificarBicicleta(Bicicleta bicicleta) {
        boolean centinela = false;
        for(Bicicleta est: bicicletas) {
            if(est.getId().equals(bicicleta.getId())){
                centinela = true;
            }
        }
        return centinela;
    }

    public void agregarBicicleta(Bicicleta bicicleta){
        if(!verificarBicicleta(bicicleta)){
           bicicletas.add(bicicleta);
            System.out.println("Se agrego");
        }else{
            System.out.println("Ya existe");
        }
    }

    public String getId(String id) {
        return this.id;
    }
    public boolean verificarId(Servicio servicio) {
        boolean centinela = false;
        for(Servicio est:servicios) {
            if(est.getId(id).equals(servicio.getId(id))){
                centinela = true;
            }
        }
        return centinela;
    }

    public void agregarServicio(Servicio servicio){
        if(!verificarId(servicio)){
            servicios.add(servicio);
            System.out.println("Se agrego");
        }else{
            System.out.println("Ya existe");
        }
    }


    @Override
    public String toString() {
        return "Servicio{" +
                "id='" + id + '\'' +
                ", bicicleta=" + bicicleta +
                ", descripcionProblema='" + descripcionProblema + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                ", estado='" + estado + '\'' +
                ", mecanico=" + mecanico +
                ", tareas=" + tareas +
                ", repuestos=" + repuestos +
                ", bicicletas=" + bicicletas +
                ", servicios=" + servicios +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    public String getDescripcionProblema() {
        return descripcionProblema;
    }

    public void setDescripcionProblema(String descripcionProblema) {
        this.descripcionProblema = descripcionProblema;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(List<Tarea> tareas) {
        this.tareas = tareas;
    }

    public List<Repuesto> getRepuestos() {
        return repuestos;
    }

    public void setRepuestos(List<Repuesto> repuestos) {
        this.repuestos = repuestos;
    }

    public List<Bicicleta> getBicicletas() {
        return bicicletas;
    }

    public void setBicicletas(List<Bicicleta> bicicletas) {
        this.bicicletas = bicicletas;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }
}