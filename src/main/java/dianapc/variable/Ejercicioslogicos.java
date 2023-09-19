
package dianapc.variable;

/*  Develop a program that allows the exchange of values between two variables.
    For example: If variable num1 is 35 and other variable num2 is 20,
    make necesary actions to make num1 equal to 20 and num2 equal to 35.
*/

public class Ejercicioslogicos {
    public static void main(String[] args){
        int num1 = 35;
        int num2 = 20;
        int aux;
        
        System.out.println("---- Before ----");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
        
        aux = num2;
        num2 = num1;
        num1 = aux;
        
        System.out.println("---- After ----");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);            
    }    
}
