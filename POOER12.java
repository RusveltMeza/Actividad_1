/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pooer4;

/**
 *
 * @author rusve
 */
public class POOER12 {
     public static void main(String[] args) {
        double Rete_Fuente, Salario_Bruto, Salario_Neto;
        Salario_Bruto = 48*5000;
        Rete_Fuente = Salario_Bruto*0.125;
        Salario_Neto = Salario_Bruto-Rete_Fuente;
        System.out.println("El salario bruto es: "+ Salario_Bruto);
        System.out.println("La retencion en la fuente es de: "+ Rete_Fuente);
        System.out.println("El salario neto es: "+ Salario_Neto);
    }
}
