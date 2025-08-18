package control;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.awt.*;
import javax.swing.*;

import javax.swing.JFrame;

public class TiendaFecher {

    public static String obtenerProductos(String urlApi) {

        //Objeto String mas avanzado (incluye signos raros sin que se rompa)
        StringBuilder resultado = new StringBuilder();

        //Funcion para que consulte hasta que lo tengamos todo
        //Similar al if
        try {
        //Consulta en internet
        URL url = new URL(urlApi);
        HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
        conexion.setRequestMethod("GET");
        conexion.setConnectTimeout(5000);
        conexion.setReadTimeout(5000);
        conexion.connect();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        //El resultado lo convierte en String
        return resultado.toString();
    }
    
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Tienda Fake"); // Constructor de JFrame (crea la ventana)
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cierra el programa al salir
        ventana.setExtendedState(JFrame.MAXIMIZED_BOTH); // Ventana maximizada (segundo proyecto)
        ventana.setLayout(new BorderLayout()); // Organiza componentes en zonas
        ventana.setLocationRelativeTo(null); // Centra la ventana inicialmente

        ventana.setVisible(true);
    }
}
//Repasar programacion orientada a objetos