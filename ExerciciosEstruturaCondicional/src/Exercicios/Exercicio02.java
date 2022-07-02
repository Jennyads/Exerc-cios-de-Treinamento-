/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jenny
 */
public class Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar

          Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);

         int numero = sc.nextInt();
         
         if (numero %2 == 0 ) {
             System.out.println("Par");
         }
         
         else{
             System.out.println("ímpar");
         }
         sc.close();
    }
    
}
