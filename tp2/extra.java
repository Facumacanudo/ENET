import java.util.Scanner;
    class extra{
        public static void main(String args[]){
            Scanner lector = new Scanner(System.in);

//Realizar un algoritmo que dada una matriz de 5x5, con elementos 
//numéricos desde la posición 0 a la 3 tanto en filas como en columnas, realizar un algoritmo 
//que en la posición 4 de la fila 0, sume todos los elementos de la fila 0, asi sucesivamente,
// y en la posición 4 de la columna 0 sume todos los elementos de la columna 0.
// Mostrar por pantalla la matriz con los valores iniciales, y luego la matriz con los valores sumados.

//[1][][][][]
//[2][][][][]
//[1][][][][]
//[0][][][][]
//[4 (1+2+1+0)]

    int t_matriz = 5; 
    int matriz[][] = new int[t_matriz][t_matriz];
    int valor;
    int fila = 0;
    int columna = 0;
    int suma = 0;

    while(columna < t_matriz){
        System.out.print("ingrese el valor de " + "[" + columna +"]" + "[" + fila + "] = ");
        matriz[fila][columna] = lector.nextInt();
        suma = suma + matriz[fila][columna];
        fila++;
        if(fila > 3){
            matriz[fila][columna] = suma;
            suma = 0;
            fila = 0;
            columna++;
            

        }
    }
System.out.println("\n--- MATRIZ RESULTADO ---");

for(int i = 0; i < matriz.length; i++){
    for(int j = 0; j < matriz.length; j++){
        // El \t es un "tabulador", le da un espacio lindo y parejo a los números
        System.out.print(matriz[i][j] + "\t"); 
    }
    // Cuando termina de recorrer las columnas de una fila, salta de línea
    System.out.println(); 
}
System.out.println("------------------------");
        }
    }
