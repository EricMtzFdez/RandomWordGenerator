package com.company.Vista.Modelos;

import javax.swing.*;
import java.awt.*;

public class ModeloComboBox extends JComboBox {

    @Override
    public void paint(Graphics g) {
        setForeground(Color.BLACK);
        this.setForeground(new Color(0x429ce2));
        UIManager.put( "ComboBox.disabledForeground", Color.BLACK );
        super.paint(g);
    }

}
