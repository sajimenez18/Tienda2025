// modules/Modulos.java
package modules;

import javax.swing.*;
import java.awt.*;

public class ItemModulo extends JPanel {
    public ItemModulo() {
        setLayout(new GridLayout(2, 4, 40, 40)); 
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40)); 

        String[] nombres = {"nombre", "nombre", "nombre", "nombre", "nombre", "nombre", "nombre", "nombre"};
        String[] precios = {"Q0", "Q0", "Q0", "Q0", 
                          "Q0", "Q0", "Q0", "Q0"};

        for (int i = 0; i < 8; i++) {
            JPanel producto = new JPanel(new BorderLayout());
            producto.setBackground(Color.WHITE);

            JPanel cuadro = new JPanel();
            cuadro.setPreferredSize(new Dimension(300, 300)); 
            cuadro.setBackground(Color.WHITE);
            cuadro.setBorder(BorderFactory.createLineBorder(Color.BLACK));

            JPanel info = new JPanel(new GridLayout(2, 1));
            info.setBackground(Color.WHITE);

            JLabel nombre = new JLabel(nombres[i], SwingConstants.CENTER);
            JLabel precio = new JLabel(precios[i], SwingConstants.CENTER);

            info.add(nombre);
            info.add(precio);

            producto.add(cuadro, BorderLayout.CENTER);
            producto.add(info, BorderLayout.SOUTH);

            add(producto);
        }
    }
}