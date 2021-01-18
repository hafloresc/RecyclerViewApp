package com.rbtechnology3.recyclerviewapp;

public class elementos {
    private String titulo;
    private String descripcion;
    private int foto;

    public elementos(){

    }
    public elementos(String titulo, String descripcion, int foto) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.foto = foto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
