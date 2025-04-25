import java.util.Scanner;

public class Ejercicio5prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int valor = scanner.nextInt();

        Ejercicio5 numero = new Ejercicio5(valor);

        System.out.println("Número ingresado: " + numero.getNumero());
        System.out.println("Cuadrado: " + numero.cuadrado());
        System.out.println("¿Es par?: " + numero.esPar());
        System.out.println("¿Es impar?: " + numero.esImpar());

        if (valor >= 0) {
            System.out.println("Factorial: " + numero.factorial());
        } else {
            System.out.println("No se puede calcular el factorial de un número negativo.");
        }

        System.out.println("¿Es primo?: " + numero.esPrimo());

        scanner.close();
    }
}