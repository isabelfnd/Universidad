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
public class Curso {
    private String curso;
    private List<Estudiante> estudiantes;
     private Profesor Profesores;

    public Curso(String curso) {
        this.curso = curso;
        this.estudiantes = new ArrayList<>();
        this.Profesores = null;
       
    }

    public Profesor getProfesores() {
        return Profesores;
    }

    public void setProfesores(Profesor Profesores) {
        this.Profesores = Profesores;
        if (!Profesores.getCursos().contains(this)) {
            Profesores.AgregarC(this); 
    }
    }
    
    
    public void AgregarEs(Estudiante estudiante){
        estudiantes.add(estudiante);
    }
    

    public String getCurso() {
        return curso;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

   
    
    
    
    
    
}
