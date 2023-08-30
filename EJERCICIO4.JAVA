import java.util.Scanner;


* @author rusve
 */

public class POOER12 {
     public static void main(String[] args) {
        double Rete_Fuente, Salario_Bruto, Salario_Neto, Porcentaje_Ret;
        Salario_Bruto = 48*5000;
        Porcentaje_Ret =0.125;
        Rete_Fuente = Salario_Bruto * Porcentaje_Ret;
        Salario_Neto = Salario_Bruto-Rete_Fuente;
        System.out.println("El salario bruto es: "+ Salario_Bruto);
        System.out.println("La retencion en la fuente es de: "+ Rete_Fuente);
        System.out.println("El salario neto es: "+ Salario_Neto);
    }
}
