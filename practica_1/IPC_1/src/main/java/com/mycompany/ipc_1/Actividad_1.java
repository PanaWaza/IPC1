
package com.mycompany.ipc_1;
import java.util.Scanner;
/**
 *
 * @author Pana_Waza
 */
public class Actividad_1 {
    
    
    private int sumatoria(int a){
        if (a == 0){
            return 0;
        }
        return sumatoria(a-1)+a;
    }
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Por favor ingrese un valor  : ");
        int entrada = leer.nextInt();
        
        Actividad_1 valor = new Actividad_1();
        int resultado = valor.sumatoria(entrada);
        System.out.println("El resultado de la suma es : "+ resultado );
        
    }
    
    
}
