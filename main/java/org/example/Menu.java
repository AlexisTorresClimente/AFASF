package org.example;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {

    private JPanel panel;

    public Menu() {
        setTitle("Menú de opciones");
        setSize(150, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel LB = new JLabel("Menu Biblioteca");


        JButton boton1 = new JButton("Añadir Libro");
        JButton boton2 = new JButton("Buscar Libro");
        JButton boton3 = new JButton("............");
        JButton boton4 = new JButton("Salir");

        boton1.setSize(50,50);
        boton2.setSize(50,50);
        boton3.setSize(50,50);
        boton4.setSize(50,50);

        boton3.setEnabled(false);
        panel.add(LB);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);

        boton1.addActionListener(e -> {new Añadidor();dispose();});
        boton2.addActionListener(e -> {new Buscador();dispose();});
        boton4.addActionListener(e -> {dispose();});

        getContentPane().add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
    }
}