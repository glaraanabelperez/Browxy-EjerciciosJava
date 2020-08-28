package domain;

import java.io.BufferedReader;
import java.util.*;
import java.net.URL;
import java.net.URLConnection;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BuscadorTexto {
    
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        System.out.println("Bienvenido al buscador de textos en paginas webs!");
        System.out.println("Ingresar direccion de la pagina web, ejemplo: https://www.clarin.com");
        String  direccion=lector.nextLine();
                System.out.println("Ingresar texto a buscar");
        String palabra=lector.nextLine();
        String texto=obtenerPaginaWeb(direccion);
        if(seEncuentraPalabraEnTexto(texto, palabra)){
                    System.out.println("Se encontro la palabra: " + palabra + " en: " +  direccion);
        }else{
                    System.out.println("No se encontro la palabra: " + palabra + " en: " +  direccion);
        }
    }
    
    static boolean seEncuentraPalabraEnTexto(String texto, String palabra) {
        if (texto.indexOf(palabra) > 0) {
            return true;
        } else {
            return false;
        }
    }
    
    static String obtenerPaginaWeb(String direccion) {
      try {    
        URL url = new URL(direccion);
        URLConnection urlConnection = url.openConnection();
        InputStream is = urlConnection.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String content = "";
        String linea = br.readLine();
        while (null != linea) {
           content += linea;
           linea = br.readLine();
        }
        String texto=content;
        return texto;
        
      } catch (Exception e1) {
          throw new RuntimeException(e1);
      }
   }
    

}
