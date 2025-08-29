// paneles/PanelBusqueda.java
package paneles;

import javax.swing.*;
import java.awt.*;

public class PanelBuscador extends JPanel {
    public PanelBuscador() {
        setLayout(new BorderLayout());
        setBackground(new Color(173, 216, 230));  
        setPreferredSize(new Dimension(350, 1000)); 

        JPanel panelCampo = new JPanel(new BorderLayout(10, 10));
        panelCampo.setBackground(new Color(173, 216, 230));  

        JLabel etiqueta = new JLabel("Buscar:");
        JTextField campoTexto = new JTextField();
        campoTexto.setPreferredSize(new Dimension(250, 40));

        panelCampo.add(etiqueta, BorderLayout.NORTH);
        panelCampo.add(campoTexto, BorderLayout.CENTER);

        add(panelCampo, BorderLayout.NORTH); 
    }
}