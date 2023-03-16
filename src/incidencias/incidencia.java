package incidencias;

public class incidencia {
    private int codigo;

    private String error;



    public incidencia() {
    }

    public incidencia(int codigo, String error) {
        this.codigo = codigo;
        this.error = error;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    private void resuelve(){


    }
}
