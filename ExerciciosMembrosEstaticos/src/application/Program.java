package application;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

public class Program {
	
/*	RESOLUÇÃO 1: RESONVENDO COM MÉTODO NA PRÓPRIA CLASSE DO PROGRAMA
 
   public static final double PI = 3.14159;
	
	//o final utilizado trasforma o PI em uma constante. 
	// O padrao de nome para constantes é maiusculo

	public static void main(String[] args) {
 //Fazer um programa para ler um valor numérico qualquer, e daí mostrar 
quanto seria o valor de uma circunferência e do volume de uma esfera 
para um raio daquele valor. Informar também o valor de PI com duas 
casas decimais. // 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		
		double radius = sc.nextDouble();
		
		double c = circumference(radius);
		
		
		double v = volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);
			
		
		sc.close();		

	}
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
		
	}
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3 ;
	}
	  * O main é uma método estático, então todos os outros da mesma classe devem ser também. 
	  * Só se pode chamar um método estático dentro do método main que é estátio. 
	  
*/
	
	/* RESOLUCAÇÃO 2: RESOLVENDO COM CLASSE CALCULATOR COM MEMBROS DE INSTÂNCIA
	 
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		* Aqui foi instânciado a classe calculator, onde se criou o objeto calc. 
		
		System.out.println("Enter radius: ");
		
		double radius = sc.nextDouble();
		
		double c = calc.circumference(radius);
		double v = calc.volume(radius);
		// nesses dois casos eu chamei as funções pelo objeto calc que foi instanciado.
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);
			
		
		sc.close();	
		
		* Na classe calculator retirou-se o static de cada função.
		
		
	} */
	
	// RESOLUÇÃO 3: CLASSE CALCULATOR COM MÉTODO ESTÁTICO 
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter radius: ");
		
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		// Já se usa o 
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
			
		
		sc.close();	
	}
	
}
