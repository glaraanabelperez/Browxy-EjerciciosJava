package domain;

import java.io.BufferedReader;
import java.net.URL;
import java.net.URLConnection;
import java.io.InputStream;
import java.io.InputStreamReader;


public class SistemTeatro {
    
    public static void main(String[] args) {
        java.util.Scanner lector = new java.util.Scanner(System.in);
        System.out.println("Bienvenido al sistema de teatro");
       
        String[][] lugares = new String[3][5];
        limpiarLugares(lugares);
        
        boolean salir = false;
        while (salir == false) {
            
            System.out.println("Ingrese la operacion a realizar");
            System.out.println("1. Listar lugares");
            System.out.println("2. Comprar lugar");
            System.out.println("3. Calcular ganancia");
            System.out.println("4. Salir");
            int operacion = Integer.parseInt(lector.nextLine());
            
            if (operacion == 1) {
                listarLugares(lugares);
            } else if (operacion == 2) {
                comprarLugar(lugares, lector);
            } else if (operacion == 3) {
                calcularGanancia(lugares);
            } else if (operacion == 4) {
                salir = true;
            } else {
                System.out.println("operacion invalida");
            }
        }
    }    
    
    static void limpiarLugares(String[][] lugares) {
        for (int i=0; i<lugares.length; i++) {
            for (int j=0; j<lugares[i].length; j++) {
                lugares[i][j]="-";
            }
        }
    }
    
    /* 
     Esta función imprime el tablero en pantalla
     Los numerales son espacios en blanco al final de la tabla para facilitar el armado
     Ejemplo
       0 1 2 3 4 
     0 X - - - -#
     1 - - - - -#    
     2 - - - - -# 
    */
    static void listarLugares(String[][] lugares) {
        int i, j, num=0;
        System.out.println( "  0" + " 1" + " 2" + " 3" + " 4" );
        for(i=0;i<lugares.length; i++){
            System.out.print(num + " ");
            for(j=0; j<lugares[i].length; j++){
                System.out.print( lugares[i][j]==null ? "- " : lugares[i][j] + " ");
            }
            System.out.println("");
            num++;
        }
    }
    
    /*
     Esta función le pide al usuario una fila entre 0 y 3 y una asiento de dicha fila entre 0 y 4
     Si el asiento estaba libre el sistema debe escribir: "compra realizada" y marcar como ocupado el asiento con una "X"
     Si el asiento estaba ocupado el sistema debe escribir: "lugar ocupado"
    */
    static void comprarLugar(String[][] lugares, java.util.Scanner lector) {
        int fila, columna, i, j, ganancia=0;
        System.out.println("Ingrese la fila");
        fila=Integer.parseInt(lector.nextLine());
        System.out.println("Ingrese la columna");
        columna=Integer.parseInt(lector.nextLine());
         if(!lugares[fila][columna].equals("-")){
                        System.out.println("lugar ocupado");
                    }else{
                        lugares[fila][columna]="X";
                        System.out.println("compra realizada");
                    }
    }
    
    /*
    Esta operación calcula la ganancia que se obtuvo hasta el momento por los lugares ocupados
     * Los asientos de la fila 0 pagan 50 pesos
     * Los asientos de la fila 1 pagan 30 pesos
     * Los asientos de la fila 2 pagan 10 pesos
     Por ejemplo si estuvieran comprados 
      - 2 asientos de la fila 0
      - 1 asiento de la fila 1
      - 2 asientos de la fila 2
     El sistema debería imprimir al usar esta operación: "La ganancia actual es de: 150 pesos"
    */
    static void calcularGanancia(String[][] lugares) {
        int ganancia=0, i;
        for(i=0; i<lugares.length; i++){
           if(lugares[0][i].equals("X")){ganancia+=50;} 
           if(lugares[1][i].equals("X")){ganancia+=30;}
            if(lugares[2][i].equals("X")){ganancia+=10;}
            }
            System.out.println("La ganancia actual es de: " + ganancia + " pesos");
    }

}
