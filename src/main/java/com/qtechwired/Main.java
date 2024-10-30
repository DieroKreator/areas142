package com.qtechwired;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        calcularAreaCuadrado(2);
        calcularAreaRetangulo(2, 5);
        calcularAreaCirculo(4);
        calcularAreaTriangulo(3, 6);
    }

    public static int calcularAreaCuadrado(int num1) {
        int resultado = num1 * num1;
        System.out.println("Area do cuadrado: " + resultado);  
        return resultado;
    }

    public static int calcularAreaRetangulo(int width, int height) {
        int resultado = width * height;
        System.out.println("Area do retangulo: " + resultado);  
        return resultado;
    }

    public static double calcularAreaCirculo(int radious) {
        double pi = 3.14;
        double resultado = pi * Double.valueOf(radious*radious);
        System.out.println("Area do circulo: " + resultado);  
        return resultado;
    }

    public static int calcularAreaTriangulo(int base, int height) {
        int resultado = (base * height) / 2;
        System.out.println("Area do triangulo: " + resultado);  
        return resultado;
    }

}