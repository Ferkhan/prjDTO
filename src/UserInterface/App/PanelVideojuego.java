package UserInterface.App;

import java.awt.*;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import BusinessLogic.VideojuegoBL;
import BusinessLogic.Entities.Videojuego;
import Framework.AppException;

public class PanelVideojuego extends JPanel {
    private VideojuegoBL videojuegoBL;
    private Videojuego videojuego;

    PanelVideojuego() throws AppException {
        inicializarRecursos();
        mostrarTabla();
        personalizarPanel();
        setVisible(true);
    }

    private void inicializarRecursos() {
        videojuego   = new Videojuego();
        videojuegoBL = new VideojuegoBL();
    }

    private void personalizarPanel() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 50));
    }

    private void mostrarTabla() throws AppException {
        String[] header = {"Id", "Titulo", "Distribuidor", "Plataforma Popular", "Anio Lanzamiento", "Ventas (millones)"};
        Object[][] data = new Object[videojuegoBL.getRegistrosActivos().size()][6];  
        int index = 0;
        for(Videojuego v : videojuegoBL.getRegistrosActivos()) {
            data[index][0] = v.getId();
            data[index][1] = v.getNombre();
            data[index][2] = v.getDistribuidor();
            data[index][3] = v.getPlataforma();
            data[index][4] = v.getAnioLanzamiento();
            data[index][5] = v.getVentasEstimadas() / 1000000;
            index++;
        }
        
        JTable tabla  = new JTable(data, header);
        int rowHeight = 30; // Altura deseada en píxeles
        Font fuente = new Font("Arial", Font.PLAIN, 16);               // Tipo y tamaño de letra deseado
        Font fuente2 = new Font("Arial", Font.BOLD, 16);               // Tipo y tamaño de letra deseado
        tabla.setShowHorizontalLines(true);
        tabla.setGridColor(Color.LIGHT_GRAY);
        tabla.setRowSelectionAllowed(true);
        tabla.setColumnSelectionAllowed(false);
        tabla.setPreferredScrollableViewportSize(new Dimension(1000, 400));
        tabla.setFillsViewportHeight(true);
        
        tabla.setRowHeight(rowHeight);
        tabla.getTableHeader().setFont(fuente2); // Configura el renderizador de encabezado personalizado
        tabla.setFont(fuente);

        JScrollPane scrollPane = new JScrollPane(tabla);
        add(scrollPane);
    }

    
}
