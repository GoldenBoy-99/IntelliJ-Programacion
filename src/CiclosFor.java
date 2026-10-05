import java.util.Scanner;
public class CiclosFor {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("\n=================================================");
            System.out.println("         PARTE 2: ALGORITMOS CICLO FOR           ");
            System.out.println("=================================================");

            // 8 (For 1). Imprimir 0 a 100 (ascendente y descendente)
            System.out.println("\n--- Ejercicio 8: Números 0 a 100 ---");
            System.out.println("Ascendente:");
            for (int i = 0; i <= 100; i++) {
                System.out.print(i + " ");
            }
            System.out.println("\nDescendente:");
            for (int i = 100; i >= 0; i--) {
                System.out.print(i + " ");
            }
            System.out.println();

            // 9 (For 2). Imprimir 1 a 20 excepto el 11
            System.out.println("\n--- Ejercicio 9: Números del 1 al 20 excepto 11 ---");
            for (int i = 1; i <= 20; i++) {
                if (i != 11) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();

            // 10 (For 3). Suma de 1 a n
            System.out.println("\n--- Ejercicio 10: Suma de 1 a n ---");
            System.out.print("Ingrese el valor de n: ");
            int limitN = scanner.nextInt();
            int sumaN = 0;
            for (int i = 1; i <= limitN; i++) {
                sumaN += i;
            }
            System.out.println("La suma de 1 a " + limitN + " es: " + sumaN);

            // 11 (For 4). Suma entre m y n
            System.out.println("\n--- Ejercicio 11: Suma entre m y n ---");
            System.out.print("Ingrese el valor inicial (m): ");
            int m = scanner.nextInt();
            System.out.print("Ingrese el valor final (n): ");
            int n = scanner.nextInt();
            int inicio = Math.min(m, n);
            int fin = Math.max(m, n);
            int sumaMN = 0;
            for (int i = inicio; i <= fin; i++) {
                sumaMN += i;
            }
            System.out.println("La suma entre " + inicio + " y " + fin + " es: " + sumaMN);

            // 12 (For 5). Suma del 1 al 100
            System.out.println("\n--- Ejercicio 12: Suma del 1 al 100 ---");
            int sumaCien = 0;
            for (int i = 1; i <= 100; i++) {
                sumaCien += i;
            }
            System.out.println("La suma de los números del 1 al 100 es: " + sumaCien);

            // 13 (For 6). Promedio de 5 números
            System.out.println("\n--- Ejercicio 13: Promedio de 5 números ---");
            double sumaCinco = 0;
            for (int i = 1; i <= 5; i++) {
                System.out.print("Ingrese el número " + i + ": ");
                sumaCinco += scanner.nextDouble();
            }
            System.out.println("El promedio de los 5 números es: " + (sumaCinco / 5));

            // 14 (For 7). Tabla del 3 (0 al 50)
            System.out.println("\n--- Ejercicio 14: Tabla del 3 (del 0 al 50) ---");
            for (int i = 0; i <= 50; i++) {
                System.out.println("3 x " + i + " = " + (3 * i));
            }

            // 15 (For 8). Promedio de 3 notas para n estudiantes
            System.out.println("\n--- Ejercicio 15: Promedio de notas para n estudiantes ---");
            System.out.print("Ingrese la cantidad de estudiantes (n): ");
            int cantidadEstudiantes = scanner.nextInt();
            for (int i = 1; i <= cantidadEstudiantes; i++) {
                System.out.println("Estudiante " + i + ":");
                double sumaNotas = 0;
                for (int j = 1; j <= 3; j++) {
                    System.out.print("  Ingrese la nota " + j + ": ");
                    sumaNotas += scanner.nextDouble();
                }
                System.out.println("  El promedio del estudiante " + i + " es: " + (sumaNotas / 3));
            }

            // 16 (For 9). Factorial de un número
            System.out.println("\n--- Ejercicio 16: Factorial de un número ---");
            System.out.print("Ingrese un número entero no negativo (n): ");
            int numFactorial = scanner.nextInt();
            if (numFactorial < 0) {
                System.out.println("El factorial no está definido para números negativos.");
            } else {
                long fact = 1;
                for (int i = 1; i <= numFactorial; i++) {
                    fact *= i;
                }
                System.out.println("El factorial de " + numFactorial + "! es: " + fact);
            }

            // 17 (For 10). Promedio de 10 números
            System.out.println("\n--- Ejercicio 17: Promedio de 10 números ---");
            double sumaDiez = 0;
            for (int i = 1; i <= 10; i++) {
                System.out.print("Ingrese el número " + i + ": ");
                sumaDiez += scanner.nextDouble();
            }
            System.out.println("El promedio de los 10 números es: " + (sumaDiez / 10));

            System.out.println("\n¡Todos los ejercicios fueron ejecutados!");
            scanner.close();
        }
    }

