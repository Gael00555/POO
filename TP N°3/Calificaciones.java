import java.util.Scanner;

public class Calificaciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa una calificación (0 a 10): ");
        double calificacion = scanner.nextDouble();

        if (calificacion < 0 || calificacion > 10) {
            System.out.println("Calificación inválida. Debe estar entre 0 y 10.");
        } else if (calificacion < 4) {
            System.out.println("Reprobado");
        } else if (calificacion < 6) {
            System.out.println("Aprobado");
        } else if (calificacion < 8) {
            System.out.println("Bueno");
        } else if (calificacion < 9.5) {
            System.out.println("Muy Bueno");
        } else {
            System.out.println("Sobresaliente");
        }

        scanner.close();
    }
}
