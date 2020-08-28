package domain;
import java.util.*;
public class TatetiMatriz {

    public static void main(String[] args) {
    Scanner lector=new Scanner(System.in);
    String [][]tateti=new  String [3][3];
    int Fila;
    int Columna;
    System.out.println("Bienvenidos al tateti (Version 1)");
    int a=0;
    int i;
    int j;
        while(a<9){
              System.out.println("Jugador 1, ingresar fila de la jugada");
                Fila=Integer.parseInt(lector.nextLine());
                System.out.println("Jugador 1, ingresar columna de la jugada");
                Columna=Integer.parseInt(lector.nextLine());
               
            while(tateti[Fila][Columna]=="X"||tateti[Fila][Columna]=="O") {
                System.out.println("La posicion ya se encuentra ocupada!");
                        for ( i=0; i<tateti.length;i++) {
                        for ( j=0; j<tateti[i].length;j++) {
                                if(tateti[i][j]==null){
                                    System.out.print("- ");
                                }else{
                                    System.out.print(tateti[i][j] +" ");
                                    }
                                    }
                        System.out.println("");
                        }
                System.out.println("Jugador 1, ingresar fila de la jugada");
                Fila=Integer.parseInt(lector.nextLine());
                System.out.println("Jugador 1, ingresar columna de la jugada");
                Columna=Integer.parseInt(lector.nextLine());
            }
            tateti[Fila][Columna]="X";
            a++;
            for ( i=0; i<tateti.length;i++) {
                        for ( j=0; j<tateti[i].length;j++) {
                                if(tateti[i][j]==null){
                                    System.out.print("- ");
                                }else{
                                    System.out.print(tateti[i][j] +" ");
                                    }
                                    }
                        System.out.println("");
                }
             if(a<9){
                  System.out.println("Jugador 2, ingresar fila de la jugada");
                    Fila=Integer.parseInt(lector.nextLine());
                    System.out.println("Jugador 2, ingresar columna de la jugada");
                    Columna=Integer.parseInt(lector.nextLine());
                    
                while(tateti[Fila][Columna]=="X"||tateti[Fila][Columna]=="O") {
                    System.out.println("La posicion ya se encuentra ocupada!");
                       for ( i=0; i<tateti.length;i++) {
                        for ( j=0; j<tateti[i].length;j++) {
                                if(tateti[i][j]==null){
                                    System.out.print("- ");
                                }else{
                                    System.out.print(tateti[i][j] +" ");
                                    }
                                    }
                        System.out.println("");
                        }
                    System.out.println("Jugador 2, ingresar fila de la jugada");
                    Fila=Integer.parseInt(lector.nextLine());
                    System.out.println("Jugador 2, ingresar columna de la jugada");
                    Columna=Integer.parseInt(lector.nextLine());
                }
                        
                tateti[Fila][Columna]="O";
                a++;
                for ( i=0; i<tateti.length;i++) {
                        for ( j=0; j<tateti[i].length;j++) {
                                if(tateti[i][j]==null){
                                    System.out.print("- ");
                                }else{
                                    System.out.print(tateti[i][j] +" ");
                                    }
                                    }
                        System.out.println("");
                }
             }
        }
}
}
