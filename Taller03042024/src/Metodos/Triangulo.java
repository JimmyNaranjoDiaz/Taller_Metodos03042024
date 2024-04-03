/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

/**
 *
 * @author LabSispc05
 */
public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double calcularArea() {
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    public double calcularHipotenusa() {
        double a = Math.min(lado1, Math.min(lado2, lado3));
        double c = Math.max(lado1, Math.max(lado2, lado3));
        double b = calcularPerimetro() - a - c;
        return Math.sqrt(a * a + b * b);
    }

    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(3, 4, 5);

        System.out.println("Area: " + triangulo.calcularArea());
        System.out.println("Perimetro: " + triangulo.calcularPerimetro());
        System.out.println("Hipotenusa: " + triangulo.calcularHipotenusa());
    }
    
}
