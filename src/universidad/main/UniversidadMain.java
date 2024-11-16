/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package universidad.main;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class UniversidadMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
       System.out.println("Ingrese el nombre del departamento");
       String dto = datos.nextLine();
       
       Departamento departamento = new Departamento(dto);
       
       System.out.println("Ingrese la cantidad de profesores a ingresar");
       int num= datos.nextInt();
       datos.nextLine();
       
       for(int i=0; i< num; i++){
            System.out.println("Ingrese el nombre del profesor "+(i+1));
            String profesor= datos.nextLine();
            
            System.out.println("Ingrese la especialidad del profesor "+(i+1));
            String especialidad= datos.nextLine();
            
            System.out.println("Ingrese la edad del profesor"+(i+1));
            int edad= datos.nextInt();
            datos.nextLine();
            
            Profesor profesordatos = new Profesor(profesor, especialidad, edad);
            
            departamento.Agregar(profesordatos);
       }
       
       System.out.println("Departamento: "+departamento.getNdepartamento());
       for(Profesor profesor: departamento.getProfesores()){
            System.out.println("Nombre del profesor: "+ profesor.getNombre() + ", Especialidad: "+profesor.getEspecialidad() + ", Edad: " + profesor.getEdad());
       }
       
        System.out.println("-----------------------------------------------------------------------------------");
        
        List<Estudiante> estudiantes = new ArrayList<>();
        
        
        System.out.println("Ingrese la cantidad de estudiantes:");
        int numE = datos.nextInt();
        datos.nextLine();
       
        for (int h = 0; h < numE; h++) {
            System.out.println("Ingrese el nombre del estudiante " + (h + 1) + ":");
            String nombreE = datos.nextLine();
            System.out.println("Ingrese la matrícula del estudiante " + (h + 1) + ":");
            int matriculaE = datos.nextInt();
            datos.nextLine();
            System.out.println("Ingrese la edad del estudiante" + (h + 1) + ":");
            int edadE = datos.nextInt();
            datos.nextLine();
            
            Estudiante estudiante = new Estudiante(nombreE, matriculaE, edadE);
            estudiantes.add(estudiante);
        }
        
        System.out.println("Ingrese la cantidad de cursos a ingresar");
        int num1= datos.nextInt();
        datos.nextLine();
       
        List<Curso> cursos = new ArrayList<>();

         for(int i=0; i< num1; i++){
            System.out.println("Ingrese el nombre del curso "+(i+1));
            String cursoN= datos.nextLine();          
            Curso curso = new Curso(cursoN);
                        
            
        System.out.println("Seleccione el profesor para el curso: " + cursoN );
        for (int j = 0; j < departamento.getProfesores().size(); j++) {
        System.out.println((j + 1) + ". " + departamento.getProfesores().get(j).getNombre() + " , " + departamento.getProfesores().get(j).getEspecialidad());
        }

            int seleccionProfesor = datos.nextInt();
            datos.nextLine();
    
            Profesor profesorSeleccionado = departamento.getProfesores().get(seleccionProfesor - 1); 
            curso.setProfesores(profesorSeleccionado);
            System.out.println("Curso: " + curso.getCurso());
            System.out.println("Profesor: " + curso.getProfesores().getNombre() + ", Especialidad: " + curso.getProfesores().getEspecialidad());           
            
            
             System.out.println("Seleccione los estudiantes para el curso: " + cursoN);
             for (int j = 0; j < estudiantes.size(); j++) {
                System.out.println((j + 1) + ". " + estudiantes.get(j).getNombre() + " - Matrícula: " + estudiantes.get(j).getNummatricula()+" - Edad: " + estudiantes.get(j).getEdad());
             }

            
            
            System.out.println("Ingrese los números de los estudiantes que quiere agregar, mayor a 1 ingresar separados por coma:");
            String seleccionEstudiantes = datos.nextLine();
            String[] indices = seleccionEstudiantes.split(",");
            for (String indice : indices) {
                int indiceEstudiante = Integer.parseInt(indice.trim()) - 1;
                if (indiceEstudiante >= 0 && indiceEstudiante < estudiantes.size()) {
                    curso.AgregarEs(estudiantes.get(indiceEstudiante));
                }
            }
         
            cursos.add(curso);
    }

        System.out.println("Cursos y sus estudiantes registrados:");
        for (Curso curso : cursos) {
            System.out.println("Curso: " + curso.getCurso());
            System.out.println("Estudiantes inscritos:");
            for (Estudiante estudiante : curso.getEstudiantes()) {
             System.out.println(estudiante);  
            }
            
        System.out.println("-----------------------------------------------------------------------------------");
        
        Biblioteca biblioteca = new Biblioteca();      
            
            while (true) {
                System.out.println("Seleccione una opción:");
                System.out.println("1. Agregar préstamo");
                System.out.println("2. Eliminar préstamo");
                System.out.println("3. Consultar préstamos");
                System.out.println("4. Salir");
                int o = datos.nextInt();
                datos.nextLine();
                switch (o) {
                    case 1 ->                         {
                            System.out.println("Ingrese el nombre del estudiante para agregar un préstamo:");
                            String nombreEstudiante = datos.nextLine();
                            
                            Estudiante estudiante = null;
                            
                            for (Estudiante e : estudiantes) {
                                if (e.getNombre().equalsIgnoreCase(nombreEstudiante)) {
                                    estudiante = e;
                                    
                                    break;
                                }
                            }           
                            
                            if (estudiante != null) {
                                
                                System.out.println("Ingrese el nombre del libro que quiere prestar:");
                                String libro = datos.nextLine();
                                biblioteca.agregarPrestamo(estudiante, libro);
                            } 
                            else {
                                
                                System.out.println("No se ha encontrado el restaurante");
                            }                                  }
                    case 2 -> {
                        
                            System.out.println("Ingrese el nombre del estudiante para eliminar un préstamo:");
                            String nombreEstudiante = datos.nextLine();
                            Estudiante estudiante = null;
                            
                            for (Estudiante e : estudiantes) {
                                if (e.getNombre().equalsIgnoreCase(nombreEstudiante)) 
                                {
                                    estudiante = e;
                                    break;
                                }
                            }           
                            if (estudiante != null) 
                            {
                                System.out.println("Ingrese el nombre del libro que quiere eliminar:");
                                String libro = datos.nextLine();
                                biblioteca.eliminarPrestamo(estudiante, libro);
                            } 
                            
                            else {
                                System.out.println("Estudiante no encontrado.");
                            }                                  
                            }
                    case 3 ->  {
                            System.out.println("Ingrese el nombre del estudiante a consultar:");
                            String nombreEstudiante = datos.nextLine();
                            Estudiante estudiante = null;
                            
                            for (Estudiante e : estudiantes) {
                                if (e.getNombre().equalsIgnoreCase(nombreEstudiante)) 
                                {
                                    estudiante = e;
                                    break;
                                }
                            }           
                            if (estudiante != null) {
                                biblioteca.consultarPrestamos(estudiante);
                            } 
                            else {
                                System.out.println("Estudiante no encontrado");
                            }                                  
                    }
                    case 4 -> { 
                        System.exit(0);
                    }
                    default -> System.out.println("vuelve a ingresar una opcion");
                }
            }
    }
}
}
       

       

       
       
               
        
    
        
         
    
    
    
    

