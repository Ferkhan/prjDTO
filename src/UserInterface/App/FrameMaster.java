package UserInterface.App;

import javax.swing.JFrame;

import Framework.AppException;

import java.awt.BorderLayout;

public class FrameMaster extends JFrame {
    private PanelVideojuego panelVideojuego;

    public FrameMaster(String titulo) throws AppException {
        personalizarFrame(titulo);
        mostrarPanel();

        setVisible(true);
    }

    private void personalizarFrame(String titulo) throws AppException {
        setTitle(titulo);                           
        setLayout(new BorderLayout());
        setResizable(true);
        setSize(1200, 720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
    }

    private void mostrarPanel() throws AppException {
        panelVideojuego = new PanelVideojuego();
        add(panelVideojuego, BorderLayout.CENTER);
        
    }
}
