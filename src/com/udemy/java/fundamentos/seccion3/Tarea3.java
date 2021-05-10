package com.udemy.java.fundamentos.seccion3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Tarea3 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona el nombre:");
        String nombre = consola.nextLine();
        System.out.println("Proporciona el id:");
        int id = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el precio:");
        double precio = Double.parseDouble(consola.nextLine());
        System.out.println("Proporciona el envio gratuito:");
        boolean envioGratuito = Boolean.parseBoolean(consola.nextLine());

        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Precio: $" + df.format(precio));
        System.out.println("Envio Gratuito: " + envioGratuito);
    }
}
