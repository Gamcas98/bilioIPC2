/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import biblioteca.UI.*;
import java.io.File;

/**
 *
 * @author Gamcas
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {
        initComponents();
    }

    public static void initComponents() {

        
        
        File estudiante = new File("DB\\estudiantes");
        File prestamo = new File("DB\\prestamos");
        File libro = new File("DB\\libros");

        if (!estudiante.exists()) {
            estudiante.mkdir();
            new FormLecturaArchivo();
        }else{
            new FormPrincipal();
        }
        if (!prestamo.exists()) {
            prestamo.mkdir();
        }
        if (!libro.exists()) {
            libro.mkdir();
        }

        //Arranca un nuevo MainDesktop para poder trabajar
    }
}
