/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones_ejercicio02;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 *
 * @author Vane Proaño
 */
public class Excepciones_Ejercicio02 {

    /**
     * Definir una Clase que contenga algún tipo de dato de tipo array y agregue
     * el código para generar y capturar una excepción
     * ArrayIndexOutOfBoundsException (índice de arreglo fuera de rango).
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[] num = {1, 2, 3, 4, 5};

        System.out.println("Ingrese un numero entre 0 al 4");
        int respuesta = leer.nextInt();

        try {
            int indice = num[respuesta];

            System.out.println("el numero " + respuesta + " esta en la posicion " + indice);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("el numero " + respuesta + " esta fuera del rango");
        }

    }

}
