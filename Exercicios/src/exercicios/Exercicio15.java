/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author jenny
 */
public class Exercicio15 {
    public static void main(String[] args) {
        
        double a, b, c;
        a = 3.0;
        b = 4.0;
        c = 5.2;
        
        double areaTriangulo = (a * c) / 2;
        double areaCirculo = 3.14159 * Math.pow(c, 2);
        double areaTrapezio =  ((a + b) * c) /2;
        double areaQuadrado = Math.pow(b, 2);
        double areaRetangulo = a * b;
        
        System.out.println("Triângulo: " + areaTriangulo);
        System.out.println("Circulo: " + areaCirculo);
        System.out.println("Trapézio: " + areaTrapezio);
        System.out.println("Quadrado: " + areaQuadrado);
        System.out.println("Retângulo: " + areaRetangulo);
        
        
        
        
    }
    
}
