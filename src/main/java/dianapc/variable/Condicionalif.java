
package dianapc.variable;

public class Condicionalif {
    
    public static void main (String[] args){
        int num1 = 10;
        int num2 = 10;
        
        if (num2 > num1){
            System.out.println("El num2 es mayor que el num1");        
        }
        else {
            if (num1 == num2){
                System.out.println("Son iguales");                
            }
            else{
                System.out.println("El num1 es mayor que el num2");
            }
        }
    }    
}
