
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
import java.util.Scanner;

import java.util.Scanner;

    public class Logica {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int opcion;

            do {
                System.out.println("\n=== TALLER DE ALGORITMOS EN JAVA ===");
                System.out.println("1. Validar mayoría de edad");
                System.out.println("2. Validar ángulos internos de un triángulo");
                System.out.println("3. Determinar si un número es par o impar");
                System.out.println("4. Determinar si un número es divisible entre 5");
                System.out.println("5. Determinar si un número (1-15) es primo");
                System.out.println("6. Comparar dos números (Mostrar el mayor o si son iguales)");
                System.out.println("7. Verificar si un producto paga IVA");
                System.out.println("0. Salir");
                System.out.print("Seleccione una opción: ");

                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el búfer del teclado

                System.out.println(); // Línea en blanco para separar

                switch (opcion) {
                    case 1:
                        ejercicio1(scanner);
                        break;
                    case 2:
                        ejercicio2(scanner);
                        break;
                    case 3:
                        ejercicio3(scanner);
                        break;
                    case 4:
                        ejercicio4(scanner);
                        break;
                    case 5:
                        ejercicio5(scanner);
                        break;
                    case 6:
                        ejercicio6(scanner);
                        break;
                    case 7:
                        ejercicio7(scanner);
                        break;
                    case 0:
                        System.out.println("¡Programa finalizado correctamente!");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                        break;
                }

            } while (opcion != 0);

            scanner.close();
        }

        // 1. Mayoría de edad
        public static void ejercicio1(Scanner scanner) {
            System.out.println("--- 1. MAYORÍA DE EDAD ---");
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();

            if (edad >= 18) {
                System.out.println("El usuario es mayor de edad.");
            } else {
                System.out.println("El usuario es menor de edad.");
            }
        }

        // 2. Validación de ángulos de un triángulo
        public static void ejercicio2(Scanner scanner) {
            System.out.println("--- 2. ÁNGULOS DE UN TRIÁNGULO ---");
            System.out.print("Ingrese el primer ángulo: ");
            double a1 = scanner.nextDouble();
            System.out.print("Ingrese el segundo ángulo: ");
            double a2 = scanner.nextDouble();
            System.out.print("Ingrese el tercer ángulo: ");
            double a3 = scanner.nextDouble();

            double suma = a1 + a2 + a3;

            if (a1 > 0 && a2 > 0 && a3 > 0 && suma == 180) {
                System.out.println("Los ángulos corresponden a un triángulo válido.");
            } else {
                System.out.println("Los ángulos NO corresponden a un triángulo.");
            }
        }

        // 3. Número par o impar
        public static void ejercicio3(Scanner scanner) {
            System.out.println("--- 3. NÚMERO PAR O IMPAR ---");
            System.out.print("Ingrese un número entero: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println("El número " + numero + " es PAR.");
            } else {
                System.out.println("El número " + numero + " es IMPAR.");
            }
        }

        // 4. Divisibilidad entre cinco
        public static void ejercicio4(Scanner scanner) {
            System.out.println("--- 4. DIVISIBILIDAD ENTRE 5 ---");
            System.out.print("Ingrese un número entero: ");
            int numero = scanner.nextInt();

            if (numero % 5 == 0) {
                System.out.println("El número " + numero + " es divisible entre 5.");
            } else {
                System.out.println("El número " + numero + " NO es divisible entre 5.");
            }
        }

        // 5. Número primo entre 1 y 15
        public static void ejercicio5(Scanner scanner) {
            System.out.println("--- 5. NÚMERO PRIMO (1 A 15) ---");
            System.out.print("Ingrese un número entre 1 y 15: ");
            int numero = scanner.nextInt();

            if (numero >= 1 && numero <= 15) {
                if (numero == 2 || numero == 3 || numero == 5 || numero == 7 || numero == 11 || numero == 13) {
                    System.out.println("El número " + numero + " es PRIMO.");
                } else {
                    System.out.println("El número " + numero + " NO es primo.");
                }
            } else {
                System.out.println("Error: El número está fuera del rango permitido (1-15).");
            }
        }

        // 6. Comparar dos números
        public static void ejercicio6(Scanner scanner) {
            System.out.println("--- 6. COMPARAR DOS NÚMEROS ---");
            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();

            if (num1 > num2) {
                System.out.println("El número mayor es: " + num1);
            } else if (num2 > num1) {
                System.out.println("El número mayor es: " + num2);
            } else {
                System.out.println("Ambos números son iguales (" + num1 + ").");
            }
        }

        // 7. Verificación de IVA
        public static void ejercicio7(Scanner scanner) {
            System.out.println("--- 7. VERIFICACIÓN DE IVA ---");
            System.out.print("Ingrese el nombre del producto (lentejas, crema, arroz, vino): ");
            String producto = scanner.nextLine().toLowerCase().trim();

            switch (producto) {
                case "lentejas":
                case "arroz":
                    System.out.println("El producto '" + producto + "' NO paga IVA.");
                    break;
                case "crema":
                case "vino":
                    System.out.println("El producto '" + producto + "' SÍ paga IVA.");
                    break;
                default:
                    System.out.println("El producto no se encuentra registrado en la lista.");
                    break;
            }
        }
    }



