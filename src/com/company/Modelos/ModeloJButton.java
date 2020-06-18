package com.company.Vista.Modelos;

import javax.swing.*;
import java.awt.*;

public class ModeloJButton extends JButton {

    public ModeloJButton() {
        super("text");
        setContentAreaFilled(false);
        this.setForeground(new Color(0xffffff));
    }

    @Override
    protected void paintComponent(Graphics g){


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

        this.setFocusable(false);

        super.paintComponent(g);

        /*
        https://stackoverflow.com/questions/7115672/change-jbutton-gradient-color-but-only-for-one-button-not-all
        Graphics2D g2 = (Graphics2D)g.create();
        g2.setPaint(new GradientPaint(new Point(0, 0), getBackground(), new Point(0, getHeight()/3), Color.WHITE));
        g2.fillRect(0, 0, getWidth(), getHeight()/3);
        g2.setPaint(new GradientPaint(new Point(0, getHeight()/3), Color.WHITE, new Point(0, getHeight()), getBackground()));
        g2.fillRect(0, getHeight()/3, getWidth(), getHeight());
        g2.dispose();
        super.paintComponent(g);
         */
    }
}
