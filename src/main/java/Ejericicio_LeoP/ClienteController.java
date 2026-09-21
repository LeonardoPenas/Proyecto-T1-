/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejericicio_LeoP;
import java.util.ArrayList;

/**
 *
 * @author leore
 */
public class ClienteController 
{
  ArrayList<Cliente> lista_cliente = new ArrayList();
  
  void agregarCliente(Cliente nuevoCliente)
  {
      System.out.println("SE AGREGO CLIENTE");
      lista_cliente.add(nuevoCliente);
  }
  void listaCliente()
  {
      System.out.println("*****CLIENTES REGISTRADOS*****");
      
      Cliente actual;
      
      for (int i = 0; i < lista_cliente.size(); i++)
      {
         actual = lista_cliente.get(1);
         actual.verDatos();
      }
      
  }
 
}
