package org.example;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AñadirLibro {

    private static String BD= "Libro";
    private String CompruebaISBN = "SELECT ISBN FROM Libro WHERE ISBN='"+Libro.getISBN()+"'";
    private static String AñadirLibro = "INSERT INTO Libro VALUES ('"+Libro.getISBN()+"','"+Libro.getTitulo()+"','"+Libro.getAutor()+"',"+Libro.getNºPaginas()+")";


    public static void AñadirLibro(Libro Libro) {

        new ConexionBD(BD);
        Connection con = ConexionBD.getConexion(BD);

        try {
            Statement Statement = con.createStatement();

            boolean Res = BuscarLibro.VerificadorLibro(Libro);

            if (Res){
                System.out.println("El libro ya esta dentro de la base de datos.");
            }else{
                Statement.executeUpdate(AñadirLibro);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        ConexionBD.closeConexion();
    }
}
