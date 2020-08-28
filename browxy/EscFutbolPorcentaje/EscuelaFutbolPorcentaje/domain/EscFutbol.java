package domain;

public class EscFutbol {

    public static void main(String[] args) {
        java.util.Scanner lector= new java.util.Scanner(System.in);
        System.out.println("Bienvenido a la escuela de futbol");
        System.out.println("Ingresa la cantidad de jugadores");
        int jugadores= Integer.parseInt(lector.nextLine());
        System.out.println("Ingresa la cantidad de jugadores por equipo");
        int jugadoresPorEquipo= Integer.parseInt(lector.nextLine());
                System.out.println("Se formaron: " + (jugadores / jugadoresPorEquipo)+ " equipos");
                System.out.println("Hay " + (jugadores % jugadoresPorEquipo)+ " jugadores sin equipos");
    }

}
