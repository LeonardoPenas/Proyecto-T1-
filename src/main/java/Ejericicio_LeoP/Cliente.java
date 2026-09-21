/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejericicio_LeoP;

/**
 *
 * @author leore
 */



public class Cliente 
{
    
   private String código;
   private String nombre;
   private String dni;
   private String telefono;
   private String correo;
   private double saldo;
   
   public Cliente()
   {
   
   }
   
   public Cliente(String código, String nombre, String dni)
   {
        this.código = código;
        this.nombre = nombre;
        this.dni = dni;
   
   }
           
   public Cliente(String código, String nombre, String dni,String telefono,String correo, double saldo)
   {
   this.código = código;
   this.nombre = nombre;
   this.dni = dni;
   this.telefono = telefono;
   this.correo = correo;
   this.saldo = saldo;
   
   }

   public String getCodigo() {
        return código;
    }

    public void setCodigo(String codigo) {
        this.código = codigo;
    }

    public void setCodigo(int codigo) {
        this.código = Integer.toString(codigo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getDni() {
        return dni;
    }

    public boolean setDni(String dni) {
        if (dni.length() == 8) {
            this.dni = dni;
            return true;
        } else {
            System.out.println("ERROR, DNI INVALIDO");
            return false;
        }
    }

    public boolean setDni(int dni) {
        return setDni(Integer.toString(dni));
    }

    public String getTelefono() {
        return telefono;
    }

    public boolean setTelefono(String telefono) {
        if (telefono.length() == 9) {
            this.telefono = telefono;
            return true;
        } else {
            System.out.println("ERROR, TELEFONO INVALIDO");
            return false;
        }
    }

   
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

   
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("SALDO INVALIDO");
        }
    }

 
    public void verDatos() {
        System.out.println(
                "CODIGO: " + this.código +
                " | NOMBRE: " + this.nombre +
                " | DNI: " + this.dni +
                " | TELEFONO: " + this.telefono +
                " | CORREO: " + this.correo +
                " | SALDO: S/ " + this.saldo
        );

        System.out.println("");
        
        
    }
   
    
}
