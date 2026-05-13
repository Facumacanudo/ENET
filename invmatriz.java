import java.util.Scanner;
public class invmatriz{
public static void main(String args[]){
Scanner lector = new Scanner(System.in);
int mat[][] = new int [10][10];
int mat_i[][] = new int [10][10];
int val = 1;


for(int i = 0; i < mat.length; i++){
    for(int j = 0; j < mat.length; j++){
        mat[i][j] = val;
        val++;
    }
 }


for(int i = 0; i < mat.length; i++){
    for(int j = 0; j < mat.length; j++){
        mat_i[9 - i][9 - j] = mat[i][j];
    }
}

System.out.println("\nMatriz normal:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }

 System.out.println("\nMatriz invertida:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat_i[i][j] + "\t");
            }
            System.out.println();
        }


 }
}