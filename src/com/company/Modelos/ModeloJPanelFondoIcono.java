package com.company.Modelos;

import com.company.Utilidades;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ModeloJPanelFondoIcono extends javax.swing.JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        Color color1 = new Color(0x0072ff);
        Color color2 = new Color(0x6166f1);
        GradientPaint gp = new GradientPaint(0, 0, color1, 45, h, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);


        //IMAGEN DE FONDO

        try {
            BufferedImage img = ImageIO.read(ModeloJPanelFondoIcono.class.getResource("/Iconos/Fondos/MundoAzul.png"));

            Utilidades utilidades = new Utilidades();
            //img = utilidades.getScaledImage(img,  700, 700);

            int iWidth2 = img.getWidth(this)/2;
            int iHeight2 = img.getHeight(this)/2;

            int x = this.getParent().getWidth()/2 - iWidth2;
            int y = this.getParent().getHeight()/2 - iHeight2;



            g.drawImage(img, x, y, this);

        } catch (IOException e) {
            e.printStackTrace();
        }


        /*
        ImageIcon icon = new ImageIcon(new ImageIcon("Iconos\\Fondos\\MundoAzul.png").getImage().getScaledInstance(this.getParent().getHeight() - 400, this.getParent().getHeight() - 400, Image.SCALE_DEFAULT));

        BufferedImage img = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_RGB);

        int iWidth2 = img.getWidth(this)/2;
        int iHeight2 = img.getHeight(this)/2;

        int x = this.getParent().getWidth()/2 - iWidth2;
        int y = this.getParent().getHeight()/2 - iHeight2;

        g.drawImage(icon.getImage(), x, y, this);

         */

    }
}
