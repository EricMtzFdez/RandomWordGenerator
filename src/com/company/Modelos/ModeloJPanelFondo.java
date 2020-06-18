package com.company.Modelos;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ModeloJPanelFondo extends JPanel {

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

    }
}
