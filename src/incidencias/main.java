package incidencias;

import java.util.ArrayList;
import java.util.List;

public class main {
    public  static void main(String[] args) {
        System.out.println("Incidencias");

    List<incidencia> registro = new ArrayList<>();
    List<incidencia> pendientes= new ArrayList<>();
    incidencia inc1 = new incidencia(1,105, "No tiene acceso a internet");
        System.out.println(inc1);
    incidencia inc2 = new incidencia(2,14, "No arranca");
        System.out.println(inc2);
    incidencia inc3 = new incidencia(3,5, "La pantalla se ve rosa");
        System.out.println(inc3);
    incidencia inc4 = new incidencia(4,237, "Hace un ruido extraño");
        System.out.println(inc4);
    incidencia inc5 = new incidencia(5,111, "Se cuelga al abrir 3 ventanas");
        System.out.println(inc5);
    String arreglado = inc1.resuelve();
        System.out.println(arreglado);
    registro.add(inc1);
        registro.add(inc2);
        registro.add(inc3);
        registro.add(inc4);
        registro.add(inc5);

        for (incidencia inci:registro) {
            if(inci.getEstado()=="pendiente"){
                pendientes.add(inci);
            }
        }

        System.out.println(registro);
        System.out.println("pendiente"+ pendientes);



    }
}

