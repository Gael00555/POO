import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Ingrese una palabra:");

			String palabra = scanner.nextLine();

			String palabraAlReves = new StringBuilder(palabra).reverse().toString();

			if (palabra.equals(palabraAlReves)) {
			    System.out.println("La palabra es un palíndromo");
			} else {
			    System.out.println("La palabra no es un palíndromo");
			}
		}
    }
}
