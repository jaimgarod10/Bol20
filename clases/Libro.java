package com.jaim.clases;

/**
 *
 * @author jaimg
 */
public class Libro {

    String titulo;
    String autor;
    String ISBN;
    float precio;
    int numUnidades;

    public Libro(String titulo, String autor, String ISBN, float precio, int numUnidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.precio = precio;
        this.numUnidades = numUnidades;
    }

    public Libro() {
    }

    @Override
    public String toString() {
        return "El titulo del libro es: " + titulo + ", su autor:  " + autor + ", con ISBN = " + ISBN + ", el precio del libro es de: " + precio + " y el numUnidades que hay del libro es de: " + numUnidades + "\n";
    }

    public int compareTo(Object o) {
        Libro libro = (Libro) o;
        if (this.titulo.compareToIgnoreCase(libro.titulo) == 0) {
            return 0;
        } else if (this.titulo.compareToIgnoreCase(libro.titulo) > 0) {
            return 1;
        } else {
            return -1;
        }

    }

}



