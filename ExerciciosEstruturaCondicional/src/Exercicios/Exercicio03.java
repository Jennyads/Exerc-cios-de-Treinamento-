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
public class Exercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//        Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//        ordem crescente ou decrescente.

         Scanner sc = new Scanner(System.in);
         
         int valorA = sc.nextInt();
         int valorB = sc.nextInt();
         
         if (valorA % valorB == 0 || valorB % valorA ==0){
             System.out.println("São Multiplos");
         }
         else{ 
             System.out.println("Não são Multiplos");
         }
         sc.close();
    }
    
}
