import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double Rete_Fuente, Salario_Bruto, Salario_Neto, Porcentaje_Ret, Pago_Hora, Num_Horas;

        System.out.println("Ingrese Cuanto le pagan por hora: ");
        Pago_Hora = scanner.nextDouble();

        System.out.println("Ingrese el numero de horas trabajadas: ");
        Num_Horas = scanner.nextDouble();

        Salario_Bruto = Num_Horas * Pago_Hora;

        System.out.print("Ingrese el porcentaje de retencion (por ejemplo, 0.125 para 12.5%): ");
        Porcentaje_Ret = scanner.nextDouble();

        Rete_Fuente = Salario_Bruto * Porcentaje_Ret;
        Salario_Neto = Salario_Bruto - Rete_Fuente;

        System.out.println("El salario bruto es: " + Salario_Bruto);
        System.out.println("La retencion en la fuente es de: " + Rete_Fuente);
        System.out.println("El salario neto es: " + Salario_Neto);

        // Cerrar el Scanner para liberar recursos
        scanner.close();
    }
}
