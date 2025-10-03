package uniquindio.edu.co;

import java.util.ArrayList;
import java.util.List;

    public class Gimnasio {
        private int id;
        private String nombre;
        private String rnt;
        private String direccion;
        private String telefono;
        private List<Miembro> miembros;

        public Gimnasio(int id, String nombre, String rnt, String direccion, String telefono) {
            this.id = id;
            this.nombre = nombre;
            this.rnt = rnt;
            this.direccion = direccion;
            this.telefono = telefono;
            this.miembros = new ArrayList<>();
        }

        public void registrarMiembro(Miembro miembro) {
            miembros.add(miembro);
        }

        public List<Miembro> getMiembros() {
            return miembros;
        }



}
