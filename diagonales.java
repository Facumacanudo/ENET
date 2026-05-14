import java.util.Scanner;


class ejer4{
public static void main(String args[]){
    Scanner lector = new Scanner(System.in); // lector no usado, se puede eliminar si no se necesita



// 4) Dada una matriz de 10 por 10, realizar un algoritmo que pinte las diagonales con
// (asterisco) y el resto en blanco.

        String mat[][] = new String [10][10]; // declaracion de la matriz de 10 filas y 10 columnas

        //logica > se evalua por cada iteracion el indice de la matriz, si el indice de fila es igual al indice de columna (i == j) 
        //o si la suma de los indices es igual a 9 (i + j == 9), entonces se asigna un asterisco "*", de lo contrario se asigna un espacio " ".
for(int i = 0; i < 10; i++){
    for(int j = 0; j < 10; j++){
        if(i == j || i + j == 9){
            mat[i][j] = "*";
        } else {
            mat[i][j] = " ";
        }
    }
}

for(int i = 0; i < 10; i++){
    for(int j = 0; j < 10; j++){
        System.out.print(mat[i][j]);
    }
    System.out.println();
}

// [],[],[],[],[],[],[],[],[],[]
// [],[],[],[],[],[],[],[],[],[]
// [],[],[],[],[],[],[],[],[],[]
// [],[],[],[],[],[],[],[],[],[]
// [],[],[],[],[],[],[],[],[],[]
// [],[],[],[],[],[],[],[],[],[]
// [],[],[],[],[],[],[],[],[],[]
// [],[],[],[],[],[],[],[],[],[]
// [],[],[],[],[],[],[],[],[],[]
// [],[],[],[],[],[],[],[],[],[]


}


}