package dianapc;
import java.util.Scanner;


/**
 *  A small grocery store wants to calculate the salaries of its employees.
 *  Their positions can have 3 categories: 1- stocker, 2- cashier and 3- supervisor.
 *
 *  - Repositors charge $15,890 + a 10% bonus.
 *  - ATMs charge a fixed $25,630.89.
 *  - Supervisors earn $35,560.20 gross from which 11% of their retirement is deducted.
 *
 *  An application is needed that, depending on the type of employee,
 *  calculates and displays the corresponding salary on the screen.
 *
 *  Una pequeña despensa desea calcular los sueldos de sus empleados. Los puestos de
 *  los mismos pueden tener 3 categorías: 1- repositor, 2-cajero y 3-supervisor.
 *
 *  - Los repositores cobran $15.890 + un bono de 10%.
 *  - Los cajeros cobran $25.630,89 fijos.
 *  - Los supervisores cobran $35.560,20 en bruto al cual se les descuenta un 11% de jubilación.
 *
 *  Se necesita una aplicación que, dependiendo el tipo de empleado del que se trate,
 *  calcule y muestre en pantalla el correspondiente sueldo.
 * 
 */

public class GeneralConditionalExercise {
    
    public static void main (String[] args) {
        
        double sueldo = 0;
        int categoria;
        
        System.out.println("Enter the type of category for which you want to calculate the salary:");
        Scanner teclado = new Scanner (System.in);
        categoria = teclado.nextInt();
        
        if (categoria == 1){
            sueldo = 15890 + (15890*0.10);
        }
        else{
            if (categoria == 2){
                sueldo = 25630.89;
            }
            else{
                if (categoria == 3){
                    sueldo = 35560.20 - (35560.20*0.11);
                }
                else{
                    System.out.println("Invalid category: Please enter a valid value");
                }
            }
        }
        if(categoria == 1 || categoria == 2 || categoria == 3){
            System.out.println("The total salary for category " + categoria + " is equal to: $" + sueldo);
        }
    }    
}
