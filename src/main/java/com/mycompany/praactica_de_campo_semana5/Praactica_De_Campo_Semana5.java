/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praactica_de_campo_semana5;

/**
 *
 * @author leore
 */
public class Praactica_De_Campo_Semana5 {

    public static void main(String[] args) 
    {
        System.out.println("*****RESGISTRO DE PERSONAS*****");
        Persona p = new Persona();
        p.VerDatos();
        
        Persona p1= new Persona("Leonardo","Chavez","12121212");
        p1.VerDatos();

        Persona p2 =new  Persona("Fabiana","Valencia","90901912","90909090");
        p2.VerDatos();



        
    }
}
