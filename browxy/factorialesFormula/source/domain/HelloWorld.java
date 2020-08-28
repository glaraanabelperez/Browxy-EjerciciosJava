package domain;

public class HelloWorld {

    public static void main(String[] args) {
    java.util.Scanner lector=new java.util.Scanner(System.in);
    int numeroCalcular;
    int i;
    double r=1;
    System.out.println("Bienvenido al programa para calcular factoriales");
    System.out.println("Ingresa el numero a calcular:");
    numeroCalcular=Integer.parseInt(lector.nextLine());
        for(i=1; i<=numeroCalcular;i++){
            r*=i;
        }
    System.out.println("El factorial de "+ numeroCalcular + " es: " + r);
    
    }
}
