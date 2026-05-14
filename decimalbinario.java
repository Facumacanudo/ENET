import java.util.Scanner; // Importa la clase Scanner para leer entrada del usuario

class decimalbinario{ // Clase principal para convertir binario a decimal
    public static void main(String args[]){ // Método principal donde se ejecuta el programa
    Scanner lector = new Scanner(System.in); // Crea un objeto Scanner para leer desde la consola

    //1) Dado un vector de números 0 y 1 que representa una número en binario, de tamaño
    //8, donde la posición 0 es la menos significativa y la 7 la más significativa mostrar el
    //número en decimal.
        
        int[] binario = new int[8]; // Arreglo para almacenar los 8 bits del número binario
        int decimal = 0; // Variable para almacenar el valor decimal resultante

        for(int i = 0 ; i < binario.length;i++){ // Bucle para leer cada bit del binario desde el usuario
            System.out.println("Ingrese el 1 / 0 en el bit :" + "[" + i + "]" ); // Imprime el mensaje para ingresar el bit en la posición i
            binario[i] = lector.nextInt(); // Lee el entero (0 o 1) y lo almacena en el arreglo
        }

        for (int i = 0; i < binario.length; i++) { // Bucle para calcular el valor decimal sumando potencias de 2
            if (binario[i] == 1) { // Si el bit en la posición i es 1
                decimal += Math.pow(2, i); // Suma 2 elevado a i al decimal
            }
        }

        System.out.println("El número decimal es: " + decimal); // Imprime el número decimal resultante
    }



        
    }

