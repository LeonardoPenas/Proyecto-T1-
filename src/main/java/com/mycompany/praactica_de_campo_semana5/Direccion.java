/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praactica_de_campo_semana5;

/**
 *
 * @author quant
 */
public class Direccion {
    private String calle;
    private String ciudad;
    private String distrito;

    public Direccion() {
    }

    public Direccion(String calle, String ciudad, String distrito) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.distrito = distrito;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public void VerDireccion() {
        System.out.println("Calle: " + calle);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Distrito: " + distrito);
    }
    
}
