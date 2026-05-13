import java.util.Scanner;
class decimalbinario{
    public static void main(String args[]){
    Scanner lector = new Scanner(System.in);

    //1) Dado un vector de números 0 y 1 que representa una número en binario, de tamaño
    //8, donde la posición 0 es la menos significativa y la 7 la más significativa mostrar el
    //número en decimal.
        
        int[] binario = new int[8];
        int decimal = 0;

        for(int i = 0 ; i < binario.length;i++){
            System.out.println("Ingrese el 1 / 0 en el bit :" + "[" + i + "]" );
            binario[i] = lector.nextInt();
        }

        for (int i = 0; i < binario.length; i++) {
            if (binario[i] == 1) {
                decimal += Math.pow(2, i);
            }
        }

        System.out.println("El número decimal es: " + decimal);
    }



        
    }

