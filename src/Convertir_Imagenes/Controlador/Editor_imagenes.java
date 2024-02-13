package Convertir_Imagenes.Controlador;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Editor_imagenes extends Component {
    private JPanel Mainpanel;
    private JMenuBar menubar;
    private JMenu menu_archivo;

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
    private JPanel panel_menu;
    private JScrollPane scroll_parametros;
    private JPanel panel_nivel_scroll;
    private JSlider slider1;
    private JSlider slider2;
    private JSlider slider3;
    private JSlider slider4;
    private JSlider slider5;
    private JSlider slider6;
    private JSlider slider7;
    private JLabel label_destino_img;
    private JLabel label_parametro_1;
    private JLabel label_1pr_100;
    private JLabel label_1pr_0;
    private JLabel label_parametro_2;
    private JLabel label_2pr_0;
    private JLabel label_2pr_100;
    private JLabel label_parametro_3;
    private JLabel label_3pr_0;
    private JLabel label_3pr_100;
    private JLabel label_parametro_4;
    private JLabel label_4pr_100;
    private JLabel label_4pr_0;
    private JLabel label_parametro_5;
    private JLabel label_5pr_0;
    private JLabel label_5pr_100;
    private JLabel label_parametro_6;
    private JLabel label_6pr_100;
    private JLabel label_6pr_0;
    private JLabel label_parametro_7;
    private JLabel label_7pr_0;
    private JLabel label_7pr_100;

    public Editor_imagenes() {
        // Agregar ActionListener al item_abrir
        item_abrir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirImagen();
            }
        });

        item_guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    ImageIcon icon = (ImageIcon) label_destino_img.getIcon();
                    Image image = icon.getImage();
                    BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_RGB);
                    Graphics2D g2d=bufferedImage.createGraphics();
                    g2d.drawImage(image, 0, 0, null);
                    g2d.dispose();
                    JFileChooser fileChooser = new JFileChooser();
                    int returnValue = fileChooser.showOpenDialog(null);

                    if (returnValue == JFileChooser.APPROVE_OPTION) {
                        JOptionPane.showMessageDialog(null, "Archivo seleccionado: " + fileChooser.getSelectedFile().getAbsolutePath());
                    }
                    String ruta_a_guardar=fileChooser.getSelectedFile().getPath();
                    File outputFile = new File(ruta_a_guardar);
                    ImageIO.write(bufferedImage,"jpg",outputFile);
                    JOptionPane.showMessageDialog(Editor_imagenes.this,"La imagen ha sido guardada con éxito.");

                }catch (IOException ex){
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(Editor_imagenes.this, "Fallo al guardar la imagen");


                }
            }
        });


        item_cerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        item_blanco_negro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String ruta_img_blanco_negro= "src/Convertir_Imagenes/img/Costa_blanco_negro.jpg";
                ImageIcon img_icon = new ImageIcon(ruta_img_blanco_negro);
                label_destino_img.setIcon(img_icon);
                label_destino_img.setVisible(false);

                label_parametro_1.setVisible(true);
                slider1.setVisible(true);
                label_1pr_0.setVisible(true);
                label_1pr_100.setVisible(true);

                label_parametro_2.setVisible(false);
                label_parametro_3.setVisible(false);
                label_parametro_4.setVisible(false);
                label_parametro_5.setVisible(false);
                label_parametro_6.setVisible(false);
                label_parametro_7.setVisible(false);

                label_2pr_0.setVisible(false);
                label_3pr_0.setVisible(false);
                label_4pr_0.setVisible(false);
                label_5pr_0.setVisible(false);
                label_6pr_0.setVisible(false);
                label_7pr_0.setVisible(false);

                label_2pr_100.setVisible(false);
                label_3pr_100.setVisible(false);
                label_4pr_100.setVisible(false);
                label_5pr_100.setVisible(false);
                label_6pr_100.setVisible(false);
                label_7pr_100.setVisible(false);

                slider2.setVisible(false);
                slider3.setVisible(false);
                slider4.setVisible(false);
                slider5.setVisible(false);
                slider6.setVisible(false);
                slider7.setVisible(false);

                boton_convertir.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        label_destino_img.setVisible(true);
                    }
                });

            }
        });


        item_grises.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ruta_img_blanco_negro= "src/Convertir_Imagenes/img/Costa_tono_grises.jpg";
                ImageIcon img_icon = new ImageIcon(ruta_img_blanco_negro);
                label_destino_img.setIcon(img_icon);
                label_destino_img.setVisible(false);

                label_parametro_1.setVisible(true);
                label_1pr_0.setVisible(true);
                label_1pr_100.setVisible(true);
                slider1.setVisible(true);

                label_2pr_100.setVisible(true);
                label_parametro_2.setVisible(true);
                label_2pr_0.setVisible(true);
                slider2.setVisible(true);

                label_parametro_3.setVisible(false);
                label_parametro_4.setVisible(false);
                label_parametro_5.setVisible(false);
                label_parametro_6.setVisible(false);
                label_parametro_7.setVisible(false);

                label_3pr_0.setVisible(false);
                label_4pr_0.setVisible(false);
                label_5pr_0.setVisible(false);
                label_6pr_0.setVisible(false);
                label_7pr_0.setVisible(false);

                label_3pr_100.setVisible(false);
                label_4pr_100.setVisible(false);
                label_5pr_100.setVisible(false);
                label_6pr_100.setVisible(false);
                label_7pr_100.setVisible(false);

                slider3.setVisible(false);
                slider4.setVisible(false);
                slider5.setVisible(false);
                slider6.setVisible(false);
                slider7.setVisible(false);

                boton_convertir.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        label_destino_img.setVisible(true);
                    }
                });
            }
        });
        item_Sepia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ruta_img_blanco_negro= "src/Convertir_Imagenes/img/Costa_sepia.jpg";
                ImageIcon img_icon = new ImageIcon(ruta_img_blanco_negro);
                label_destino_img.setIcon(img_icon);
                label_destino_img.setVisible(false);

                label_parametro_1.setVisible(true);
                label_1pr_0.setVisible(true);
                label_1pr_100.setVisible(true);
                slider1.setVisible(true);

                label_2pr_100.setVisible(true);
                label_parametro_2.setVisible(true);
                label_2pr_0.setVisible(true);
                slider2.setVisible(true);

                label_parametro_3.setVisible(true);
                label_3pr_0.setVisible(true);
                label_3pr_100.setVisible(true);
                slider3.setVisible(true);

                label_parametro_4.setVisible(false);
                label_parametro_5.setVisible(false);
                label_parametro_6.setVisible(false);
                label_parametro_7.setVisible(false);

                label_4pr_0.setVisible(false);
                label_5pr_0.setVisible(false);
                label_6pr_0.setVisible(false);
                label_7pr_0.setVisible(false);

                label_4pr_100.setVisible(false);
                label_5pr_100.setVisible(false);
                label_6pr_100.setVisible(false);
                label_7pr_100.setVisible(false);


                slider4.setVisible(false);
                slider5.setVisible(false);
                slider6.setVisible(false);
                slider7.setVisible(false);

                boton_convertir.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        label_destino_img.setVisible(true);
                    }
                });
            }
        });
        item_altocontraste.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ruta_img_blanco_negro= "src/Convertir_Imagenes/img/Costa_alto_contraste.jpg";
                ImageIcon img_icon = new ImageIcon(ruta_img_blanco_negro);
                label_destino_img.setIcon(img_icon);
                label_destino_img.setVisible(false);

                label_parametro_1.setVisible(true);
                label_1pr_0.setVisible(true);
                label_1pr_100.setVisible(true);
                slider1.setVisible(true);

                label_2pr_100.setVisible(true);
                label_parametro_2.setVisible(true);
                label_2pr_0.setVisible(true);
                slider2.setVisible(true);

                label_parametro_3.setVisible(true);
                label_3pr_0.setVisible(true);
                label_3pr_100.setVisible(true);
                slider3.setVisible(true);

                label_parametro_4.setVisible(true);
                label_4pr_0.setVisible(true);
                label_4pr_100.setVisible(true);
                slider4.setVisible(true);

                label_parametro_5.setVisible(false);
                label_parametro_6.setVisible(false);
                label_parametro_7.setVisible(false);

                label_5pr_0.setVisible(false);
                label_6pr_0.setVisible(false);
                label_7pr_0.setVisible(false);

                label_5pr_100.setVisible(false);
                label_6pr_100.setVisible(false);
                label_7pr_100.setVisible(false);

                slider5.setVisible(false);
                slider6.setVisible(false);
                slider7.setVisible(false);

                boton_convertir.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        label_destino_img.setVisible(true);
                    }
                });

            }
        });
        item_pixelada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ruta_img_blanco_negro= "src/Convertir_Imagenes/img/Costa_pixelada.jpg";
                ImageIcon img_icon = new ImageIcon(ruta_img_blanco_negro);
                label_destino_img.setIcon(img_icon);
                label_destino_img.setVisible(false);

                label_parametro_1.setVisible(true);
                label_1pr_0.setVisible(true);
                label_1pr_100.setVisible(true);
                slider1.setVisible(true);

                label_2pr_100.setVisible(true);
                label_parametro_2.setVisible(true);
                label_2pr_0.setVisible(true);
                slider2.setVisible(true);

                label_parametro_3.setVisible(true);
                label_3pr_0.setVisible(true);
                label_3pr_100.setVisible(true);
                slider3.setVisible(true);

                label_parametro_4.setVisible(true);
                label_4pr_0.setVisible(true);
                label_4pr_100.setVisible(true);
                slider4.setVisible(true);

                label_parametro_5.setVisible(true);
                label_5pr_0.setVisible(true);
                label_5pr_100.setVisible(true);
                slider5.setVisible(true);

                label_parametro_6.setVisible(false);
                label_parametro_7.setVisible(false);

                label_6pr_0.setVisible(false);
                label_7pr_0.setVisible(false);


                label_6pr_100.setVisible(false);
                label_7pr_100.setVisible(false);


                slider6.setVisible(false);
                slider7.setVisible(false);

                boton_convertir.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        label_destino_img.setVisible(true);
                    }
                });

            }
        });
        item_crearicono.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ruta_img_blanco_negro= "src/Convertir_Imagenes/img/Costa.ico";
                ImageIcon img_icon = new ImageIcon(ruta_img_blanco_negro);
                label_destino_img.setIcon(img_icon);
                label_destino_img.setVisible(false);

                label_parametro_1.setVisible(true);
                label_1pr_0.setVisible(true);
                label_1pr_100.setVisible(true);
                slider1.setVisible(true);

                label_2pr_100.setVisible(true);
                label_parametro_2.setVisible(true);
                label_2pr_0.setVisible(true);
                slider2.setVisible(true);

                label_parametro_3.setVisible(true);
                label_3pr_0.setVisible(true);
                label_3pr_100.setVisible(true);
                slider3.setVisible(true);

                label_parametro_4.setVisible(true);
                label_4pr_0.setVisible(true);
                label_4pr_100.setVisible(true);
                slider4.setVisible(true);

                label_parametro_5.setVisible(true);
                label_5pr_0.setVisible(true);
                label_5pr_100.setVisible(true);
                slider5.setVisible(true);

                label_parametro_6.setVisible(true);
                label_6pr_0.setVisible(true);
                label_6pr_100.setVisible(true);
                slider6.setVisible(true);

                label_parametro_7.setVisible(false);
                label_7pr_0.setVisible(false);
                label_7pr_100.setVisible(false);
                slider7.setVisible(false);

                boton_convertir.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        label_destino_img.setVisible(true);
                    }
                });

            }
        });
        item_bajaresolucion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ruta_img_blanco_negro= "src/Convertir_Imagenes/img/Costa_Baja_calidad.jpg";
                ImageIcon img_icon = new ImageIcon(ruta_img_blanco_negro);
                label_destino_img.setIcon(img_icon);
                label_destino_img.setVisible(false);

                label_parametro_1.setVisible(true);
                label_1pr_0.setVisible(true);
                label_1pr_100.setVisible(true);
                slider1.setVisible(true);

                label_2pr_100.setVisible(true);
                label_parametro_2.setVisible(true);
                label_2pr_0.setVisible(true);
                slider2.setVisible(true);

                label_parametro_3.setVisible(true);
                label_3pr_0.setVisible(true);
                label_3pr_100.setVisible(true);
                slider3.setVisible(true);

                label_parametro_4.setVisible(true);
                label_4pr_0.setVisible(true);
                label_4pr_100.setVisible(true);
                slider4.setVisible(true);

                label_parametro_5.setVisible(true);
                label_5pr_0.setVisible(true);
                label_5pr_100.setVisible(true);
                slider5.setVisible(true);

                label_parametro_6.setVisible(true);
                label_6pr_0.setVisible(true);
                label_6pr_100.setVisible(true);
                slider6.setVisible(true);

                label_parametro_7.setVisible(true);
                label_7pr_0.setVisible(true);
                label_7pr_100.setVisible(true);
                slider7.setVisible(true);

                boton_convertir.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        label_destino_img.setVisible(true);
                    }
                });

            }
        });



    }


    private void abrirImagen() {

        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            JOptionPane.showMessageDialog(null, "Imagen seleccionado: " + fileChooser.getSelectedFile().getAbsolutePath());
        }

        String path_img_origen=fileChooser.getSelectedFile().getPath();
        ImageIcon icon = new ImageIcon(path_img_origen);
        label_origen_img.setIcon(icon);


    }





    public static void main(String[] args) {
        JFrame frame = new JFrame("Editor_imagenes");
        frame.setContentPane(new Editor_imagenes().Mainpanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        frame.setVisible(true);
        frame.setBounds(0,  0,  800, 700);
    }

}
