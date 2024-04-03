/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

/**
 *
 * @author LabSispc05
 */
public class Cuadrado {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(4); 

        double area = cuadrado.calcularArea();
        System.out.println("El area del cuadrado es: " + area);

        double perimetro = cuadrado.calcularPerimetro();
        System.out.println("El perimetro del cuadrado es: " + perimetro);
}
}