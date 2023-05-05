package org.example;

import javax.swing.*;
import java.awt.*;

public class Añadidor extends JFrame {

    private JPanel panel;

    public Añadidor() {
        // Configuración de la ventana
        setTitle("Buscador");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
        JLabel LBISBN = new JLabel("ISBN");
        JTextField TISBN = new JTextField();
        JLabel LBTitulo = new JLabel("Titulo");
        JTextField TTitulo = new JTextField();
        JLabel LBAutor = new JLabel("Autor");
        JTextField TAutor = new JTextField();
        JLabel LBPaginas = new JLabel("Paginas");
        JTextField TPaginas = new JTextField();
        JButton boton1 = new JButton("Añadir");
        JButton boton4 = new JButton("Salir");

        panel.add(LBISBN);
        panel.add(TISBN);
        panel.add(LBTitulo);
        panel.add(TTitulo);
        panel.add(LBAutor);
        panel.add(TAutor);
        panel.add(LBPaginas);
        panel.add(TPaginas);



        boton1.addActionListener(e -> {
            Libro Libro = new Libro(TISBN.getText(),TTitulo.getText(),TAutor.getText(),Integer.valueOf(TPaginas.getText()));
            new Menu();
            dispose();
            AñadirLibro.AñadirLibro(Libro);
        });
        boton4.addActionListener(e -> {new Menu();dispose();});

        panel.add(boton1);
        panel.add(boton4);

        getContentPane().add(panel);

        setVisible(true);
    }


    public static void main(String[] args) {
        new Añadidor();
    }
}