package domain;
public class Contador {

    public static void main(String[] args) {
        java.util.Scanner lector=new java.util.Scanner(System.in);
        int numero;
        int numero2;
        System.out.println("Bienvenidos al contador");
        System.out.println("Ingrese un numero de 5 al 20");
        numero=Integer.parseInt(lector.nextLine());
        if(numero>=5 && numero<=20){
            do{
                numero=numero-1;
                System.out.println(numero);
        }while(numero!=0);
        }else {
            do{
                System.out.println("Numero invalido");
                System.out.println("Ingrese un numero de 5 al 20");
                numero2=Integer.parseInt(lector.nextLine());
                numero=numero2;
            }while (numero<5 && numero>20);
        }
    }

}
