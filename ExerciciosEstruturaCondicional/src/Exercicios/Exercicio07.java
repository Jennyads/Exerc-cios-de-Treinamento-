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
public class Exercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
//de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
//ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
//Se o ponto estiver na origem, escreva a mensagem “Origem”.
//Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
//situação.

                    Locale.setDefault(Locale.US);
                    
                    Scanner sc = new Scanner(System.in);

                    double x = sc.nextDouble();
                    double y = sc.nextDouble();
                    
                    if ( x== 0.0 && y== 0.0) {
                        System.out.println("Origem");
                    }
                    else  if ( x == 0.0) {
                        System.out.println("Eixo Y");
                    }
                    else  if (y == 0.0) {
                        System.out.println("Eixo X");
                        
                    }else if ( x > 0.0 ) {                      
                        
                        if( y > 0.0){
                            System.out.println("Q1");
                        }else {
                            System.out.println("Q4");
                        }
                        
                   }
                    
                    else  if (x < 0.0) {
                       
                        if (y > 0.0){
                            System.out.println("Q2");
                        }
                        else {
                            System.out.println("Q3");
                        }
                    }

                    sc.close();
            }
    }

    

