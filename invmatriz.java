import java.util.Scanner;

// Clase principal para invertir una matriz
public class invmatriz{
    // Método principal
    public static void main(String args[]){
        Scanner lector = new Scanner(System.in); // Scanner para entrada (no utilizado en este código)
        int mat[][] = new int [10][10]; // Matriz original de 10x10
        int mat_i[][] = new int [10][10]; // Matriz invertida de 10x10
        int val = 1; // Valor inicial para llenar la matriz

        // Llenar la matriz original con números del 1 al 100
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                mat[i][j] = val;
                val++;
            }
        }

        // Invertir la matriz: filas y columnas invertidas
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                mat_i[9 - i][9 - j] = mat[i][j]; // < logica de esta comparacion , se evalua si
                                                //  i es 0, entonces se asigna a la posicion 9, si i es 1 se asigna a la posicion 8, y asi sucesivamente
            }
        }

        // Imprimir la matriz original
        System.out.println("\nMatriz normal:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }

        // Imprimir la matriz invertida
        System.out.println("\nMatriz invertida:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat_i[i][j] + "\t");
            }
            System.out.println();
        }

    }
}