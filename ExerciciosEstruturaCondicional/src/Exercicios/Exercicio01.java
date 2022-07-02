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
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
//        Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
         Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);

         int numero = sc.nextInt();
         
         if (numero < 0) {
             System.out.println("Negativo" );
         }
         else {
             System.out.println("Não negativo" );
         }
         sc.close();
    }
    
}
