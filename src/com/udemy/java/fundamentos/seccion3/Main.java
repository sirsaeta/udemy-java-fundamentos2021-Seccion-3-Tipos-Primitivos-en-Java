package com.udemy.java.fundamentos.seccion3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        /*
            comentario
            varias lineas
            tipos primitivos: byte, short, char, int, long
            tipos flotantes: float, double
        */
        varByte();
        varShort();
        varInteger();
        varLong();
        varFloat();
        varDouble();
        InferenciasVarYTiposPrimitivos();
        TipoChar();
        TipoBoolean();
        ConvertirTiposPrimitivos();
    }

    public static void varByte() {
        System.out.println("valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("valor maximo byte: " + Byte.MAX_VALUE);
        byte numeroByte = 10;
        System.out.println("numeroByte = " + numeroByte);
        numeroByte = (byte)129;//para convertirlo
        System.out.println("numeroByte = " + numeroByte);
    }

    public static void varShort() {
        System.out.println("valor minimo short: " + Short.MIN_VALUE);
        System.out.println("valor maximo short: " + Short.MAX_VALUE);
        short numeroShort = 10;
        System.out.println("numeroShort = " + numeroShort);
        numeroShort = (short) 32769;//para convertirlo
        System.out.println("numeroShort = " + numeroShort);
    }

    public static void varInteger() {
        System.out.println("valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("valor maximo int: " + Integer.MAX_VALUE);
        int numeroInteger = 10;
        System.out.println("numeroInteger = " + numeroInteger);
        System.out.println("numeroInteger = " + (numeroInteger+1));
        System.out.println("numeroInteger = " + numeroInteger++);
        System.out.println("numeroInteger = " + ++numeroInteger);
        System.out.println("numeroInteger = " + numeroInteger--);
        System.out.println("numeroInteger = " + --numeroInteger);
        numeroInteger = (int) 2147483649L;//la conversión no soluciona el problema de exeder el numero entero, se usa la lideteral Long
        System.out.println("numeroInteger = " + numeroInteger);
    }

    public static void varLong() {
        System.out.println("valor minimo long: " + Long.MIN_VALUE);
        System.out.println("valor maximo long: " + Long.MAX_VALUE);
        long numeroLong = 10;
        System.out.println("numeroLong = " + numeroLong);
        numeroLong = (long) 9223372036854775809F;//para convertirlo
        System.out.println("numeroLong = " + numeroLong);
    }

    public static void varFloat() {
        System.out.println("valor minimo float: " + Float.MIN_VALUE);
        System.out.println("valor maximo float: " + Float.MAX_VALUE);
        float numeroFloat = 10.0F;
        System.out.println("numeroFloat = " + numeroFloat);
        numeroFloat = (float)3.4028236E38;//para convertirlo
        System.out.println("numeroFloat = " + numeroFloat);
    }

    public static void varDouble() {
        System.out.println("valor minimo Double: " + Double.MIN_VALUE);
        System.out.println("valor maximo Double: " + Double.MAX_VALUE);
        double numeroDouble = 10.5;
        System.out.println("numeroInteger = " + numeroDouble);
    }

    public static void InferenciasVarYTiposPrimitivos() {
        //Inferencia de Tipos con Var y tipos Primitivos
        var numeroEntero = 10;
        System.out.println("numeroEntero = " + numeroEntero);

        var numeroDouble = 10.0;
        System.out.println("numeroDouble = " + numeroDouble);

        var numeroFloat = 10.0F;//solo para F=Float L=Long, D=Double
        System.out.println("numeroFloat = " + numeroFloat);
    }

    public static void TipoChar() {
        //Tipos Primitivos tipo char
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);

        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);

        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);

        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);

        var varChar2 = '\u0021';
        System.out.println("varChar2 = " + varChar2);

        var varCharDecimal2 = 33;
        System.out.println("varCharDecimal2 = " + varCharDecimal2);

        var varCharSimbolo2 = '!';
        System.out.println("varCharSimbolo2 = " + varCharSimbolo2);

        int variableEnteraSimbolo = '!';
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);

        int letra = 'a';
        System.out.println("letra = " + letra);

        letra = 'A';
        System.out.println("letra = " + letra);

        String miCadena = "saeta";
        System.out.println("miCadena = " + miCadena);

        var miCadena2 = "saeta";
        System.out.println("miCadena2 = " + miCadena2);
    }

    public static void TipoBoolean() {
        //Tipos Primitivos tipo boolean
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);
        ValidarBandera(varBoolean);
        varBoolean = false;
        System.out.println("varBoolean = " + varBoolean);
        ValidarBandera(varBoolean);

        Scanner console = new Scanner(System.in);
        System.out.println("Proporciona tu edad");
        int edad = Integer.parseInt(console.nextLine());
        var esAdulto = edad >= 18;
        ValidadEdadBoolean(esAdulto);
        ValidadEdad(edad);
        System.out.println("Proporciona tu edad");
        edad = Integer.parseInt(console.nextLine());
        esAdulto = edad >= 18;
        ValidadEdadBoolean(esAdulto);
        ValidadEdad(edad);
    }

    public static void ValidarBandera(boolean varBoolean) {
        if (varBoolean) {
            System.out.println("La bandera es verdadera");
        }
        else {
            System.out.println("La bandera es falsa");
        }
    }

    public static void ValidadEdadBoolean(boolean esAdulto){
        if (esAdulto) {
            System.out.println("Eres mayor de edad");
        }
        else {
            System.out.println("Eres menor de edad");
        }
    }

    public static void ValidadEdad(int edad){
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }
        else {
            System.out.println("Eres menor de edad");
        }
    }

    public static void ConvertirTiposPrimitivos() {
        //Conversión de Tipos Primitivos en Java - parte 1
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + edad);

        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);

        //Pedir un valor con Scanner
        Scanner console = new Scanner(System.in);
        System.out.println("Proporciona tu edad");
        edad = Integer.parseInt(console.nextLine());
        System.out.println("edad = " + edad);

        var edadTexto = String.valueOf(edad);
        System.out.println("edadTexto = " + edadTexto);

        var cadena = "hola";
        var caracter = cadena.charAt(2);
        System.out.println("caracter = " + caracter);
        caracter = cadena.charAt(0);
        System.out.println("caracter = " + caracter);

        System.out.println("Proporciona un caracter");
        caracter = console.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
    }
}
