import java.util.Scanner;
public class CiclosWhile {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("=================================================");
            System.out.println("            EJERCICIOS: CICLO WHILE              ");
            System.out.println("=================================================");

            // 1. Números naturales de 1 a n
            System.out.println("\n--- Ejercicio 1: Números naturales de 1 a n ---");
            System.out.print("Ingrese el valor de n: ");
            int n1 = scanner.nextInt();
            int i1 = 1;
            while (i1 <= n1) {
                System.out.print(i1 + " ");
                i1++;
            }
            System.out.println();

            // 2. Suma de los primeros n números naturales
            System.out.println("\n--- Ejercicio 2: Suma de los primeros n números naturales ---");
            System.out.print("Ingrese el valor de n: ");
            int n2 = scanner.nextInt();
            int i2 = 1;
            int suma2 = 0;
            while (i2 <= n2) {
                suma2 += i2;
                i2++;
            }
            System.out.println("La suma de los primeros " + n2 + " números naturales es: " + suma2);

            // 3. Tabla de multiplicar del 10 (del 1 al 50)
            System.out.println("\n--- Ejercicio 3: Tabla del 10 (del 1 al 50) ---");
            int i3 = 1;
            while (i3 <= 50) {
                System.out.println("10 x " + i3 + " = " + (10 * i3));
                i3++;
            }

            // 4. Números impares entre 1 y n
            System.out.println("\n--- Ejercicio 4: Números impares entre 1 y n ---");
            System.out.print("Ingrese el valor de n: ");
            int n4 = scanner.nextInt();
            int i4 = 1;
            while (i4 <= n4) {
                if (i4 % 2 != 0) {
                    System.out.print(i4 + " ");
                }
                i4++;
            }
            System.out.println();

            // 5. Preguntar al usuario si desea salir (S/N)
            System.out.println("\n--- Ejercicio 5: Confirmación para salir (S/N) ---");
            scanner.nextLine(); // Limpiar el búfer
            String respuesta = "N";
            while (!respuesta.equalsIgnoreCase("S")) {
                System.out.print("¿Desea salir del programa? (S/N): ");
                respuesta = scanner.nextLine().trim();
            }
            System.out.println("Ha seleccionado salir. Continuando con el siguiente ejercicio...");

            // 6. Promedio de 10 números
            System.out.println("\n--- Ejercicio 6: Promedio de 10 números ---");
            int i6 = 1;
            double suma6 = 0;
            while (i6 <= 10) {
                System.out.print("Ingrese el número " + i6 + ": ");
                suma6 += scanner.nextDouble();
                i6++;
            }
            System.out.println("El promedio de los 10 números es: " + (suma6 / 10));

            // 7. Promedio de n números hasta ingresar 0
            System.out.println("\n--- Ejercicio 7: Promedio de números (ingrese 0 para terminar) ---");
            double suma7 = 0;
            int contador7 = 0;
            System.out.print("Ingrese un número (0 para finalizar): ");
            double num7 = scanner.nextDouble();

            while (num7 != 0) {
                suma7 += num7;
                contador7++;
                System.out.print("Ingrese otro número (0 para finalizar): ");
                num7 = scanner.nextDouble();
            }

            if (contador7 > 0) {
                System.out.println("El promedio de los " + contador7 + " números ingresados es: " + (suma7 / contador7));
            } else {
                System.out.println("No se ingresaron números para calcular el promedio.");
            }

            // 8. Suma de los cuadrados de los números entre 1 y n
            System.out.println("\n--- Ejercicio 8: Suma de cuadrados de 1 a n ---");
            System.out.print("Ingrese el valor de n: ");
            int n8 = scanner.nextInt();
            int i8 = 1;
            int sumaCuadrados = 0;
            while (i8 <= n8) {
                sumaCuadrados += (i8 * i8);
                i8++;
            }
            System.out.println("La suma de los cuadrados desde 1 hasta " + n8 + " es: " + sumaCuadrados);

            System.out.println("\n¡Todos los ejercicios del ciclo While han finalizado correctamente!");
            scanner.close();
        }
    }

