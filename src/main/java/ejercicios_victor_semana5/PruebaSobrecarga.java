/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_victor_semana5;

/**
 *
 * @author victor
 */
public class PruebaSobrecarga {
     public static void main(String[] args) {

        Sobrecarga calculadora = new Sobrecarga();

        System.out.println("Suma de dos enteros: "
                + calculadora.sumar(5, 3));

        System.out.println("Suma de dos decimales: "
                + calculadora.sumar(5.5, 3.2));

        System.out.println("Suma de tres enteros: "
                + calculadora.sumar(5, 3, 2));

    }
}
