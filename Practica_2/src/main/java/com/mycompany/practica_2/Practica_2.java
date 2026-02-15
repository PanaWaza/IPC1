
package com.mycompany.practica_2;
import java.util.Scanner;


public class Practica_2 {
    
    //glovales ---------------
    int [] numeros = new int [10];
    Scanner entrada = new Scanner(System.in);


   // nombre del array = numeros --
    public void FuncionesBasicas(){

        for(int i =0; i< numeros.length;i++){
            System.out.println(" Por favor ingreesa el elemento " + (i+1) + " del array ");
            System.out.print(" -> "); 
            int a = entrada.nextInt();
            numeros[i] = a;
        }
        
        System.out.println("Elementos del array ");
        System.out.print("-> ");
        
        for(int j =0; j< numeros.length;j++){
            
            System.out.print(" , " + numeros[j] );
        }
        
        System.out.println(); //salto de linea para que quede ordenado 
        
         // suma 
       System.out.println("La suma de los valores 1,2 del array : -> "+ (numeros[0]+ numeros[1]));
       //resta
       System.out.println("La resta de los valores 3,4 del array : -> "+ (numeros[2]- numeros[3]));
       //multiplicacion
       System.out.println("La multiplicacion de los valores 5,6  del array : -> "+ (numeros[4]* numeros[5]));
       //division
       //se cambio el formato por si la division no es exacta
       System.out.println("La division de los valores 7,8 del array : -> "+ ((double)numeros[6] / (double)numeros[7]));
       //modulo
       System.out.println("La modulo de los valores 9,10 del array  : -> "+ (numeros[8] % numeros[9]));

    }
    
    public void iteracion(){
        
        System.out.println(" ");
        System.out.println(" ------------------------------------------------- ");
        System.out.println(" ");

        for (int i=1; i<numeros.length;i++){
            String paso1 = (numeros[i-1]== numeros[i])? "El siguiente es igual "+numeros[i-1] +" = "+ numeros[i]:
                    (numeros[i-1] > numeros[i])? "El siguiente es menor "+numeros[i-1] +" > "+ numeros[i]:
                    "El siguiente es mayor "+numeros[i-1]+" < "+ numeros[i];
            System.out.println(paso1);
        }
        System.out.println(" ");
        System.out.println(" ");

    }

    
    public static void main(String[] args) {
       Practica_2 llamada = new Practica_2();
       llamada.FuncionesBasicas();
       llamada.iteracion();
 
    }
    

}

