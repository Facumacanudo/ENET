import java.util.Scanner;
    class ejer3{
        public static void main(String args[]){
            Scanner lector = new Scanner(System.in);

        int materias = 10;
        double suma = 0;
        double[] notas = new double[10];

        for(int i = 0; i < materias;i++){
            System.out.print("Ingrese nota " + i + " = ");
            notas[i] = lector.nextInt();
        }

            for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }

        double promedio = suma / notas.length;
        System.out.printf("El promedio de las notas es: %.2f%n", promedio);
    
    }
}
