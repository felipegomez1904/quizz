package incidencias;

public class incidencia {
    private int incidencia,puesto;

    private String error,Estado;

    public incidencia() {
    }

    public incidencia(int incidencia, int puesto, String error) {
        this.incidencia = incidencia;
        this.puesto = puesto;
        this.error = error;
        setEstado("pendiente");
    }

    public int getIncidencia() {
        return incidencia;
    }

    public void setIncidencia(int incidencia) {
        this.incidencia = incidencia;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String resuelve(){
        setEstado("Resuelta");
        setError("Resuelto con Exito");
        return toString();
    }

    @Override
    public String toString() {
        return "incidencia{" +
                "incidencia=" + incidencia +
                ", puesto=" + puesto +
                ", error='" + error + '\'' +
                ", Estado='" + Estado + '\'' +
                '}';
    }
}
