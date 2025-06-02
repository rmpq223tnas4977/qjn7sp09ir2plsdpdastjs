import Prueba.Visual.frontend.PruebaVisual;
import Prueba.Visual.backend.Prueba;
public class Main {
    public static void main(String[] args) {
        Prueba NuevaPrueba = new Prueba();
        PruebaVisual frontend = new PruebaVisual(NuevaPrueba);
        frontend.setVisible(true);
        system.out.println(".");
    }
}