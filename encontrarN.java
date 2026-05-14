import java.util.Scanner;
import java.util.Random;

// Clase principal que busca un número en una matriz aleatoria de 10x10
class encontrarN {
    public static void main(String args[]) {
        // Crea un objeto Scanner para leer la entrada del usuario
        Scanner lector = new Scanner(System.in);
        // Crea un objeto Random para generar números aleatorios
        Random rand = new Random();

        // Declara una matriz de 10x10 de enteros
        int[][] matriz = new int[10][10];
        // Contador para llevar el registro de ocurrencias del número buscado
        int contador = 0;

        // Rellena la matriz con números aleatorios entre 0 y 99
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = rand.nextInt(100);
            }
        }

        // Imprime una línea separadora para mejor lectura
        System.out.println("---------------------------------------------------------");

        // Muestra la matriz por pantalla fila por fila
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Solicita al usuario el número a buscar en la matriz
        System.out.println("Ingrese el número N a buscar:");
        int N = lector.nextInt();

        // Recorre la matriz para buscar el número ingresado
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz[i][j] == N) {
                    // Imprime la posición donde se encontró el número
                    System.out.println(N + " encontrado en la posición: [" + i + "][" + j + "]");
                    contador++;
                }
            }
        }

        // Muestra la cantidad de ocurrencias encontradas
        System.out.println("La cantidad de ocurrencias de " + N + " en la matriz es: " + contador);

        // Cierra el Scanner al finalizar
        lector.close();
    }
}