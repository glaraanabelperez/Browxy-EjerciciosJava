package domain;
import static java.lang.Math.*;
public class NumerosPrimos2 {
    
    public static void main(String[] args) {
        java.util.Scanner lector=new java.util.Scanner(System.in);
        
        int numeroInicio;
        int numeroFinal;
        int i;
        int division=1;
        int resto=1;
        int e;
        boolean esPrimo;
        System.out.println("Ingresar primer numero:");
            numeroInicio=Integer.parseInt(lector.nextLine());
        System.out.println("Ingresar ultimo numero:");
            numeroFinal=Integer.parseInt(lector.nextLine());
        System.out.println("Numeros primos entre " + numeroInicio + " y "+ numeroFinal);
        for(i=numeroInicio; i<=numeroFinal; i++){
            esPrimo=true;
            for(e=2;e<i; e++){
                if(i%e==0){
                    esPrimo=false;
                    }
                } if(esPrimo){
                    System.out.println(i);
                    }
                
            }
    }    
}
