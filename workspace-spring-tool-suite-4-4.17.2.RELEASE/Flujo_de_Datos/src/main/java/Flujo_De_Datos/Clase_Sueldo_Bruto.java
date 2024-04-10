package Flujo_De_Datos;

import java.io.IOException;

public class Clase_Sueldo_Bruto {
    
    public static void main(String[] args) {
        Clase_Sueldo_Bruto programa = new Clase_Sueldo_Bruto();
        double valorHoraTrabajada = programa.obtenerValorHora("Ingrese el valor por hora trabajada: ");
        int horasTrabajadas = programa.obtenerHoras("Ingrese la cantidad de horas trabajadas: ");
        double sueldoBruto = valorHoraTrabajada * horasTrabajadas;
        
        System.out.println("El sueldo bruto es: $" + sueldoBruto);
    }

    public double obtenerValorHora(String mensaje) {
        System.out.print(mensaje);
        double valor = Double.parseDouble(entradaDeDatos());
        return valor;
    }

    public int obtenerHoras(String mensaje) {
        System.out.print(mensaje);
        int horas = Integer.parseInt(entradaDeDatos());
        return horas;
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
