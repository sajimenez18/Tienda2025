package views;

import javax.swing.*;
import java.awt.*;
import paneles.PanelBuscador;
import paneles.PanelProductos;

public class Dashboard {
    public Dashboard(String tituloProducto, String descripcionProducto) {
        JFrame ventana = new JFrame("Gestión de Productos - " + tituloProducto);
        ventana.setSize(1600, 1000);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(new BorderLayout());

        PanelBuscador panelBusqueda = new PanelBuscador();
        // Pasar los datos reales al panel de productos
        PanelProductos panelProductos = new PanelProductos(tituloProducto);
    
        ventana.add(panelBusqueda, BorderLayout.WEST);   
        ventana.add(panelProductos, BorderLayout.CENTER); 

        ventana.setVisible(true);
    }
}