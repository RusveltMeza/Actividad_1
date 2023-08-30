/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooer4;

import java.util.Scanner;

/**
 *
 * @author rusve
 */

public class POOER17 {
    public static void main(String[] args) {
        double radio_c, area_c, longitud_c;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio: ");
        radio_c = entrada.nextDouble();
        area_c = Math.PI * (radio_c * radio_c);
        longitud_c = 2 * radio_c * Math.PI;

        System.out.println("El area del circulo es: " + area_c);
        System.out.println("La longitud del circulo es: " + longitud_c);
        entrada.close();
    }
}
