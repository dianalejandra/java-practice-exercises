
package dianapc;

import java.util.Scanner;

//<editor-fold defaultstate="collapsed" desc="comment">
/*  The "Immigrant Marathon" is organized every year in Misiones. The event
has an inscription day the day before the marathon, therefore the exact number
of participants is not known until the day of the race. The folowing data is
requested for each participant: name, age and DNI (national ID number).

Regarding the posible categories of inscription, these are the ones available:
- Minors A (from 6 to 10 years old)
- Minors B (from 11 to 17 years old)
- Youths (from 18 to 30 years old)
- Young Adults (from 31 to 50 years old)
- Senior Adults (older than 50 years old)

Develop a program thet, with the data imput you can show on screen which
category you must get inscripted. By the end of the day, to finish inscriptions
a DNI of number 0 and a name with 'end' word must be inputed.

La "Maratón del Inmigrante" se celebra anualmente en Misiones. El evento cuenta
con un día de inscripciones el día anterior a la carrera, por lo que se desconoce
la cantidad exacta de inscriptos que puede llegar a haber. Para la inscripción
de cada participante se solicitan los siguientes datos: dni, nombre y edad.

En cuanto a las categorías posibles para una inscripción, se manejan las siguientes:
- Menores A (de 6 a 10 años)
- Menores B (de 11 a 17 años)
- Juveniles (de 18 a 30 años)
- Adultos (de 31 a 50 años)
- Adultos mayores (mayores de 50 años)

Se necesita un programa que, a partir del ingreso de los datos y edad de
cada participante, se muestre por pantalla a qué categoría debe ser inscripto.
Cabe destacar que, al finalizar el día, para dar fin a las inscripciones,
se debe ingresar un dni con el valor 0 y un nombre con la palabra “fin”.
*/
//</editor-fold>

public class MarathonInscription {
    public static void main(String[] args){
        
        System.out.println("Welcome to the Immigrant Marathon! Here you will know to which category you should apply to. Please, input your DNI");
        Scanner keyboard = new Scanner (System.in);
        String dni = keyboard.nextLine();
        System.out.println("Next, tell us your full name");
        String name = keyboard.nextLine();        
        Scanner keyboard2 = new Scanner (System.in);
        System.out.println("Finally, put your age");
        int age = keyboard2.nextInt();
        
        while ((!dni.equals("0")) && (!name.equalsIgnoreCase("fin"))){
            if (age >= 6 && age <= 10){
                System.out.println("Your category in the marathon is: Minors A");
                System.out.println("-----------");
            }
            else
                if (age >= 11 && age <= 17){
                    System.out.println("Your category in the marathon is: Minors B");
                    System.out.println("-----------");
                }
                else
                    if(age >= 18 && age <= 30){
                        System.out.println("Your category in the marathon is: Youths");
                        System.out.println("-----------");
                    }
                    else
                        if(age >= 31 && age <= 50){
                            System.out.println("Your category in the marathon is: Young Adults");
                            System.out.println("-----------");
                        }
                        else
                            if(age >= 51){
                                System.out.println("Your category in the marathon is: Senior Adults");
                                System.out.println("-----------");
                            }
                            else{
                                System.out.println("You are not old enough to participate in the marathon. You have to be at least 6 years old :(");
                                System.out.println("-----------");
                            }
        System.out.println("Welcome to the Immigrant Marathon! Here you will know to which category you should apply to. Please, input your DNI");
        dni = keyboard.nextLine();
        System.out.println("Next, tell us your full name");
        name = keyboard.nextLine();
        System.out.println("Finally, put your age");
        age = keyboard2.nextInt();
        System.out.println("-----------");
        System.out.println("DNI " + dni);
        System.out.println("Name " + name);
        }
    }    
}
