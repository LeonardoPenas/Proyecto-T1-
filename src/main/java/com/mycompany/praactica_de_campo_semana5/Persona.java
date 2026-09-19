/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praactica_de_campo_semana5;

/**
 *
 * @author leoch
 */
public class Persona 
{
    private String Nombre;
    private String Apellidos;
    private String cod;
    private String dni;

    public Persona() {
    }

    public Persona(String Nombre, String Apellidos, String cod) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.cod = cod;
    }

    public Persona(String Nombre, String Apellidos, String cod, String dni) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.cod = cod;
        this.dni = dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
    
    
}
