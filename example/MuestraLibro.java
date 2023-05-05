package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MuestraLibro {

    private static String Condicion;

    private static String BD= "Libro";
    private static String CompruebaISBN = "SELECT * FROM Libro WHERE ISBN='"+Condicion+"'";
    private static String CompruebaTitulo = "SELECT * FROM Libro WHERE Titulo='"+Condicion+"'";
    private static String CompruebaAutor = "SELECT * FROM Libro WHERE Autor='"+Condicion+"'";
    private static String Consulta;

    public static void MuestraLibro(int i,String Dato) {
        Scanner sc = new Scanner(System.in);
        Condicion="Dato";
        switch (i) {
            case 1:
                Consulta= CompruebaISBN;
                break;
            case 2:
                Consulta= CompruebaTitulo;
                break;
            case 3:
                Consulta= CompruebaAutor;
                break;
        }

        new ConexionBD(BD);
        Connection con = ConexionBD.getConexion(BD);

        try {
            Statement Statement = con.createStatement();

            ResultSet Resultado = Statement.executeQuery(Consulta);

            System.out.println(Resultado);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        ConexionBD.closeConexion();
    }
}

