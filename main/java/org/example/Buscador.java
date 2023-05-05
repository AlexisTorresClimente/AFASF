package org.example;

import javax.swing.*;
import java.awt.*;

public class Buscador extends JFrame {

    private JPanel panel;
    private String Buscar;

    JRadioButton radioButton1 = new JRadioButton("ISBN");
    JRadioButton radioButton2 = new JRadioButton("Autor");
    JRadioButton radioButton3 = new JRadioButton("Titulo");

    public Buscador () {
        setTitle("Buscador");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel = new JPanel(new FlowLayout());

        JTextField Text= new JTextField(20);

        JButton boton1 = new JButton("Buscar");
        JButton boton4 = new JButton("Salir");


        JLabel label = new JLabel("Seleccione una opción:");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);


        panel.add(label);
        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(radioButton3);

        radioButton1.setSelected(true);

        panel.add(Text);


        panel.add(boton1);
        panel.add(boton4);

        boton1.addActionListener(e -> {int Numero=botonizador(); Buscar=Text.getText(); MuestraLibro.MuestraLibro(Numero, Buscar);});

        boton4.addActionListener(e -> {new Menu();dispose();});

        getContentPane().add(panel);

        setVisible(true);
    }

    public int botonizador(){
        if(radioButton1.isSelected()){
            return 1;
        }
        if(radioButton2.isSelected()){
            return 2;
        }
        if(radioButton3.isSelected()){
            return 3;
        }
        return 1;
    }


    public static void main(String[] args) {
         new Añadidor();
    }
}