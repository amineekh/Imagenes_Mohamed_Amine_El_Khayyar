package Convertir_Imagenes.Controlador;

import javax.swing.*;

public class Editor_imagenes {
    private JPanel Mainpanel;
    private JMenuBar menubar;
    private JMenu menu_archivo;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Editor_imagenes");
        frame.setContentPane(new Editor_imagenes().Mainpanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        frame.setVisible(true);
        frame.setBounds(0,  0,  800, 600);
    }

    private JMenuItem item_abrir;
    private JMenuItem item_guardar;
    private JMenuItem item_cerrar;
    private JMenu menu_efecto;
    private JMenuItem item_blanco_negro;
    private JMenuItem item_grises;
    private JMenuItem item_Sepia;
    private JMenuItem item_altocontraste;
    private JMenuItem item_pixelada;
    private JMenuItem item_crearicono;
    private JMenuItem item_bajaresolucion;
    private JPanel panel_convertir_destino;
    private JPanel panel_origen;
    private JPanel panel_destino;
    private JPanel panel_botones;
    private JButton boton_convertir;
    private JPanel panel_parametros;
    private JPanel panel_titulo;
    private JLabel label_origen_img;
    private JSlider slider1;
    private JLabel label_0;
    private JLabel label_100;
}
