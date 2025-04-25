
import java.util.Scanner;

public class Ejercicio6_gestion_de_empleados{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String mejorNombre = "";
        double mejorSueldo = 0;
        double sumaSueldos = 0;
        int cantidad = 0;

        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Nombre del empleado: ");
            String nombre = sc.nextLine();
            System.out.print("Sueldo de " + nombre + ": ");
            double sueldo = sc.nextDouble(); sc.nextLine();

            if (cantidad == 0 || sueldo > mejorSueldo) {
                mejorSueldo = sueldo;
                mejorNombre = nombre;
            }

            sumaSueldos += sueldo;
            cantidad++;

            System.out.print("¿Desea ingresar otro empleado? (s/n): ");
            continuar = sc.nextLine();
        }

        if (cantidad > 0) {
            double promedio = sumaSueldos / cantidad;
            System.out.println("\nEmpleado que más gana: " + mejorNombre + " ($" + mejorSueldo + ")");
            System.out.println("Sueldo promedio: $" + promedio);
        } else {
            System.out.println("No se ingresaron empleados.");
        }

        sc.close();
    }
}