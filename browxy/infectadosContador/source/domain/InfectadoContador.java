package domain;

public class InfectadoContador {

    public static void main(String[] args) {
        java.util.Scanner lector=new java.util.Scanner(System.in);
        System.out.println("Estadisticas Diarias:");
            String nom;
            int edad=0;
            boolean esFemenino=true;
            String continuar;
            //variables para calculos
            int personasTotal=0;
            int personasTotalInfectadas=0;
            int contadorHInfectados=0;
            int contadorH=0;
            int contadorMInfectados=0;
            int contadorM=0;
            int contadorHombresMayores=0;
            int contadorMayores=0;
        do{
                personasTotal=personasTotal+1;
                System.out.println("Ingresar nombre:");
                nom=lector.nextLine();
                System.out.println("Ingresar sexo (M o F)");
                esFemenino=true;
                    if(lector.nextLine().equalsIgnoreCase("m")){
                        esFemenino=false;
                        contadorH=contadorH+1;
                    }else{
                        contadorM=contadorM+1;
                    }
                System.out.println("Ingresar edad:");
                edad=Integer.parseInt(lector.nextLine());
                System.out.println("Infectado? (S o N)");
                if(lector.nextLine().equalsIgnoreCase("s")){
                    personasTotalInfectadas=personasTotalInfectadas+1;
                    if(esFemenino){
                        contadorMInfectados=contadorMInfectados+1;
                    }else{
                        contadorHInfectados=contadorHInfectados+1;
                    if(edad>60){
                        contadorHombresMayores=contadorHombresMayores+1;
                        contadorMayores=contadorMayores+1;
                        }
                    }
                }
                System.out.println("Agregar otra persona? (S o N)");
                continuar=lector.nextLine();

            }while(continuar.equalsIgnoreCase("s"));
      
            System.out.println("Cantidad total de personas que hicieron el test: " + personasTotal );
            System.out.println("Cantidad total de personas infectadas: " + (personasTotalInfectadas) );
            System.out.println("Promedio de hombres infectados: " + ((contadorHInfectados*100)/contadorH)*1f+ " %");
            System.out.println("Promedio de mujeres infectadas: " + ((contadorMInfectados*100)/contadorM)*1f+ " %");
            System.out.println("Promedio de mayores de 60 infectados: " + ((contadorMayores*100) / personasTotalInfectadas)*1f+ " %" );
            System.out.println("Promedio de hombres mayores de 60 infectados: " + ((contadorHombresMayores*100)/personasTotalInfectadas)*1f+ " %" );

    }

}
