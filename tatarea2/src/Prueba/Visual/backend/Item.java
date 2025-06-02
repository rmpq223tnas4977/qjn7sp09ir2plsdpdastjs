package Prueba.Visual.backend;

public class Item {
    private String Tipo;
    private String Enunciado;
    private String Respuesta;
    private String Opcion;

    public Item(String Tipo, String Enunciado, String Respuesta, String Opcion) {
        this.Tipo = Tipo;
        this.Enunciado = Enunciado;
        this.Respuesta = Respuesta;
        this.Opcion = Opcion;
    }

    public String getTipo() {
        return Tipo;
    }

    public String getEnunciado() {
        return Enunciado;
    }

    public String getOpcion() {
        return Opcion;
    }

    public String getRespuesta() {
        return Respuesta;
    }
}