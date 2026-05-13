import java.util.Scanner;
class ejer4{
public static void main(String args[]){
Scanner lector = new Scanner(System.in);



//4) Dada una matriz de 10 por 10, realizar un algoritmo que pinte las diagonales con 
//(asterisco) y el resto en blanco.

String mat[][] = new String [10][10];

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