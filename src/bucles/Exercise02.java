/*
 * Realiza un programa que nos pida un número n
 * y nos diga cuántos números hay entre 1 y n que sean primos.
 */

package bucles;

import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {

        // Crear un nuevo Scanner
        Scanner sc = new Scanner(System.in);

        // Pedimos un número al usuario
        System.out.print("Introduzca un número: ");
        int n = sc.nextInt();

        int cantidadPrimos = 0; // contador de números primos

        // Recorremos todos los números desde 2 hasta n
        for (int num = 2; num <= n; num++) {

            // Comprobamos si 'num' es primo (sin método y sin break)
            boolean esPrimo = true;   // suponemos que es primo
            int divisor = 2;

            // probamos divisores desde 2 hasta num-1
            while (divisor < num) {
                if (num % divisor == 0) {
                    esPrimo = false;  // hemos encontrado un divisor
                }
                divisor++;
            }

            // si es primo, aumentamos el contador
            if (esPrimo) {
                cantidadPrimos++;
            }
        }

        System.out.println("Hay " + cantidadPrimos + " números primos entre 1 y " + n + ".");

        // Cerramos el Scanner
        sc.close();
    }
}
