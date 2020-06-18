package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class GeneradoresDeDatos {


    public ArrayList<String> GenerarNombreDesdeCero(int max, int min, int cantidad, ArrayList<String> vocales, ArrayList<String> consonantes) {

        String nombre = "";

        Random r = new Random();

        int caracteresMinimos = min;
        int caracteresMaximos = max;
        ArrayList<String> palabras = new ArrayList<>();

        if (vocales.size() == 0 || consonantes.size() == 0) {
            JOptionPane.showMessageDialog(null, "You must choose at least one vowel and a consonant for the algorithm to generate words.", "Warning", JOptionPane.WARNING_MESSAGE);
        }

        int caracterAleatorio;

        for (int a = 0; a < cantidad; a++) {

            int caracteresTotales = r.nextInt((caracteresMaximos + 1) - caracteresMinimos) + caracteresMinimos;


            int comienzoAleatorio = r.nextInt(10);
            comienzoAleatorio = comienzoAleatorio % 2;

            for (int i = 0; i < caracteresTotales; i++) {

                int par = i % 2;

                if (comienzoAleatorio == 0) {

                    if (par == 0) {
                        caracterAleatorio = r.nextInt(vocales.size());
                        nombre = nombre + vocales.get(caracterAleatorio);


                    } else {
                        caracterAleatorio = r.nextInt(consonantes.size());
                        nombre = nombre + consonantes.get(caracterAleatorio);
                    }

                } else {

                    if (par != 0) {
                        caracterAleatorio = r.nextInt(vocales.size());
                        nombre = nombre + vocales.get(caracterAleatorio);

                    } else {
                        caracterAleatorio = r.nextInt(consonantes.size());
                        nombre = nombre + consonantes.get(caracterAleatorio);
                    }

                }


            }

            nombre = nombre.substring(0, 1).toUpperCase() + nombre.substring(1);

            palabras.add(nombre);

            nombre = "";

        }

        return palabras;

    }
}
