package incidencias;

import java.util.ArrayList;
import java.util.List;

public class main {
    public  static void main(String[] args) {
        System.out.println("Incidencias");
    }
    incidencia inc1 = new incidencia(105, "No tiene acceso a internet");
    incidencia inc2 = new incidencia(14, "No arranca");
    incidencia inc3 = new incidencia(5, "La pantalla se ve rosa");
    incidencia inc4 = new incidencia(237, "Hace un ruido extraño");
    incidencia inc5 = new incidencia(111, "Se cuelga al abrir 3 ventanas");

    List<String> incidencias = new ArrayList<>();

        incidencias.add();
        incidencias.add();
        incidencias.add();
        incidencias.add();
        incidencias.add();

    inc2.resuelve("El equipo no estaba enchufado");
    inc3.resuelve("Cambio del cable VGA");
    System.out.println(inc1);
    System.out.println(inc2);
    System.out.println(inc3);
    System.out.println(inc4);
    System.out.println(inc5);
    System.out.println("Incidencias pendientes: " + incidencia.getPendientes());

}

