package com.company.Vista.Modelos;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ModeloJMenuBar extends JMenuBar {

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        Color color1 = new Color(0x1b3894);
        Color color2 = new Color(0x1b1999);
        GradientPaint gp = new GradientPaint(0, 0, color1, 0, h, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);

        //this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

    }


}
