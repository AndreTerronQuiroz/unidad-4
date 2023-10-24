package arrays;

import java.util.Scanner;

public class Practica1u4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double[] numeros = {20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3};
        
        do {
            System.out.println("HOLA :D");
            System.out.println("escoga la opcion que desee");
            System.out.println("1. suma");
            System.out.println("2. multiplicacion");
            System.out.println("3. Salir");
            
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    double suma = 0;
                    System.out.println("suma");
                    for (double elemento : numeros) {
                        suma += elemento;
                        
                        
                    }
                    
                    System.out.println("El resultado de la suma de los 2 numeros es: " + suma);
                    break;
                    
                case 2:  
                    double multiplicacion = 1;
                    System.out.println("multiplicación");
                    for (double elemento:numeros) {
                        multiplicacion *= elemento;
                        
                        
                    }
                    
                    System.out.println("El resultado de la multiplicacion de los 2 numeros es: " + multiplicacion);
                    break;
                case 3:
                    System.out.println("hasta luego");
                    break;
                default:
                    System.out.println("Opcion invalida, intente denuevo");
            }
        } while(opcion !=3);
        
        scanner.close();
    
    }
    
}
