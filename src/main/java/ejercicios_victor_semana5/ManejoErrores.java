/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios_victor_semana5;

import java.util.Scanner;

/**
 *
 * @author victor
 */
public class ManejoErrores {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {

            System.out.print("Ingrese el primer número: ");
            int numero1 = teclado.nextInt();

            System.out.print("Ingrese el segundo número: ");
            int numero2 = teclado.nextInt();

            int resultado = numero1 / numero2;

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {

            System.out.println("Error: no se puede dividir entre cero.");

        } catch (Exception e) {

            System.out.println("Error: debe ingresar números válidos.");

        } finally {

            teclado.close();

        }

    }
}
