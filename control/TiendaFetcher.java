package control;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class TiendaFetcher {

    public static String obtenerProductos(String urlApi) {


        //Objeto String mas avanzado (incluye signos raros sin que se rompa)
        //Crea un string para mas opciones
        StringBuilder resultado = new StringBuilder();
        //Objeto para crar conexion http
        HttpURLConnection conexion = null;

        //Funcion para que consulte hasta que lo tengamos todo
        //Similar al if
        try {
        //Consulta en internet y convierte a un String a una URL
        URL url = new URL(urlApi);

        //Configuracion para la conexion HTTP
        conexion = (HttpURLConnection) url.openConnection();
        conexion.setRequestMethod("GET");
        conexion.setConnectTimeout(15000);
        conexion.setReadTimeout(15000);
        conexion.connect();

        //Verificar respuesta del sevidor
        int code = conexion.getResponseCode();
        System.out.println(code);

        try (BufferedReader br = new BufferedReader(new InputStreamReader(conexion.getInputStream(),StandardCharsets.UTF_8))){
            String linea;
            while ((linea = br.readLine()) != null) {
                resultado.append(linea).append('\n');
            }
        }
        
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        
        finally {
            if(conexion != null) conexion.disconnect();
        }

        return resultado.toString();
    }
}
//Repasar programacion orientada a objetos