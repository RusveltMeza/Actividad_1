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
public class POOER5 {
    public static void main(String[] args) {
        double suma, x, y;
        suma = 0;
        x = 20;
        y = 40;

        suma = suma + x;
        x = x+Math.pow(y,2);
        suma =suma + (x/y);
        System.out.println("El valor de la suma es: " + suma);
    }
}
