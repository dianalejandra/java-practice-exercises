
package dianapc.variable;

/* Realizr un programa que permita el intercambio de valores entre dos variables.
   Por ejemplo: Si una variable num1 vale 35, y otra variable num2 vale 20,
   realizar las acciones necesarias para que num1 valga 20 y num2 valga 35.
*/

public class Ejercicioslogicos {
    public static void main(String[] args){
        int num1 = 35;
        int num2 = 20;
        int aux;
        
        System.out.println("---- Antes ----");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
        
        aux = num2;
        num2 = num1;
        num1 = aux;
        
        System.out.println("---- Después ----");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);            
    }    
}
