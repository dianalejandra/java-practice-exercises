package dianapc.variable;

import java.util.Scanner;

/*
Make a program where user can type a limit number (example 100),
and show a counter that shows each number until the number input limit (starts with number 1)

*/

public class EjercicioContadorConLimite {
    
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
