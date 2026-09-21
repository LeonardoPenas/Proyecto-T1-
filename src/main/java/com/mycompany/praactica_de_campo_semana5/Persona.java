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
    private int edad;
    private Direccion direccion;

    public Persona() {
    }

    public Persona(String Nombre, String Apellidos, String cod) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.cod = cod;
    }

    public Persona(String Nombre, String Apellidos, String cod, String dni, int edad) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.cod = cod;
        this.dni = dni;
        this.edad = edad;
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
    public void setCod(int cod) {
        this.cod = Integer.toString(cod);
    }

    public String getDni() {
        return dni;
    }

    public Boolean setDni(String dni) 
    {
        if(dni.length()==8)
        {
            this.dni= dni;
            return true;
        }else
        {
            System.out.println("ERROR, ingrese una cantidad valida ");
            return false;
        }
    }
    public Boolean setDni(int dni) 
    {
        return setDni(Integer.toString(dni));
    }
    public String getedad() {
        return cod;
    }

    public void setedad(int edad) 
    {
        if (edad >=0 && edad<100) 
        {
            this.edad=edad;
        }
        else
        {
            System.out.println("EDAD INVALIDA");
            return ;
        }
    }
    public Direccion getDireccion()
    {
        return direccion;
    }
    public void setDireccion(Direccion direccion)
    {
        this.direccion = direccion;
    }
    

    public void VerDatos()
    {
        System.out.println("Nombre: "+this.Nombre+" APELLIDO: "+this.Apellidos+ " CODIGO: "+this.cod+" DNI: "+this.dni+" EDAD: "+this.edad);
        System.out.println("");
        System.out.println("Direccion:");
        this.direccion.VerDireccion();
        System.out.println("");
    }  
    

}
