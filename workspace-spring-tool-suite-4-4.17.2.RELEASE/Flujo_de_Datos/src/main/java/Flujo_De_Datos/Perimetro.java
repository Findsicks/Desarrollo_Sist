package Flujo_De_Datos;

import java.io.IOException;

public class Perimetro {
    
    public static void main(String[] args) {
        Perimetro programa = new Perimetro();
        double superficieCuadrado = programa.obtenerSuperficieCuadrado("Ingrese el valor de la superficie del cuadrado: ");
        double lado = Math.sqrt(superficieCuadrado);
        double perimetro = 4 * lado;
        System.out.println("El perímetro del cuadrado es de " + perimetro + " metros.");
    }

    public double obtenerSuperficieCuadrado(String mensaje) {
        System.out.print(mensaje);
        double superficie = Double.parseDouble(entradaDeDatos());
        return superficie;
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

        return cadena.trim(); 
    }
}

