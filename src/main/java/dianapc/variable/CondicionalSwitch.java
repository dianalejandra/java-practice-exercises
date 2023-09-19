
package dianapc.variable;

public class CondicionalSwitch {
    
    public static void main (String[] args){
        int dia = 0;
        String nombreDia;
        
        switch (dia) {
            
            case 1: nombreDia = "Lunes";
            break;
            case 2: nombreDia = "Martes";
            break;
            case 3: nombreDia = "Miercoles";
            break;
            case 4: nombreDia = "Jueves";
            break;
            case 5: nombreDia = "Viernes";
            break;
            case 6: nombreDia = "Sábado";
            break;
            case 7: nombreDia = "Domingo";
            break;
            default: nombreDia = "Número de día inválido";
            break;
            
        }
        
        System.out.println("El día de la semana seleccionado es el " + nombreDia);
        
    }    
}

/*
Otra manera de escribir el switch:

public static void main (String[] args){
        int dia = 5;
        String nombreDia;
        
        nombreDia = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Número de día inválido";
        };
        
        System.out.println("El día de la semana seleccionado es " + nombreDia);
        
    }    
}
*/