/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejericicio_LeoP;

import java.util.Scanner;

/**
 *
 * @author leore
 */
public class Principal 
{
    
 public static void main(String[] args) 
 {
    Scanner sc = new Scanner(System.in);
        String rpta = "s";

        ClienteController controla = new ClienteController();

        System.out.println("***** REGISTRO DE CLIENTES *****");

        while (rpta.equals("s"))
        {
            try 
            {
                Cliente c = new Cliente();

                System.out.println("INGRESE CÓDIGO DEL CLIENTE: ");
                String cod = sc.nextLine();
                c.setCodigo(cod);

                System.out.println("INGRESE NOMBRE DEL CLIENTE: ");
                String nom = sc.nextLine();
                c.setNombre(nom);

                System.out.println("INGRESE DNI: ");
                String dni = sc.nextLine();
                c.setDni(dni);

                System.out.println("INGRESE TELÉFONO: ");
                String telefono = sc.nextLine();
                c.setTelefono(telefono);

                System.out.println("INGRESE CORREO: ");
                String correo = sc.nextLine();
                c.setCorreo(correo);

                try 
                {
                    System.out.println("INGRESE SALDO: ");
                    double saldo = Double.parseDouble(sc.nextLine());
                    c.setSaldo(saldo);

                } catch (NumberFormatException e) {
                    System.out.println(
                        "ERROR: el saldo debe ser un número"
                    );
                }

                controla.agregarCliente(c);

            } catch (IllegalArgumentException e) {

                System.out.println("ERROR: " + e.getMessage());
                System.out.println("El cliente NO fue registrado");
            }

            System.out.println("¿DESEA AÑADIR MÁS CLIENTES? (s/n)");
            rpta = sc.nextLine();
        }

        controla.listaCliente();
    }         
    
 }  
 

