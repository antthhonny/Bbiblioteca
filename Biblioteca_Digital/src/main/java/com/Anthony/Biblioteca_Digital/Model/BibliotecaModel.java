package com.Anthony.Biblioteca_Digital.Model;

public class BibliotecaModel {

    private String titulo_de_libro;
    private String Autor_del_libro;
    private  int año_de_publicacion;
    private String Genero_Literario;
    private String Cantidad_de_ejemplares_disponibles;

    public BibliotecaModel(String titulo_de_libro) {
        this.titulo_de_libro = titulo_de_libro;
    }

    public BibliotecaModel(String titulo_de_libro, String autor_del_libro, int año_de_publicacion, String genero_Literario, String cantidad_de_ejemplares_disponibles) {
        this.titulo_de_libro = titulo_de_libro;
        Autor_del_libro = autor_del_libro;
        this.año_de_publicacion = año_de_publicacion;
        Genero_Literario = genero_Literario;
        Cantidad_de_ejemplares_disponibles = cantidad_de_ejemplares_disponibles;
    }

    public String getTitulo_de_libro() {
        return titulo_de_libro;
    }

    public void setTitulo_de_libro(String titulo_de_libro) {
        this.titulo_de_libro = titulo_de_libro;
    }

    public String getAutor_del_libro() {
        return Autor_del_libro;
    }

    public void setAutor_del_libro(String autor_del_libro) {
        Autor_del_libro = autor_del_libro;
    }

    public int getAño_de_publicacion() {
        return año_de_publicacion;
    }

    public void setAño_de_publicacion(int año_de_publicacion) {
        this.año_de_publicacion = año_de_publicacion;
    }

    public String getGenero_Literario() {
        return Genero_Literario;
    }

    public void setGenero_Literario(String genero_Literario) {
        Genero_Literario = genero_Literario;
    }

    public String getCantidad_de_ejemplares_disponibles() {
        return Cantidad_de_ejemplares_disponibles;
    }

    public void setCantidad_de_ejemplares_disponibles(String cantidad_de_ejemplares_disponibles) {
        Cantidad_de_ejemplares_disponibles = cantidad_de_ejemplares_disponibles;
    }
}
