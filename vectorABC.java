import java.util.Scanner;
public class vectorABC{
    public static void main(String args[]){
        // Crear un objeto Scanner para leer entrada del usuario
        Scanner lector = new Scanner(System.in);

        // 2) Dados dos vectores a y b de números enteros de tamaño 5, crear un nuevo vector c
        // donde cada elemento de c es la multiplicación de los elementos de A y B en la
        // posición que se encuentre.

        // Declarar tres vectores de tamaño 5
        int vec_a[] = new int [5];
        int vec_b[] = new int [5];
        int vec_c[] = new int [5];

        // Leer los valores para el vector A
        for(int i = 0; i < 5; i++){
            System.out.println("Ingrese los valores de vector: A");
            vec_a[i] = lector.nextInt();
        }

        // Leer los valores para el vector B
        for(int i = 0; i < 5; i++){
            System.out.println("Ingrese los valores de vector: b");
            vec_b[i] = lector.nextInt();
        }

        // Calcular el vector C multiplicando elementos de A y B en cada posición
        for(int i = 0; i < 5; i++){
            vec_c[i] = vec_a[i] * vec_b[i];
        }

        // Mostrar encabezado de resultados
        System.out.println("Valores de los sectores (a , b y c) ");
        System.out.println("---------------------");

        // Mostrar vector A
        System.out.println("Vector A:");
        for(int i = 0; i < 5; i++){
            System.out.print("[" + vec_a[i] + "]");
        }
        System.out.println("\n");

        // Mostrar vector B
        System.out.println("Vector B:");
        for(int i = 0; i < 5; i++){
            System.out.print("[" + vec_b[i] + "]");
        }
        System.out.println("\n");

        // Mostrar vector C (resultado de multiplicaciones)
        System.out.println("Vector C:");
        for(int i = 0; i < 5; i++){
            System.out.print("[" + vec_c[i] + "]");
        }
    }
}