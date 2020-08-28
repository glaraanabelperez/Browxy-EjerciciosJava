package domain;

import java.util.*;  

public class ExamenUltimo {

    public static void main(String[] args) {
        java.util.Scanner lector = new java.util.Scanner(System.in);
        System.out.println("Examen DL2020 - Ingrese el punto a probar (1 a 4)");
        int operacion = Integer.parseInt(lector.nextLine());
        if (operacion == 1) {
            punto1(lector);
        }
        if (operacion == 2) {
            punto2(lector);
        }
        if (operacion == 3) {
            punto3(lector);
        }
        if (operacion == 4) {
            punto4(lector);
        }
    } 
    
    static void punto1(java.util.Scanner lector) {
        System.out.println("Mis Gastos");
        String seguir, rsta;
        double r=0, c=0, o=0, gasto=0;
        do{
            System.out.println("Ingresar tipo de gasto (R,C u O)");
            rsta=lector.nextLine();
            System.out.println("Ingresar monto del gasto");
            gasto=Double.parseDouble(lector.nextLine());
            if(rsta.equalsIgnoreCase("r")){ 
                if(gasto>r){ 
                    r=gasto; 
                }
            }
            if(rsta.equalsIgnoreCase("c")){ 
                if(gasto>c){ 
                    c=gasto;
                } 
            }
            if(rsta.equalsIgnoreCase("o")){ 
                if(gasto>o){
                    o=gasto;
                } 
            }
            System.out.println("Desea ingresar otro gasto? (S/N)");
            seguir=lector.nextLine();
            
        }while(seguir.equalsIgnoreCase("s"));
        System.out.println("Mayor gasto en ropa: " + r);
        System.out.println("Mayor gasto en comida: " + c);
        System.out.println("Mayor gasto en otros: " + o);
    }
    
    static void punto2(java.util.Scanner lector) {
        int cant=0,  cont=1;
        double chica_calida=0, chica_fria=0, grande_calida=0, grande_fria=0;
        String tamanio, tipo;
        System.out.println("Ingresar cantidad de lamparitas");
        cant=Integer.parseInt(lector.nextLine());
        while(cont<cant+1){
            System.out.println("Lamparita: " + cont);
            System.out.println("Ingresar tamano (C o G)");
             tamanio=lector.nextLine();
            System.out.println("Ingresar tipo (F o C)");
            tipo=lector.nextLine();
            if(tamanio.equalsIgnoreCase("c")&& tipo.equalsIgnoreCase("c")){chica_calida=chica_calida+1;}
            if(tamanio.equalsIgnoreCase("c")&& tipo.equalsIgnoreCase("f")){chica_fria=chica_fria+1;}
            if(tamanio.equalsIgnoreCase("g")&& tipo.equalsIgnoreCase("c")){grande_calida=grande_calida+1;}
            if(tamanio.equalsIgnoreCase("g")&& tipo.equalsIgnoreCase("f")){grande_fria=grande_fria+1;}
            cont++;
        }
        double sum=chica_calida+ chica_fria+ grande_calida+ grande_fria;
        System.out.println("Porcentaje de chicas-frias: " + ((chica_fria*100)/sum)+ "%");
        System.out.println("Porcentaje de chicas-calidas: "+ ((chica_calida*100)/sum)+ "%");
        System.out.println("Porcentaje de grandes-frias: "+ ((grande_fria*100)/sum)+ "%");
        System.out.println("Porcentaje de grandes-calidas: "+ ((grande_calida*100)/sum)+ "%");

    }
    
    static void punto3(java.util.Scanner lector) {
        System.out.println("Eliminador de vocales");
        System.out.println("Ingresar texto");
        String texto = lector.nextLine();
        String lower=texto.toLowerCase();
        char[] lowerChar = lower.toCharArray();
        int i;
        for(i=0; i<lowerChar.length-1; i++){
            if(lowerChar[i]!='a'& lowerChar[i]!='e' & lowerChar[i]!='i'
            & lowerChar[i]!='o'& lowerChar[i]!='u'){
                System.out.print(lowerChar[i]);
                }
            }
    }
    
    static void punto4(java.util.Scanner lector) {
        System.out.println("Ingresar numeros separados por coma");
        String numerosConComa = lector.nextLine();
        System.out.println("Ingresar filas de la matriz");
        int filas = Integer.parseInt(lector.nextLine());
        System.out.println("Ingresar columnas de la matriz");
        int columnas = Integer.parseInt(lector.nextLine());
        int[] numeros = obtenerVectorDeNumeros(numerosConComa);
        int[][] matriz = convertirVectorEnMatriz(numeros,filas,columnas);
        int mayor = suma(matriz, filas, columnas);
        System.out.println("Resultado: " + mayor);
    }
    
    static int suma(int[][] matriz, int filas, int columnas) {
        int posicion=0, c1=0, c2=0;
        for (int j=0;j<columnas;j++) {
            for (int i=0;i<filas;i++) {
                c1+=matriz[i][j];
            }
            if(c1>c2){
                c2=c1;
            }
            c1=0;
        }
        return c2;
        
    }
    
    static int[][] convertirVectorEnMatriz(int[] vector,int filas, int columnas) {
        int posicion=0;
        int[][] matriz = new int[filas][columnas];
        for (int i=0;i<filas;i++) {
            for (int j=0;j<columnas;j++) {
                matriz[i][j]=vector[posicion];
                posicion++;
            }
        }
        return matriz;
        
    }
    
    static int[] obtenerVectorDeNumeros(String numerosConComa) {
        int[] numeros = Arrays.stream(numerosConComa.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();
        return numeros;
    }

}

