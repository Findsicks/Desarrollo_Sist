package Flujo_De_Datos;

import java.io.IOException;

public class Tiempo {
    
    public static void main(String[] args) {
        Tiempo programa = new Tiempo();
        int segundos = programa.obtenerTiempo("Ingrese el tiempo en segundos: ");
        
        int dias = segundos / (24 * 3600);
        segundos = segundos % (24 * 3600);
        
        int horas = segundos / 3600;
        segundos %= 3600;
        
        int minutos = segundos / 60;
        segundos %= 60;
        
        System.out.println("El tiempo es de " + dias + " días, " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");
    }

    public int obtenerTiempo(String mensaje) {
        System.out.print(mensaje);
        int tiempo = Integer.parseInt(entradaDeDatos());
        return tiempo;
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
