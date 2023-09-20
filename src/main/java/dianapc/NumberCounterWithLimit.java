package dianapc;
import java.util.Scanner;

/*
Make a program where user can type a limit number (example 100),
and show a counter that shows each number until the number input limit (starts with number 1)

Realizar un programa que dado un límite numérico por teclado (por ejemplo 100)
muestre en pantalla todos los números hasta ese límite (empezando por 1).

*/

public class NumberCounterWithLimit {
    
    public static void main (String[] args){
        
        System.out.println("Please, insert how many numbers you desire to count:");
        Scanner keyboard = new Scanner (System.in);
        int limit = keyboard.nextInt();
        int count = 1;
        
        for(count=1; count <= limit; count++){
            
            System.out.println("This is the number " + count);
            
        };        
    }
}
