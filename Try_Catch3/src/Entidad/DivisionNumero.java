/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Vane Proaño
 */
public class DivisionNumero {
    private String num1;
    private String num2;
    private double numero1;
    private double numero2;
    private String numero3;
    private double resultado;
    
    Scanner leer = new Scanner (System.in);
    

    public DivisionNumero() {
    }


    
  public void crearNumeros(){
      System.out.println("Ingrese un numero");
      num1 = leer.next();
      System.out.println("Ingrese otro numero");
      num2 = leer.next();
      
  }  
  
  public void numeroRaro() throws InputMismatchException{
      System.out.println("numero raro");
      numero3 = leer.next();
      if (numero3.matches("[0-9]+")) {
      }else{
          throw new InputMismatchException("debe ingresar un numero");
      }
      
      
  }
  
  public void comprobarNumeros() throws NumberFormatException {
      
          if (num1.matches("[0-9]+") && num2.matches("[0-9]+")) {
          numero1 = Integer.parseInt(num1);
          numero2 = Integer.parseInt(num2);
          }else{
              
       
          throw new NumberFormatException("No se puede ingresar letras");
      }
     
      }
  
  public void dividirNumeros() throws ArithmeticException{
      if (numero2 ==0 ) {
          
          throw new ArithmeticException("no se puede dividir para cero");
          
      }else{
          resultado= numero1/numero2;
          System.out.println("resultado es: " + String.format("%.2f", resultado));
      }
  }
  }
    

