package UserInterface.App;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import BusinessLogic.VideojuegoBL;
import BusinessLogic.Entities.Videojuego;
import Framework.AppException;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GPT {
    private static DefaultTableModel tableModel;
    private static int currentPage = 0;
    private static final int pageSize = 5;
    private static JFrame frame = new JFrame("Paginated JTable Example");

    public static void main(String[] args) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JButton prevButton = new JButton("Anterior");
        JButton nextButton = new JButton("Siguiente");

        tableModel = new DefaultTableModel();
        JTable table = new JTable(tableModel);

        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentPage > 0) {
                    currentPage--;
                    try {
                        updateTableData();
                    } catch (AppException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        });

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentPage < (tableModel.getRowCount() - 1) / pageSize) {
                    currentPage++;
                    try {
                        updateTableData();
                    } catch (AppException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        });

        panel.add(prevButton);
        panel.add(nextButton);

        frame.add(panel, BorderLayout.NORTH);
        frame.add(new JScrollPane(table), BorderLayout.CENTER);
        
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
    private static void algo() {

    }

    private static void updateTableData() throws AppException {
        tableModel.setRowCount(0); // Limpia la tabla
        int start = currentPage * pageSize;
        int end = Math.min(start + pageSize, getData().length);

        for (int i = start; i < end; i++) {
            Object[] fila = getData()[i];
            tableModel.addRow(fila);
        }
        JTable table = new JTable(tableModel);
        frame.add(new JScrollPane(table), BorderLayout.CENTER);
        table.setVisible(true);
        frame.setVisible(true);
    }

    // Simulación de datos de ejemplo
    private static Object[][] getData() throws AppException {
        VideojuegoBL videojuegoBL;
        videojuegoBL = new VideojuegoBL();
        // String[] header = {"Id", "Titulo", "Distribuidor", "Plataforma Popular", "Anio Lanzamiento", "Ventas (millones)"};
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
        return data;
    }
}
