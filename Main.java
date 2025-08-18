import paneles.PanelBuscador;
import paneles.PanelProductos;

import javax.swing.*;

import control.TiendaFecher;

import java.awt.*;

public class Main {
    
    public static void main(String[] args) {

        try {
        TiendaFecher consultaAPI = new TiendaFecher();
        String resultado = consultaAPI.obtenerProductos("https://fakestoreapi.com/products");
        System.out.println("Respuesta de la API");
        System.out.println(resultado);

        } catch (Exception e) {

        }
        
        System.out.println("Tienda Java");
        // 1. Crear la ventana principal
        JFrame ventana = new JFrame("Tienda Java");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ventana.setLayout(new BorderLayout()); // Usar BorderLayout
        
        // 2. Crear instancia del PanelBuscador
        PanelBuscador panelBuscador = new PanelBuscador();
        
        // 3. Agregar el panel buscador a la ventana (en la posición WEST)
        ventana.add(panelBuscador.getJPanel(), BorderLayout.WEST);
        
        // 4. (Opcional) Crear y agregar un panel central
        JPanel panelCentral = new JPanel();
        ventana.add(panelCentral, BorderLayout.CENTER);

        /////////////////////////
        PanelProductos panelProductos = new PanelProductos();
        ventana.add(panelProductos.getJPanel(), BorderLayout.CENTER);
        
        // 5. Mostrar la ventana
        ventana.setVisible(true);
    }
}