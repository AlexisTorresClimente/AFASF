package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BuscarLibro {

    private static String BD= "Libro";
    private static String CompruebaISBN = "SELECT ISBN FROM Libro WHERE ISBN='"+Libro.getISBN()+"'";


    public static boolean VerificadorLibro(Libro Libro) {

        new ConexionBD(BD);
        Connection con = ConexionBD.getConexion(BD);

        try {
            Statement Statement = con.createStatement();

            ResultSet ComprobacionISBN = Statement.executeQuery(CompruebaISBN);

            if (ComprobacionISBN.equals(Libro.getISBN())){
                ConexionBD.closeConexion();
                return true;
            }else{
                ConexionBD.closeConexion();
                return  false;
            }



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

