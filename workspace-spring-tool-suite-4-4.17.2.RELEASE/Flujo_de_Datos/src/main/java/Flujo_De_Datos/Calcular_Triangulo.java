package Flujo_De_Datos;

import java.io.IOException;

public class Calcular_Triangulo {
    
    public static void main(String[] args) {
        Calcular_Triangulo programa = new Calcular_Triangulo();
        int angulo1 = programa.obtenerAngulo("Ingrese el valor del primer ángulo: ");
        int angulo2 = programa.obtenerAngulo("Ingrese el valor del segundo ángulo: ");
        int angulo3 = 180 - angulo1 - angulo2;
        System.out.println("El tercer ángulo es de " + angulo3 + " grados.");
    }

    public int obtenerAngulo(String mensaje) {
        System.out.print(mensaje);
        int angulo = Integer.parseInt(entradaDeDatos());
        return angulo;
    }

    public String entradaDeDatos() {
        String cadena = "";
        try {
            int Byte = -1;
            while ((Byte = System.in.read()) != '\n') {
                if (Byte != 13)
                    cadena += (char) Byte;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return cadena.trim(); // Elimina los espacios en blanco alrededor de la entrada.
    }
}
