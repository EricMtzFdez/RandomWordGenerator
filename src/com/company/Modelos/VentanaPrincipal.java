package com.company.Modelos;

import com.company.GeneradoresDeDatos;
import com.company.Utilidades;
import com.company.Vista.Modelos.ModeloJButton;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VentanaPrincipal {

    private JPanel PanelVentanaPrincipal;
    private JPanel PanelConfiguracion;
    private JPanel PanelResultados;
    private JTextPane TextResultado;
    private JSpinner SpinnerMin;
    private JSpinner SpinnerMax;
    private JSpinner SpinnerWords;
    private JButton ButtonGenerar;
    private JButton ButtonPatreon;
    private JLabel LabelPatreon;
    private JCheckBox CheckAlfabeticamente;
    private JCheckBox CheckA;
    private JCheckBox CheckB;
    private JCheckBox CheckC;
    private JCheckBox CheckD;
    private JCheckBox CheckE;
    private JCheckBox CheckF;
    private JCheckBox CheckG;
    private JCheckBox CheckH;
    private JCheckBox CheckI;
    private JCheckBox CheckJ;
    private JCheckBox CheckK;
    private JCheckBox CheckL;
    private JCheckBox CheckM;
    private JCheckBox CheckN;
    private JCheckBox CheckO;
    private JCheckBox CheckP;
    private JCheckBox CheckQ;
    private JCheckBox CheckR;
    private JCheckBox CheckS;
    private JCheckBox CheckT;
    private JCheckBox CheckU;
    private JCheckBox CheckV;
    private JCheckBox CheckW;
    private JCheckBox CheckX;
    private JCheckBox CheckY;
    private JCheckBox CheckZ;
    JFrame frame;

    public VentanaPrincipal() {
        frame = new JFrame("2.0.0 Random words generator");
        frame.setSize(1280, 720);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setContentPane(PanelVentanaPrincipal);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);

        Utilidades utilidades = new Utilidades();

        //Valores por defecto/default values
        SpinnerMax.setValue(8);
        SpinnerMin.setValue(4);
        SpinnerWords.setValue(100);
        LabelPatreon.setText("If it has been useful for you and you want more applications for worldbuilding, i would appreciate it if you would follow me on Patreon.");


        CheckAlfabeticamente.setSelected(true);
        CheckA.setSelected(true);
        CheckB.setSelected(true);
        CheckC.setSelected(true);
        CheckD.setSelected(true);
        CheckE.setSelected(true);
        CheckF.setSelected(true);
        CheckG.setSelected(true);
        CheckH.setSelected(true);
        CheckI.setSelected(true);
        CheckJ.setSelected(true);
        CheckK.setSelected(true);
        CheckL.setSelected(true);
        CheckM.setSelected(true);
        CheckN.setSelected(true);
        CheckO.setSelected(true);
        CheckP.setSelected(true);
        CheckQ.setSelected(true);
        CheckR.setSelected(true);
        CheckS.setSelected(true);
        CheckT.setSelected(true);
        CheckU.setSelected(true);
        CheckV.setSelected(true);
        CheckW.setSelected(true);
        CheckX.setSelected(true);
        CheckY.setSelected(true);
        CheckZ.setSelected(true);

        //Busqueda de los iconos / Icons search
        try {
            BufferedImage imgPatreon = ImageIO.read(VentanaPrincipal.class.getResource("/Patreon.png"));
            BufferedImage img16 = ImageIO.read(VentanaPrincipal.class.getResource("/Logo16x16.png"));
            BufferedImage img32 = ImageIO.read(VentanaPrincipal.class.getResource("/Logo32x32.png"));

            imgPatreon = utilidades.getScaledImage(imgPatreon, 50, 50);

            ButtonPatreon.setIcon(new ImageIcon(imgPatreon));

            List<Image> icons = new ArrayList<Image>();

            icons.add(new ImageIcon(img16).getImage());
            icons.add(new ImageIcon(img32).getImage());
            frame.setIconImages(icons);

        } catch (IOException e) {
            e.printStackTrace();
        }

        //Diseño gráfico / Graphic design
        ButtonPatreon.setFont(new Font("arial", Font.BOLD, 22));
        ButtonPatreon.setForeground(new Color(0xffffff));
        ButtonPatreon.setOpaque(false);
        ButtonPatreon.setContentAreaFilled(false);
        //ButtonPatreon.setBorderPainted(false);
        ButtonPatreon.setFocusable(false);
        ButtonPatreon.setVerticalTextPosition(SwingConstants.BOTTOM);
        ButtonPatreon.setHorizontalTextPosition(SwingConstants.CENTER);

        //Action listeners
        ButtonGenerar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> palabras = new ArrayList<>();
                ArrayList<String> vocales = new ArrayList<>();
                ArrayList<String> consonantes = new ArrayList<>();

                int maximo = (Integer) SpinnerMax.getValue();
                int minimo = (Integer) SpinnerMin.getValue();
                int numPalabras = (Integer) SpinnerWords.getValue();

                GeneradoresDeDatos generadoresDeDatos = new GeneradoresDeDatos();

                if (CheckA.isSelected()) {
                    vocales.add("a");
                }

                if (CheckE.isSelected()) {
                    vocales.add("e");
                }

                if (CheckI.isSelected()) {
                    vocales.add("i");
                }

                if (CheckO.isSelected()) {
                    vocales.add("o");
                }

                if (CheckU.isSelected()) {
                    vocales.add("u");
                }

                if (CheckB.isSelected()) {
                    consonantes.add("b");
                }

                if (CheckC.isSelected()) {
                    consonantes.add("c");
                }

                if (CheckD.isSelected()) {
                    consonantes.add("d");
                }

                if (CheckF.isSelected()) {
                    consonantes.add("f");
                }

                if (CheckG.isSelected()) {
                    consonantes.add("g");
                }

                if (CheckH.isSelected()) {
                    consonantes.add("h");
                }

                if (CheckJ.isSelected()) {
                    consonantes.add("j");
                }

                if (CheckK.isSelected()) {
                    consonantes.add("k");
                }

                if (CheckL.isSelected()) {
                    consonantes.add("l");
                }

                if (CheckM.isSelected()) {
                    consonantes.add("m");
                }

                if (CheckN.isSelected()) {
                    consonantes.add("n");
                }

                if (CheckP.isSelected()) {
                    consonantes.add("p");
                }

                if (CheckQ.isSelected()) {
                    consonantes.add("q");
                }

                if (CheckR.isSelected()) {
                    consonantes.add("r");
                }

                if (CheckS.isSelected()) {
                    consonantes.add("s");
                }

                if (CheckT.isSelected()) {
                    consonantes.add("t");
                }

                if (CheckV.isSelected()) {
                    consonantes.add("v");
                }

                if (CheckW.isSelected()) {
                    consonantes.add("w");
                }

                if (CheckX.isSelected()) {
                    consonantes.add("x");
                }

                if (CheckY.isSelected()) {
                    consonantes.add("y");
                }

                if (CheckZ.isSelected()) {
                    consonantes.add("z");
                }


                if (minimo > maximo) {
                    TextResultado.setText("The minimum value must be less than the maximum.");
                } else {
                    palabras = generadoresDeDatos.GenerarNombreDesdeCero(maximo, minimo, numPalabras, vocales, consonantes);
                }

                String resultado = "";

                if (CheckAlfabeticamente.isSelected()) {
                    Collections.sort(palabras, String.CASE_INSENSITIVE_ORDER);
                }

                for (int i = 0; i < palabras.size(); i++) {

                    if (i == 0) {
                        resultado = palabras.get(i);
                    } else {
                        resultado = resultado + ", " + palabras.get(i);
                    }
                }

                TextResultado.setText(resultado);

            }
        });


        ButtonPatreon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URL("https://www.patreon.com/WorldBuildingAssistant").toURI());
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        });
    }

    private void createUIComponents() {
        //Algunos componentes utilizan modelos personalizados / Some components use custom models.
        PanelVentanaPrincipal = new ModeloJPanelFondo();
        ButtonGenerar = new ModeloJButton();
    }
}
