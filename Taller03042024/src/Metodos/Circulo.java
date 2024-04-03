/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

/**
 *
 * @author LabSispc05
 */
public class Circulo {
    private double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void mostrarInfo() {
        System.out.println("Radio del circulo: " + radio);
        System.out.println("Area del circulo: " + calcularArea());
        System.out.println("Perímetro del circulo: " + calcularPerimetro());
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0); 
        circulo.mostrarInfo(); 
    }
    
}
