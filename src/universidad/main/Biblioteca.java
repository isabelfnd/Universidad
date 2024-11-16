/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidad.main;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PERSONAL
 */
public class Biblioteca { 
    private List<String> prestamos;

    public Biblioteca() {
        this.prestamos = new ArrayList<>();
    }

   
    public void agregarPrestamo(Estudiante estudiante, String libro) {
        String prestamo = "Estudiante: " + estudiante.getNombre() + " ha prestado el libro: " + libro;
        prestamos.add(prestamo);
        System.out.println("Préstamo agregado: " + prestamo);
    }

    // Método para eliminar un préstamo
    public void eliminarPrestamo(Estudiante estudiante, String libro) {
        String prestamoEliminar = "Estudiante: " + estudiante.getNombre() + " ha prestado el libro: " + libro;
        if (prestamos.contains(prestamoEliminar)) {
            prestamos.remove(prestamoEliminar);
            System.out.println("Préstamo eliminado: " + prestamoEliminar);
        } else {
            System.out.println("No se encontró el préstamo especificado.");
        }
    }

    // Consultar los préstamos
    public void consultarPrestamos(Estudiante estudiante) {
        System.out.println("Consultando los préstamos de: " + estudiante.getNombre());
        for (String prestamo : prestamos) {
            if (prestamo.contains(estudiante.getNombre())) {
                System.out.println(prestamo);
            }
        }
    }
}

   
