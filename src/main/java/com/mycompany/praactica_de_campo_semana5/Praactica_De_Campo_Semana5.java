
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praactica_de_campo_semana5;

import java.util.Scanner;

/**
 *
 * @author leore
 */
public class Praactica_De_Campo_Semana5 {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String rpta="s";
        PersonaController controla = new  PersonaController();
        System.out.println("*****RESGISTRO DE PERSONAS*****");


        while (rpta.equals("s"))
        {
            
            try 
            {
             Persona p = new  Persona();
            System.out.println("INGRESE NOMBRE DE PERSONA: ");
            String nom = sc.nextLine();
            p.setNombre(nom);

            System.out.println("INGRESE APELLIDO: ");
            String Ap = sc.nextLine();
            p.setApellidos(Ap);

            System.out.println("INRGESE CÓDIGO: ");
            String cod=sc.nextLine();
            p.setCod(cod);
            
            System.out.println("INGRESE DNI: ");
            String dni =sc.nextLine();
            p.setDni(dni);

            try 
            {
                System.out.println("INGRESE EDAD: ");
                int edad = Integer.parseInt(sc.nextLine());
                p.setedad(edad);   
            } catch (NumberFormatException e) {
                System.out.println("ERROR: la edad debe ser un numero entero");
            }

            System.out.println("Direccion");
            System.out.println("Ingrese calle");
            String calle = sc.nextLine();
            System.out.println("Ingrese ciudad");
            String ciudad = sc.nextLine();
            System.out.println("Ingrese distrito");
            String distrito = sc.nextLine();
            Direccion d = new Direccion(calle,ciudad,distrito);
            p.setDireccion(d);
            controla.agregar_persona(p);
              

           
              

            } catch (IllegalArgumentException e) {
                System.out.println("ERROR: " + e.getMessage());
                System.out.println("La persona NO fue registrada");
            }
            System.out.println("DESEA AÑADIR MÁS TRABAJADORES?");
            rpta=sc.nextLine();

            
        }
        controla.lista_persona();


    }
}
