package domain;

public class NumerosRomanos {

    public static void main(String[] args) {
        java.util.Scanner lector= new java.util.Scanner(System.in);
        System.out.println("Conversor de numeros arabigos en romanos");
        System.out.println("Ingresa un numero de 1 a 10");
                int numero= Integer.parseInt(lector.nextLine());
                if(numero>0 && numero<11){
                    String numerosRomano[]={"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
                    int u=(numero%10)-1;
                    System.out.println(numerosRomano[u]);
                }
                else {
                    System.out.println("El numero no se encuentra entre el 1 y 10");
                }
    }
}
