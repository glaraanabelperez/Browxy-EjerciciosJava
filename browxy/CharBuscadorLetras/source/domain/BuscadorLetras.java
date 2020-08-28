package domain;
import java.util.*;

public class BuscadorLetras {

    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        System.out.println("Bienvenido al buscador de letras");
        System.out.println("Ingresar palabra:");
         char [] palabra= lector.nextLine().toCharArray();
        System.out.println("Ingresar letra:");
        String letra= lector.nextLine();
        int i;
            for(i=0; i<palabra.length;i++){
                if(palabra[i]== letra.charAt(0)){
                    System.out.println("Se encontro la letra: "+ letra + " en la posicion: " + (i) );
                }
            }
        

    }

}
