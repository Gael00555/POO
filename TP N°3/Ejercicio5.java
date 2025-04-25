
public class Ejercicio5 {
    private int numero;

    public Ejercicio5(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public long cuadrado() {
        return (long) numero * numero;
    }

    public boolean esPar() {
        return numero % 2 == 0;
    }

    public boolean esImpar() {
        return !esPar();
    }

    public long factorial() {
        if (numero < 0) {
        }

        long resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public boolean esPrimo() {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

