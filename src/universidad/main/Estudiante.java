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
public class Estudiante extends Persona{
    private int nummatricula;
    private Biblioteca biblioteca;
   

    public Estudiante(String nombre, int nummatricula, int edad) {
        super(nombre, edad);        
        this.nummatricula = nummatricula;
        this.biblioteca = biblioteca;        
        

    }

    public int getNummatricula(){
        return nummatricula;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Matrícula: " + nummatricula + ", Edad: " + edad;
    }
   
    
}
