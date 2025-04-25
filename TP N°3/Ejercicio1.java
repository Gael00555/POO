import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese un número");
        int num2 = scanner.nextInt();
        System.out.println("Ingrese un número");
        int num3 = scanner.nextInt();

        int resultado;
        if (num1 >= 0) {
            resultado = num2 * num3;
        }else {
            resultado = num2 + num3;
        }

        System.out.println("El resultado es:" + resultado);

        scanner.close();
    }

}


