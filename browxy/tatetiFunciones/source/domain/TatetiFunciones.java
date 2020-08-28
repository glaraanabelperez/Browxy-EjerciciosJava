package domain;

public class TatetiFunciones {
    
    public static void main(String[] args) {
        java.util.Scanner lector = new java.util.Scanner(System.in);
        System.out.println("Bienvenidos al tateti (Version 2)");
        String[][] tablero = new String[3][3];
        int ganador = 0;
        int jugadasValidas = 0;
        limpiarTablero(tablero);
        while (!esFinDeJuego(jugadasValidas, ganador)) {
            int jugador = obtenerNumeroDeJugador(jugadasValidas);
            int fila = obtenerJugada(jugador,"fila",lector);
            int columna = obtenerJugada(jugador,"columna",lector);
            jugadasValidas = colocarFicha(tablero, fila, columna, jugador, jugadasValidas);
            if (hayGanador(tablero, fila, columna)) {
                ganador = jugador;
            }
            dibujarTablero(tablero);
        } 
        informarGanador(ganador);
    }
    
    static void limpiarTablero(String[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = "-";
            }
        }
    }    

    static int obtenerNumeroDeJugador(int jugadasValidas) {
        return ((jugadasValidas % 2) + 1);
    }
    
    static boolean esFinDeJuego(int jugadasValidas, int ganador) {
        if (jugadasValidas == 9 || ganador != 0) {
            return true;
        }
        return false;
    }
    
    static int obtenerJugada(int jugador, String tipoJugada, java.util.Scanner lector) {
        System.out.println("Jugador "+jugador + ", ingresar " + tipoJugada + " de la jugada");
        return Integer.parseInt(lector.nextLine());
    }
    
    static int colocarFicha(String[][] tablero, int fila, int columna, int jugador, int numeroDeJugada) {
        if (!tablero[fila][columna].equals("-")) {
            System.out.println("La posicion ya se encuentra ocupada!");
            return numeroDeJugada;
        } else {
            tablero[fila][columna] = (jugador == 1 ? "X" : "O");
            return ++numeroDeJugada;
        }
    }
    
    static void informarGanador(int ganador) {
        if (ganador == 0) {
            System.out.println("Fin del juego, empate");  
        } else {
            System.out.println("Fin del juego, ganador jugador " + ganador);    
        }  
    }
    
    static void dibujarTablero(String[][] tablero) {
        for (int i=0; i<tablero.length;i++) {
            for (int j=0; j<tablero[i].length;j++) {
                System.out.print(tablero[i][j] != null ? tablero[i][j]+ " " : "- ");
            }
            System.out.println("");
        }
    }
    
    static boolean hayGanador (String[][] tablero, int fila, int columna) {
        if (hayGanadorEnFila(tablero, fila) ||
            hayGanadorEnColumna(tablero, columna) ||
            hayGanadorEnDiagonales(tablero)) {
                return true;
        }
        return false;    
    }

    static String obtenerFichaAGuardar(String fichaEnTablero, String fichaGuardada) {
        if (fichaEnTablero == null) {
            return null;
        } else {
            if (fichaGuardada == null) {
                return fichaEnTablero;
            } else {
                if (fichaEnTablero.equals(fichaGuardada) == false) {
                    return null;
                } else {
                    return fichaGuardada;
                }
            }
        }
    }
    
    static boolean hayGanadorEnFila(String[][] tablero, int fila) {
        if(!tablero[fila][0].equals("-") &&
            tablero[fila][0].equals(tablero[fila][1]) && 
            tablero[fila][1].equals(tablero[fila][2])) {
            return true;
        }    
        return false;
    }
    
    static boolean hayGanadorEnColumna(String[][] tablero, int columna) {
        if (!tablero[0][columna].equals("-") &&
            tablero[0][columna].equals(tablero[1][columna]) && 
            tablero[1][columna].equals(tablero[2][columna])) {
            return true;
        }
        return false;
    }
    
    static boolean hayGanadorEnDiagonales(String[][] tablero) {
        if (!tablero[0][0].equals("-") &&
            tablero[0][0].equals(tablero[1][1]) && 
            tablero[1][1].equals(tablero[2][2])) { 
            return true;
        }
        if (!tablero[0][2].equals("-") &&
            tablero[0][2].equals(tablero[1][1]) && 
            tablero[1][1].equals(tablero[2][0])) {
            return true;
        }
        return false;
    }

}
