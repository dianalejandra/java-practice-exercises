package dianapc;

/**
 * Draw a christmass tree in Java.
 * 
 * Dibujar un arbolito de navidad en Java.
 * 
 */
public class ChristmasTree {
    
    public static void main (String[] args){
        
        int height = 8;
        
        for(int row = 0; row < height; row++ ){
            
            for(int space = 0; space < (height-row-1); space++){
                
                System.out.print(" ");
            }
            
            for (int asterisk = 0; asterisk < (row*2)+1; asterisk++){
                
                System.out.print("*");
                
            }
            System.out.println("");
            
        }
        
        int longTrunk = 1;
        for(int base=0; base<longTrunk;base++){
            
            for(int space=0; space<(height-2);space++){
                System.out.print(" ");            
            }
            
            for(int trunk=0; trunk<3; trunk++){
                System.out.print("|");
            }
            
            System.out.println("");
        }
    }
}
