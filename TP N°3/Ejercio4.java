import java.util.Scanner;

public class Ejercio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        // Cargar los números desde teclado
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número: ");
            numeros[i] = scanner.nextInt();
        }

        // Cantidad de números
        System.out.println("Cantidad de números: " + numeros.length);

        // Mayor número
        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        System.out.println("El número mayor es: " + mayor);

        // Promedio
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        double promedio = (double) suma / numeros.length;
        System.out.println("El promedio es: " + promedio);

        // Orden ascendente
        int[] ascendente = numeros.clone();
        for (int i = 0; i < ascendente.length - 1; i++) {
            for (int j = i + 1; j < ascendente.length; j++) {
                if (ascendente[i] > ascendente[j]) {
                    int aux = ascendente[i];
                    ascendente[i] = ascendente[j];
                    ascendente[j] = aux;
                }
            }
        }
        System.out.print("Números ordenados de menor a mayor: ");
        for (int i = 0; i < ascendente.length; i++) {
            System.out.print(ascendente[i] + " ");
        }
        System.out.println();

        // Orden descendente
        int[] descendente = numeros.clone();
        for (int i = 0; i < descendente.length - 1; i++) {
            for (int j = i + 1; j < descendente.length; j++) {
                if (descendente[i] < descendente[j]) {
                    int aux = descendente[i];
                    descendente[i] = descendente[j];
                    descendente[j] = aux;
                }
            }
        }
        System.out.print("Números ordenados de mayor a menor: ");
        for (int i = 0; i < descendente.length; i++) {
            System.out.print(descendente[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}