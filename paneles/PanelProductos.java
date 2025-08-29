package paneles;

import javax.swing.*;
import java.awt.*;
import modules.ItemModulo;

public class PanelProductos extends JPanel {
    public PanelProductos(String listaProductos) {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(1300, 1000));


        //Lista de Productos

        
        JLabel titulo = new JLabel("Producto");
        ItemModulo modulos = new ItemModulo();

        add(titulo, BorderLayout.NORTH);
        add(modulos);
    }
}