/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praactica_de_campo_semana5;



import java.util.ArrayList;

/**
 */
public class PersonaController {
    ArrayList<Persona> lista_persona= new ArrayList<>();

 * @author leoch
 */
public class PersonaController 
{
    ArrayList<Persona> lista_persona= new ArrayList();

    void agregar_persona(Persona nuevaPersona)
    {
        System.out.println("SE AGREGO PERSONA");
        lista_persona.add(nuevaPersona);
    }
    
    void lista_persona()
    {
        System.out.println("*******PERSONAS REGISTRADAS*******");
        Persona  actual;
        for (int i = 0; i < lista_persona.size(); i++) {
            actual=lista_persona.get(i);
            actual.VerDatos();
        }
    }

}
