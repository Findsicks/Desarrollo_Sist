package Flujo_De_Datos;

import java.io.IOException;

public class Convertir_far_Celcius {
    
    public static void main(String[] args) {
        Convertir_far_Celcius programa = new Convertir_far_Celcius();
        double valorFarh = programa.obtenerValorFahrenheit("Ingrese el valor en grados Fahrenheit: ");
        double valorCelcius = (valorFarh - 32.0) * 0.55;
        System.out.println("El valor en Celsius es " + valorCelcius);
    }

    public double obtenerValorFahrenheit(String mensaje) {
        System.out.print(mensaje);
        double valor = Double.parseDouble(entradaDeDatos());
        return valor;
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
