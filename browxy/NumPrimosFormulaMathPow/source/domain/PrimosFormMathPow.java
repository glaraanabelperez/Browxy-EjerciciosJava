package domain;
import static java.lang.Math.*;
public class PrimosFormMathPow {
    
    public static void main(String[] args) {
        java.util.Scanner lector=new java.util.Scanner(System.in);
        
        double numeroInicio;
        double numeroFinal;
        double i;
        double calculo;
        double resto;
        System.out.println("Ingresar primer numero:");
            numeroInicio=Double.parseDouble(lector.nextLine());
        System.out.println("Ingresar ultimo numero:");
            numeroFinal=Double.parseDouble(lector.nextLine());
        System.out.println("Numeros primos entre " + (int)numeroInicio + " y "+ (int)numeroFinal);
        for(i=numeroInicio; i<=numeroFinal; i++){
//teorema: 217-1=216=65536, que al dividirlo entre 17 deja resto 1
                calculo=Math.pow(2,i-1);
                resto=calculo%i;
                    if((int)resto==1){
                        System.out.println((int)i);
                    }
        }
    }    
}
