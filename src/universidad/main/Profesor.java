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
public class Profesor extends Persona{
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String nombre, String especialidad, int edad){       
        super(nombre, edad); 
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
        
    }

    public void AgregarC(Curso curso){
        cursos.add(curso);
    }
    

    public String getEspecialidad() {
        return especialidad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }


    
}
