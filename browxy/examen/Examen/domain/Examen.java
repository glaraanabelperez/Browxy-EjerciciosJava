package domain;

import java.util.*;  

// Examen Simulacro Tema 1
public class Examen {

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
        double sueldoA=0, sueldoB=0;
            int A=0, B=0;
            boolean continuar=true;
        do{
            System.out.println("Ingresar proyecto: A o B");
            String proIngresado=lector.nextLine();
            System.out.println("Ingresar sueldo mensual:");
            if(proIngresado.equalsIgnoreCase("A")){
                A++;
                sueldoA+=Integer.parseInt(lector.nextLine());
            }else{
                B++;
                sueldoB+=Integer.parseInt(lector.nextLine());
            }
            System.out.println("Desea ingresar otro empleado? S o N");
            if(lector.nextLine().equalsIgnoreCase("s")){
                continuar=true;
            }else{
                continuar=false;
            }
        }while(continuar);
        System.out.println("Resultado:");
        System.out.println("Cantidad empleados proyectos tipo A: " + A );
        System.out.println("Promedio sueldos proyectos tipo A: " + (sueldoA/A));
        System.out.println("Cantidad empleados proyectos tipo B: " + B);
        System.out.println("Promedio sueldos proyectos tipo B: " + (sueldoB/B));
    }
    
    static void punto2(java.util.Scanner lector) {
        System.out.println("Ingresar cantidad de productos");
        int cantidad = Integer.parseInt(lector.nextLine());
        int cont=0;
        String marca, color;
        int marcaAOscura = 0;
        int marcaAClara = 0;
        int marcaBOscura = 0;
        int marcaBClara = 0;
        while(cont!=cantidad){
            System.out.println("Producto: " + (cont+1));
            System.out.println("Ingresar marca (A o B)");
            marca=lector.nextLine();
            System.out.println("Ingresar color (C u O)");
            color=lector.nextLine();
            if(marca.equalsIgnoreCase("A")){
                if(color.equalsIgnoreCase("c")){
                    marcaAClara++;
                }else{
                    marcaAOscura++;
                }
            }else{
                if(color.equalsIgnoreCase("c")){
                    marcaBClara++;
                }else{
                    marcaBOscura++;
                }
            }
            cont++;
        }
        
        System.out.println("Resultado:");
        System.out.println("A - clara: " + marcaAClara);
        System.out.println("A - oscura: " + marcaAOscura);
        System.out.println("B - clara: " + marcaBClara);
        System.out.println("B - oscura: " + marcaBOscura);
        System.out.println("clara: " + (marcaAClara + marcaBClara));
        System.out.println("oscura: " + (marcaAOscura + marcaBOscura));
    }
    
    static void punto3(java.util.Scanner lector) {
        System.out.println("Ingresar el numero maximo");
        int numeroMaximo = Integer.parseInt(lector.nextLine());
        System.out.println("Resultado:");
        numeroMaximo=numeroMaximo+1;
        int num=1, resto1, resto2;
       do{
            resto1=num%3;
            resto2=num%5;
            if(resto1==0 || resto2==0){
                System.out.println(num);
            }
            num++;
        }while(num!=numeroMaximo);
        // Agregar código aquí
    }
    
    static void punto4(java.util.Scanner lector) {
        System.out.println("Ingresar numeros separados por coma");
        int[] numeros = obtenerVectorDeNumeros(lector.nextLine());
        int i, suma=0;
        for(i=0; i<numeros.length; i++){
            suma+=numeros[i];
        }
        System.out.println("Resultado: " + suma);
    }
    
    // Dada una lista de numeros con coma esta función devuelve un vector con dichos números
    static int[] obtenerVectorDeNumeros(String numerosConComa) {
        int[] numeros = Arrays.stream(numerosConComa.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();
        return numeros;
    }
    
    
}

