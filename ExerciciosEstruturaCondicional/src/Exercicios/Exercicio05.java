/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicios;

import java.util.Scanner;

/**
 *
 * @author jenny
 */
public class Exercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//        seguir, calcule e mostre o valor da conta a pagar.

          Scanner sc = new Scanner(System.in);
          
         int codigo = sc.nextInt();
         int quantidade = sc.nextInt();
         double total;
         
         if (codigo ==1){
             total = quantidade * 4.0;
         }
         else if ( codigo == 2){
             total = quantidade * 4.5;
         }
         else if (codigo == 3){
             total = quantidade * 5.0;
         }
         else if (codigo == 4) {
             total = quantidade * 2.0;
         }
         else {
             total = quantidade * 1.5;
         }
         
         System.out.println("Total: R$ " + total);
         
         sc.close();
    }
    
}
