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
public class Departamento {
    private String Ndepartamento;
    private List<Profesor> Profesores;

    public Departamento(String Ndepartamento) {
        this.Ndepartamento = Ndepartamento;
        this.Profesores = new ArrayList<>();
    }
    
    public void Agregar(Profesor profesor){
        Profesores.add(profesor);
    }
    
    public void Eliminar(Profesor profesor){
        Profesores.remove(profesor);
    }

    public String getNdepartamento() {
        return Ndepartamento;
    }

    public List<Profesor> getProfesores() {
        return Profesores;
    }

    public void setProfesores(List<Profesor> Profesores) {
        this.Profesores = Profesores;
    }
    
    
    
}
