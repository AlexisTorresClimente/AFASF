package org.example;

public class Libro {

    private static String ISBN;
    private static String Titulo;
    private static String Autor;
    private static int NºPaginas;

    public Libro(String ISBN, String Titulo, String Autor, int NºPaginas){
       this.ISBN = ISBN;
       this.Titulo = Titulo;
       this.Autor = Autor;
       this.NºPaginas = NºPaginas;
    }

    public static String getISBN() {
        return ISBN;
    }

    public static String getTitulo() {
        return Titulo;
    }

    public static String getAutor() {
        return Autor;
    }

    public static int getNºPaginas() {
        return NºPaginas;
    }
}
