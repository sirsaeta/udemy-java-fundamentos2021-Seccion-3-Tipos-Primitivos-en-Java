package com.udemy.java.fundamentos.seccion3;

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
}
