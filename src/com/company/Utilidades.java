package com.company;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Date;
import java.util.Properties;

public class Utilidades {

    //Función para cambiar el tamaño de la imágen. / Fuction to change the image size.
    public BufferedImage getScaledImage(BufferedImage src, int w, int h){
        //https://stackoverflow.com/questions/16497853/scale-a-bufferedimage-the-fastest-and-easiest-way
        int finalw = w;
        int finalh = h;
        double factor = 1.0d;
        if(src.getWidth() > src.getHeight()){
            factor = ((double)src.getHeight()/(double)src.getWidth());
            finalh = (int)(finalw * factor);
        }else{
            factor = ((double)src.getWidth()/(double)src.getHeight());
            finalw = (int)(finalh * factor);
        }

        BufferedImage resizedImg = new BufferedImage(finalw, finalh, BufferedImage.TRANSLUCENT);
        Graphics2D g2 = resizedImg.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(src, 0, 0, finalw, finalh, null);
        g2.dispose();
        return resizedImg;
    }

}
