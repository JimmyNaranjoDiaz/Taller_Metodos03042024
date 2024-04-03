/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author LabSispc05
 */
public class Persona {
    public static void calcularEdad(LocalDate fechaNacimiento) {
        LocalDate fechaActual = LocalDate.now();

        Period periodo = Period.between(fechaNacimiento, fechaActual);
        int años = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();

        System.out.println("La persona tiene " + años + " años, " + meses + " meses y " + dias + " días de vida.");
    }

    public static void main(String[] args) {
        LocalDate fechaNacimiento = LocalDate.of(1990, 5, 15);

        calcularEdad(fechaNacimiento);
    }
}
