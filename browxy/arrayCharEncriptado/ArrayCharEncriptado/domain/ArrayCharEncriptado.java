package domain;
import java.util.*;
public class ArrayCharEncriptado {

  public static void main(String[] args) {
    Scanner lector=new Scanner(System.in);
    System.out.println("Bienvenido al encriptador / desencriptador");
    System.out.println("Ingrese la operacion que desea realizar 1) Encriptar / 2) Desencriptar");
        int operacion=Integer.parseInt(lector.nextLine());
    System.out.println("Ingrese el corrimiento");
        int corrimiento=Integer.parseInt(lector.nextLine());
    System.out.println("Ingrese el texto");
        String texto=lector.nextLine();
        char [] textoArrayChar=texto.toCharArray();
        char [] resultado=new char [textoArrayChar.length];
        int i;
            if(operacion==1){
                for(i=0; i<textoArrayChar.length; i++){
                    resultado[i]=(char)(textoArrayChar[i]+corrimiento);
                }
                String resultadoString=String.valueOf(resultado);
                System.out.println("El resultado es:");
                System.out.println(resultadoString);
            }else{
                for(i=0;i<textoArrayChar.length; i++){
                    resultado[i]=(char)(textoArrayChar[i]-corrimiento);
                }
                  String resultadoString=String.valueOf(resultado);
                System.out.println("El resultado es:");
                System.out.println(resultadoString);
            }
  }
}
