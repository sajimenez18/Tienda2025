package views;

import paneles.*;

import java.awt.*;
import javax.swing.*;

public class Dashboard extends JFrame {

    public Dashboard(String listaProductos){
        // 1. Crear la ventana principal
        JFrame ventana = new JFrame("Tienda Java");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ventana.setLayout(new BorderLayout()); // Usar BorderLayout

        // 2. Crear PanelBuscador
        PanelBuscador panelBuscador = new PanelBuscador();
        ventana.add(panelBuscador.getJPanel(), BorderLayout.WEST);
        
        // 4. PanelCentral
        JPanel panelCentral = new JPanel();
        ventana.add(panelCentral, BorderLayout.CENTER);

        //PanelProductos centro
        PanelProductos panelProductos = new PanelProductos(listaProductos);
        ventana.add(panelProductos.getJPanel(), BorderLayout.CENTER);
        
        // 5. Mostrar la ventana
        ventana.setVisible(true);
}
}