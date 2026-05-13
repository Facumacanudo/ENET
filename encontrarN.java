import java.util.Scanner;
import java.util.Random;
    class encontrarN{
      public static void main(String args[]){
        Scanner lector = new Scanner(System.in);
        Random rand = new Random();

    int[][] matriz = new int[10][10];
    int contador = 0;

    for(int i = 0; i < 10; i++){
         for(int j = 0; j < 10; j++){
              matriz[i][j] = rand.nextInt(100); 
    
    }
}

System.out.println("---------------------------------------------------------");

 for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + "\t");
    }
    System.out.println(); 
}

    System.out.println("Ingrese el número N a buscar:");
    int N = lector.nextInt();

for(int i = 0; i < 10; i++){
    for(int j = 0; j < 10; j++){
        if(matriz[i][j] == N){
            System.out.println(N + " encontrado en la posición: [" + i + "][" + j + "]");
            contador++;
        }
    }
}

        System.out.println("La cantidad de ocurrencias de " + N + " en la matriz es: " + contador);



    }
}