package com.jaim.bol20;

import com.jaim.clases.Libro;
import com.jaim.clases.Metodos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jaimg
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Libro> listaLibros = new ArrayList();
        Libro libro1 = new Libro("As", "Pablo", "p2l3", 9.99f, 15);
        listaLibros.add(libro1);
        Libro libro2 = new Libro("The best", "Jaime", "c9ñ4", 19.99f, 25);
        listaLibros.add(libro2);
        Libro libro3 = new Libro("Slam", "Pedro", "m0j7", 5.00f, 20);
        listaLibros.add(libro3);
        int opcion;
        Metodos obj = new Metodos();
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("   MENÚ:  \n1--> Añadir libro\n2--> Mostrar libros \n3-->Vender libros"
                    + "\n4-->Dar de baja los libros con 0 unidades\n5-->Consulta de libro \n6-->Salir"));
            switch (opcion) {
                case 1:
                    listaLibros.add(obj.crearLibro());
                    break;
                case 2:
                    obj.mostrar(listaLibros);
                    break;
                case 3:
                    obj.venderLibros(listaLibros);
                    break;
                case 4:
                    obj.darBaja(listaLibros);
                    break;
                case 5:
                    obj.consultarLibro(listaLibros);
                    break;
                case 6:
                    obj.salir();
            }

        } while (opcion < 6);

    }

}





