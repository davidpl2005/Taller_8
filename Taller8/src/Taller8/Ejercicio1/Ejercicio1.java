package Taller8.Ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Nizan", 100);
        vehiculo.mostrarInformacion();
        
        Coche coche = new Coche("Toyota", 200, 4);
        coche.mostrarInformacion();
    }
}
