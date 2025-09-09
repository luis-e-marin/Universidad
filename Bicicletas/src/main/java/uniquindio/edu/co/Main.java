package uniquindio.edu.co;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.Callable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Crear Bicicleta
        Bicicleta bicicleta = new Bicicleta("1547", "Sayaka", "x2bt5", "Negro");
        Bicicleta bicicleta1 = new Bicicleta("1547", "GW", "X34RT", "Azul");

        //Crear Propietario
        Cliente cliente = new Cliente("Luis","+57 322587198","8425");
        cliente.agregarBicicleta(bicicleta1);
        Cliente cliente1 = new Cliente("Pedro","+51 25487153","5784");
        cliente1.agregarBicicleta(bicicleta);

       //Crear Mecanico
        Mecanico mecanico = new Mecanico("154802","Samuel","Frenos");
        Mecanico mecanico1 = new Mecanico("140894","Jose","Pintura");
        Mecanico mecanico2 = new Mecanico("154803","Juan","Llantas");

        //Crear Repuestos
        Repuesto repuesto = new Repuesto("Pastilla de frenos",2,15.000);
        Repuesto repuesto1 = new Repuesto("Llanta",2,80.000);
        Repuesto repuesto2 = new Repuesto("Pintura completa",1,120.000);

        //Crear Tarea
        Tarea tarea = new Tarea("Pintura",150.000);
        Tarea tarea1 = new Tarea("Frenos",10.000);

        //Crear Servicio
        Servicio servicio = new Servicio("14ti58",bicicleta1,"Cambio de pastillas de freno", LocalDate.of(2025,12,5));
        servicio.asignarMecanico(mecanico);
        servicio.agregarTarea(tarea1);
        servicio.agregarRepuesto(repuesto);

        Servicio servicio1 = new Servicio("14ti58",bicicleta,"Pintura General", LocalDate.of(2025,12,5));
        servicio1.asignarMecanico(mecanico1);
        servicio1.agregarRepuesto(repuesto2);
        servicio1.agregarTarea(tarea);

        System.out.println(servicio1);
        System.out.println("Costo total: " + servicio.calcularCostoTotal());
    }
}