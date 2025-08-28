package paneles;

import javax.swing.*;
import java.awt.*;

public class PanelBuscador {
    private JPanel panelBuscador;
    private JTextField entradaBusqueda;
    private JButton btnBuscar;

    public PanelBuscador() {
        // Panel principal con BorderLayout y tamaño definido
        panelBuscador = new JPanel(new BorderLayout());
        panelBuscador.setBackground(new Color(154, 199, 188));
        panelBuscador.setPreferredSize(new Dimension(250, 600)); // Ancho 250px, alto 600px

        //Titulo
        JLabel titulo = new JLabel("Buscador");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 20));
        panelBuscador.add(titulo);
        
        
        // Configuración del campo de texto
        entradaBusqueda = new JTextField();
        entradaBusqueda.setAlignmentX(Component.LEFT_ALIGNMENT);
        entradaBusqueda.setPreferredSize(new Dimension(200, 30));
        entradaBusqueda.setMaximumSize(new Dimension(200, 30));
        
        // Panel contenedor para los componentes de búsqueda
        JPanel panelContenido = new JPanel();
        panelContenido.setLayout(new BoxLayout(panelContenido, BoxLayout.Y_AXIS));
        panelContenido.setBackground(new Color(154, 199, 188));
        panelContenido.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Margen interno
        
        // Configuración del botón
        btnBuscar = new JButton("Buscar");
        btnBuscar.setAlignmentX(Component.LEFT_ALIGNMENT);
        btnBuscar.setPreferredSize(new Dimension(200, 30));
        btnBuscar.setMaximumSize(new Dimension(200, 30));
        btnBuscar.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));


        // Agregar componentes al panel
        panelContenido.add(titulo);
        panelContenido.add(entradaBusqueda);

        //Espacio entre texto y boton
        panelContenido.add(Box.createRigidArea(new Dimension(0, 20)));

        panelContenido.add(btnBuscar);
        panelContenido.add(Box.createVerticalGlue()); // Empuja los componentes hacia arriba
        
        // Agregar el panel de contenido al panel principal
        panelBuscador.add(panelContenido, BorderLayout.NORTH);
    }

    public JPanel getJPanel() {
        return panelBuscador;
    }
    
    public JTextField getEntradaBusqueda() {
        return entradaBusqueda;
    }
    
    public JButton getBtnBuscar() {
        return btnBuscar;
    }
}