import java.util.Scanner;
    class ejer1{
        public static void main(String args[]){
            Scanner lector = new Scanner(System.in);
        
    //1.- Una empresa entregará un bono excepcional a todos los empleados 
    //con más de 5 años de antigüedad. Realizar el algoritmo que dada la antigüedad del empleado, 
    //indique si recibe el bono o no.
    //El bono recibido es un 10% de su sueldo. Modificar el ejercicio anterior, 
    //para que muestre el total del bono a recibir. Analizar las modificaciones necesarias.

    int empleados = 0;
    int años;
    System.out.print("Ingrese la cantidad de empleados a ingresar = ");
    empleados = lector.nextInt();
    double sueldos[] = new double[empleados];
    
    System.out.println("--------------------------------------");

    for(int i = 0; i < empleados ;i++){
        System.out.print("Ingrese el valor cuantitativo de sueldo del empleado numero " + "["+ i +"] = ");
        sueldos[i] = lector.nextInt();

        System.out.print("Ingrese la cantidad de años de empleado numero :" + "["+ i +"] = ");
        años = lector.nextInt();

        

        if(años > 5){
            System.out.println("Bono aceptado incremento +10% aplicado al sueldo actual");
            sueldos[i] = (sueldos[i] * 1.10);

            
        }else{
            System.out.println("Bono denegado, no se cumple con el tiempo minimo de 5 años");
        }
        System.out.println("--------------------------------------");
        


    }


   for (int i = 0; i < empleados; i++) {
    
    System.out.printf("empleado: %d sueldo final : %.2f%n", i, sueldos[i]);
    System.out.println("--------------------------------------");
}



    }
}
