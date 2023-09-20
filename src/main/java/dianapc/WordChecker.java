package dianapc;
import java.util.Scanner;

/**
 * Develop a program that shows on screen words that are inputed by keyboard
 * until 'exit' word is imputed (but not showed) and the loop breaks.
 * 
 * Realizar un programa que muestre en pantalla palabras que sean ingresadas
 * por teclado hasta que se ingrese la palabra “salir”.
 */

public class WordChecker {
    public static void main(String[] args){
        
        System.out.println("Please input a word: ");
        Scanner keyboard = new Scanner (System.in);
        String word = keyboard.next();
        
        while(!word.equalsIgnoreCase("exit") ){
            System.out.println("The inputed word is: " + word);
            
            System.out.println("Please input another word: ");
            word = keyboard.next();
        }        
    }    
}
