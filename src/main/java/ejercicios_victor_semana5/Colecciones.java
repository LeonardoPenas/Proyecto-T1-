/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_victor_semana5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author victor
 */
public class Colecciones {
    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {
            ArrayList<String> estudiantes = new ArrayList<>();
            
            estudiantes.add("Ana");
            estudiantes.add("Carlos");
            estudiantes.add("Pedro");
            estudiantes.add("Maria");
            
            System.out.println("Estudiantes registrados:");
            
            for (String estudiante : estudiantes) {
                
                System.out.println(estudiante);
                
            }
            
            System.out.print("\nIngrese otro estudiante: ");
            
            String nuevoEstudiante = teclado.nextLine();
            
            estudiantes.add(nuevoEstudiante);
            
            System.out.println("\nLista actualizada:");
            
            for (String estudiante : estudiantes) {
                
                System.out.println(estudiante);
                
            }
            
            System.out.println("\nCantidad de estudiantes: "
                    + estudiantes.size());
        }

    }

}
