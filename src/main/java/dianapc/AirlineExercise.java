package dianapc;

import java.util.Scanner;

/**
 * A flight company has 6 destinations to which it makes 3 flights daily, one in
 * the morning, one at noon and one at night. To manage this data, use a matrix,
 * where each row is a destination and the number of available seats is stored
 * in each column. I. A program is needed that allows loading the matrix with
 * the number of seats for each flight.
 *
 * II. At the same time, the program must allow a user to enter the destination
 * number they want to go to, the flight number (depending on whether they want
 * to travel in the morning, at noon or at night) and the number of tickets they
 * need.
 *
 * III. Based on the user's request, the program must check whether there are a
 * sufficient number of seats for the number of tickets required. If this is the
 * case, a sign must be shown on the screen that says “your reservation was made
 * successfully” and those requested by the user must be deducted from the total
 * number of seats. If there are no more seats available, another sign must be
 * shown that says “sorry, your operation could not be completed as there are no
 * seats available.”
 *
 * The flight company states that they DO NOT KNOW how many sales/reservations
 * are made per day. Therefore, to finalize the sales, the word “finish” is
 * entered.
 *
 *
 *
 * Una compañía de vuelos cuenta con 6 destinos a los que realiza 3 vuelos
 * diariamente, uno por la mañana, otro al mediodía y otro por la noche. Para
 * administrar estos datos, utiliza una matriz, donde cada fila es un destino y
 * en cada columna se guarda la cantidad de asientos disponibles.
 *
 * I. Se necesita un programa que permita la carga de la matriz con la cantidad
 * de asientos para cada vuelo.
 *
 * II. Al mismo tiempo, el programa debe permitir a un usuario ingresar el
 * número de destino al que quiere dirigirse, el número de vuelo (dependiendo si
 * quiere viajar a la mañana, al mediodía o a la noche) y la cantidad de pasajes
 * que necesita.
 *
 * III. A partir de la solicitud del usuario, el programa debe controlar si hay
 * la cantidad suficiente de asientos para la cantidad de pasajes que se
 * requiere. En caso de que así sea, se debe mostrar un cartel por pantalla que
 * diga “su reserva fue realizada con éxito” y se debe descontar del total de
 * asientos los solicitados por el usuario. En caso de no haber más asientos
 * disponibles, se debe informar otro cartel que diga “disculpe, no se pudo
 * completar su operación dado que no hay asientos disponibles”.
 *
 * Desde la compañía de vuelos manifiestan que NO CONOCEN cuantas
 * ventas/reservas se hacen por día. Por lo cual, para finalizar las ventas se
 * ingresa la palabra “finish”.
 */
public class AirlineExercise {

    public static void main(String[] args) {

        int flights[][] = new int[6][3];
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to Techno Airlines!");
        System.out.println("These are the available destinations marked by number:");
        System.out.println("""
                           0 - Rio de Janeiro
                           1 - Cancun
                           2 - Madrid
                           3 - Rome
                           4 - Milan
                           5 - London""");
        System.out.println("These are the available flight times also marked by number:");
        System.out.println("""
                           0 - Morning
                           1 - Noon
                           2 - Night""");

        for (int f = 0; f < 6; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Enter the total amount of seats for destiny Nº " + f + " at the time " + c);
                flights[f][c] = keyboard.nextInt();
            }
        }

        Scanner keyboard2 = new Scanner(System.in);
        String flag = "";
        int destiny, hour, seats;

        while (!flag.equalsIgnoreCase("finish")) {
            System.out.println("---------- Flight Seats Sale ---------");
            System.out.println("Enter the destination Nº");
            destiny = keyboard.nextInt();
            System.out.println("Enter the time of the flight");
            hour = keyboard.nextInt();
            System.out.println("Enter the amount of seats you want to acquire");
            seats = keyboard.nextInt();

            if (destiny >= 0 && destiny <= 5) {
                if (hour >= 0 && hour <= 2) {
                    if (flights[destiny][hour] >= seats) {
                        System.out.println("Your reservation was made successfully");
                        flights[destiny][hour] = flights[destiny][hour] - seats;
                    } else {
                        System.out.println("Sorry, your operation could not be completed as there are no more seats available.");
                    }
                } else {
                    System.out.println("Hour not valid. Please enter a valid number, between 0 to 2");
                }
            } else {
                System.out.println("Invalid destination. Please enter a valid number, between 0 to 5");
            }
            
        System.out.println("Do you wish to continue making reservations? Enter the word 'finish' to end operations or any value to continue.");
        flag = keyboard2.next();
        }
    }
}