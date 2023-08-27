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
public class POOER14 {
    public static void main(String[] args) {
        int Numero, Num_cuadrado, Num_cubo;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese un número: ");
        
        Numero = entrada.nextInt();
        Num_cuadrado = Numero * Numero;
        Num_cubo = Numero * Numero * Numero;
        System.out.println ("El cuadrado es: " + Num_cuadrado);
        System.out.println ("El cubo es: " + Num_cubo);
    }
}
