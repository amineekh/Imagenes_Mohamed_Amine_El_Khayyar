package Convertir_Imagenes.Controlador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

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

    public Editor_imagenes() {
        // ... (tu código actual)

        // Agregar ActionListener al item_abrir
        item_abrir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirImagen();
            }
        });
    }

    private void abrirImagen() {
        JFileChooser fileChooser = new JFileChooser();

        // Configurar el fileChooser para solo aceptar archivos de imagen
        fileChooser.setFileFilter(new javax.swing.filechooser.FileFilter() {
            public boolean accept(File f) {
                return f.getName().toLowerCase().endsWith(".jpg") ||
                        f.getName().toLowerCase().endsWith(".jpeg") ||
                        f.getName().toLowerCase().endsWith(".png") ||
                        f.isDirectory();
            }

            public String getDescription() {
                return "Archivos de imagen (*.jpg, *.jpeg, *.png)";
            }
        });

        int result = fileChooser.showOpenDialog(Mainpanel);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            // Mostrar la imagen en label_origen_img
            ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());
            label_origen_img.setIcon(imageIcon);
        }
    }
}
