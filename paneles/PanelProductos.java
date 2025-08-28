package paneles;

import javax.swing.border.EmptyBorder; 
import javax.swing.*;
import java.awt.*;

public class PanelProductos {
    private JPanel panelProductos;

    public PanelProductos(String listaProductos) {
        panelProductos = new JPanel(new BorderLayout());

        String[][] productos = {

        };
        
        // Panel para los cuadros vacíos
        JLabel titulo = new JLabel("Productos");
        titulo.setBorder(new EmptyBorder(20,20,10,10));
        panelProductos.add(titulo, BorderLayout.NORTH);

        JPanel panelCuadros = new JPanel(new GridLayout(2, 4, 10, 10)); // 2 filas, 4 columnas
        panelCuadros.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        
        // Crear 8 cuadros vacíos
        for (int i = 1; i <= 8; i++) {
            JPanel cuadro = new JPanel();
            cuadro.setBackground(Color.GRAY);
            cuadro.setPreferredSize(new Dimension(150, 200));
            
            panelCuadros.add(cuadro);
        }
        
        panelProductos.add(panelCuadros, BorderLayout.CENTER);
    }

    public JPanel getJPanel() {
        return panelProductos;
    }
}