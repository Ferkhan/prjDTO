package UserInterface.App;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import BusinessLogic.VideojuegoBL;
import BusinessLogic.Entities.Videojuego;
import Framework.AppException;

public class PanelVideojuego extends JPanel implements ActionListener {
    private VideojuegoBL videojuegoBL;
    private JTable tabla;
    private JButton btnPrev,
            btnNext,
            btnInicio,
            btnFinal;
    private JPanel pnlBoton;
    private DefaultTableModel tableModel;
    private String[] header;
    private Object[][] data;
    private JLabel lblPagina;
    private int pagActual,
            cantFilas,
            pagMax,
            inicio,
            ultimo;

    PanelVideojuego() throws AppException, SQLException {
        inicializarRecursos();
        activarBotones();
        personalizarPanel();
        mostrarTabla();
        setVisible(true);
    }

    private void inicializarRecursos() throws AppException, SQLException {
        videojuegoBL = new VideojuegoBL();
        btnPrev = new JButton(" << ");
        btnNext = new JButton(" >> ");
        btnInicio = new JButton(" |< ");
        btnFinal = new JButton(" >| ");
        lblPagina = new JLabel();
        pnlBoton = new JPanel();

        pagActual = 0;
        cantFilas = 5;
        inicio = (pagActual * cantFilas) + 1;
        ultimo = inicio + cantFilas;
        pagMax = (videojuegoBL.getCountFilas() - 1) / cantFilas;

        header = new String[] { "Id", "Titulo", "Distribuidor", "Plataforma Popular", "Anio Lanzamiento",
                "Ventas (millones)" };
        data = new Object[videojuegoBL.getRegistros(inicio, ultimo).size()][6];

        tableModel = new DefaultTableModel(data, header);
        actualizarTabla();

    }

    private void activarBotones() {
        btnNext.addActionListener(this);
        btnPrev.addActionListener(this);
        btnInicio.addActionListener(this);
        btnFinal.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnNext)
            if (pagActual < pagMax)
                pagActual++;
        if (e.getSource() == btnPrev)
            if (pagActual > 0)
                pagActual--;
        if (e.getSource() == btnInicio)
            pagActual = 0;
        if (e.getSource() == btnFinal)
            pagActual = pagMax;
        try {
            actualizarTabla();
        } catch (AppException e1) {
            e1.printStackTrace();
        }
    }

    private void actualizarTabla() throws AppException {
        tableModel.setRowCount(0);
        inicio = (pagActual * cantFilas) + 1;
        ultimo = inicio + cantFilas;

        int index = 0;
        for (Videojuego v : videojuegoBL.getRegistros(inicio, ultimo)) {
            data[index][0] = v.getId();
            data[index][1] = v.getNombre();
            data[index][2] = v.getDistribuidor();
            data[index][3] = v.getPlataforma();
            data[index][4] = v.getAnioLanzamiento();
            data[index][5] = v.getVentasEstimadas() / 1000000;
            tableModel.addRow(data[index]);
            index++;
        }

        actualizarIndicadorPagina();
    }

    private void actualizarIndicadorPagina() {
        String textoPagina = " Page  :  [  "
                + (pagActual + 1)
                + "  of  "
                + (pagMax + 1)
                + "  ]  ";
        lblPagina.setText(textoPagina);
    }

    private void personalizarPanel() {
        setLayout(new BorderLayout());
    }

    private void mostrarTabla() throws AppException {
        int rowHeight = 30;
        Font fuente = new Font("Arial", Font.PLAIN, 16);
        Font fuente2 = new Font("Arial", Font.BOLD, 16);

        tabla = new JTable(tableModel);
        tabla.setShowHorizontalLines(true);
        tabla.setGridColor(Color.LIGHT_GRAY);
        tabla.setRowSelectionAllowed(true);
        tabla.setColumnSelectionAllowed(false);
        tabla.setPreferredScrollableViewportSize(new Dimension(1000, 400));
        tabla.setFillsViewportHeight(true);

        tabla.setRowHeight(rowHeight);
        tabla.getTableHeader().setFont(fuente2); // Configura el renderizador de encabezado personalizado
        tabla.setFont(fuente);

        agregarComponentes();
        actualizarTabla();

    }

    private void agregarComponentes() {
        pnlBoton.add(btnInicio);
        pnlBoton.add(btnPrev);
        pnlBoton.add(lblPagina);
        pnlBoton.add(btnNext);
        pnlBoton.add(btnFinal);
        add(new JScrollPane(tabla), BorderLayout.CENTER);
        add(pnlBoton, BorderLayout.SOUTH);
    }

}
