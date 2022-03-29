/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author jenny
 */
public class Exercicio13 {
    public static void main(String[] args) {
        int codigo1 = 13;
        int numero1 = 2;
        double unitario1 = 15.30;
        
        int codigo2 = 161;
        int numero2 = 4;
        double unitario2 = 5.20;
        
        double total = (numero1 * unitario1) + (numero2 * unitario2) ;
        
        System.out.printf("Valor a Pagar: R$ %.2f ", total);
    }
    
}
