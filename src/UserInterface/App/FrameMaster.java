package UserInterface.App;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Framework.AppException;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.SQLException;

public class FrameMaster extends JFrame {
    private PanelVideojuego panelVideojuego;
    private JLabel lblTitulo;

    public FrameMaster(String titulo) throws AppException, SQLException {
        personalizarFrame(titulo);
        mostrarPanel();

    }

    private void personalizarFrame(String titulo) throws AppException {
        setTitle(titulo);                    
        setLayout(new BorderLayout());
        setResizable(true);
        setSize(1000, 350);
        setLocationRelativeTo(null);
        setResizable(false);       
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
    }

    private void mostrarPanel() throws AppException, SQLException {
        JPanel panel = new JPanel();
        Font fuente = new Font("Arial", Font.BOLD, 20);     
        panelVideojuego = new PanelVideojuego();
        lblTitulo = new JLabel("LISTA DE VIDEOJUEGOS");
        lblTitulo.setFont(fuente);
        panel.add(lblTitulo);
        panel.setPreferredSize(new Dimension(0, 50));
        panel.setBackground(Color.WHITE);
        add(panelVideojuego, BorderLayout.CENTER);
        add(panel, BorderLayout.NORTH);
        
    }
}
