package colas;

import java.util.Scanner;

public class Pilas {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in);
        
        // Tamaño de la pila.
        int tope=0, tam, opt;
        
        System.out.print("Ingrese el tamaño de la pila: ");
        // Creando la pila con el valor ingresado
        int pila[] = new int[tam=sc.nextInt()];
        
        // Menú
        do {
            System.out.println("\n1- Agregar\n"
            +"2- Mostrar\n"
            +"3- Eliminar\n"
            +"5- Salir\n"
            +"Tu respuesta:");
            switch(opt=sc.nextInt()) {
                case 1:
                    if (tope < tam) {
                        // Pedir dato
                        System.out.println("Ingrese dato: ");
                        // Dato se guarda en la posición de la variable tope
                        pila[tope] = sc.nextInt();
                        // Aumentamos una unidad a tope para guardar el siguiente valor en la siguiente posición
                        tope++;
                    } else {
                        System.out.println("Pila llena...");
                    }
                break;
                case 2:
                    if (tope > 0) {
                        // Mostrar los elementos
                        System.out.println("Los elementos de la pila son:");
                        // Iniciamos con tope-1, porque el vector inicia en posición 0
                        for (int i=0; i<=pila.length; i++){
                            System.out.println("dato "+pila[i]);
                        }
                    } else {
                        System.out.println("Pila vacía...");
                    }
                break;
                case 3:
                    if (tope !=0) {
                        // Tope nos indica la posición en la que vamos a guardar un valor
                    // Por eso le restamos una unidad para sobreescribir un elemento
                    System.out.println("Eliminando el último valor");
                    tope--;
                    } else {
                        System.out.println("No hay elementos para eliminar.");
                    }
                break;    
            }
        }while(opt != 5);
    }
}