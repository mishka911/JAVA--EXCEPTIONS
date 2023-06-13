/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import java.util.InputMismatchException;
import java.util.Scanner;
import Entidad.DivisionNumero;

/**
 *
 * @author Vane Proaño
 */
public class Main {

    /**
     * Defina una clase llamada DivisionNumero.En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
* 
* Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones
* 
     * @param args
     */
    public static void main(String[] args) {
        DivisionNumero dv = new DivisionNumero();
        
        try {
            dv.numeroRaro();
            dv.crearNumeros();
            dv.comprobarNumeros();
            dv.dividirNumeros();
        } catch (InputMismatchException| NumberFormatException| ArithmeticException e) {
            
            System.out.println(e.getMessage());
        }
    }
    
    
    
}
