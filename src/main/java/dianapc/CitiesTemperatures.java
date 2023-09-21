package dianapc;

import java.util.Arrays;
import java.util.Scanner;

/**
 * The names, minimum and maximum temperatures of 5 cities are saved in three different
 * vectors. In the first vector the names of the cities are stored, in the second
 * the minimum temperatures reached and in the third the maximum temperatures 
 * reached in the last week. A program is needed that allows the imput of new cities,
 * their minimum and maximum temperatures; In addition, it must be able to report
 * on the screen which was the city with the lowest temperature and which was with
 * the highest temperature (providing at the same time the number of degrees).
 * 
 * En tres vectores diferentes se guardan los nombres, temperaturas mínimas y máximas
 * de 5 ciudades. En el primer vector se guardan los nombres de las ciudades, 
 * en el segundo las temperaturas mínimas alcanzadas y en el tercero las temperaturas
 * máximas alcanzadas en la última semana. Se necesita un programa que permita la
 * carga de las ciudades, sus temperaturas mínimas y máximas; además, deberá poder
 * informar por pantalla cual fue la ciudad con la temperatura más baja y cual con
 * la temperatura más alta (dando a conocer al mismo tiempo la cantidad de grados).
 */

public class CitiesTemperatures {
    
    public static void main (String [] args){
        
        String cities [] = new String [5];
        Double minTemp [] = new Double [5];
        Double maxTemp [] = new Double [5]; 
        
        Scanner keyboard = new Scanner (System.in);
        Scanner keyboard2 = new Scanner (System.in);
        
        for(int i=0; i<cities.length; i++ ){
            System.out.println("Enter city Nº"+ i +" name ");
            cities[i] = keyboard.next();
            
            System.out.println("Enter minimum temperature of city " + i);
            minTemp[i] = keyboard2.nextDouble();
            
            System.out.println("Enter maximum temperature of city " + i);
            maxTemp[i] = keyboard2.nextDouble();            
        }
        
        Double minimum = 9999999.00;
        int minPos = -1;
        
        for(int i=0; i<minTemp.length; i++ ){            
            if(minTemp[i]< minimum){
                minimum = minTemp[i];
                minPos = i;
            }
        }
        
        Double maximum = -9999999.00;
        int maxPos = -1;
        
        for(int i=0; i<maxTemp.length; i++ ){            
            if(maxTemp[i]> maximum){
                maximum = maxTemp[i];
                maxPos = i;
            }
        }
        
        System.out.println("The minimum temperature is of " + minimum + "º.");
        System.out.println("It was registered in " + cities[minPos]);
        
        System.out.println("The maximum temperature is of " + maximum + "º.");
        System.out.println("It was registered in " + cities[maxPos]);
    }
}