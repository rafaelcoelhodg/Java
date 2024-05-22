package Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2_Baskara {

	public static void main(String[] args) {
		// Fazer um programa para ler os três coeficientes de uma equação do segundo grau. Usando a fórmula
		// de Baskara, calcular e mostrar os valores das raízes x1 e x2 da equação com quatro casas decimais.
		// Se a equação não possuir raízes reais, mostrar uma mensagem "Esta equacao nao possui raizes reais".
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double a, b, c, delta, x1, x2;
		
		System.out.print("Informe o coeficiente de a: ");
		a = sc.nextDouble();
		
		System.out.print("Informe o coeficiente de b: ");
		b = sc.nextDouble();
		
		System.out.print("Informe o coeficiente de c: ");
		c = sc.nextDouble();
		
		delta = Math.pow(b, 2.0) - 4 * a * c;
		
		if (delta < 0) {
			System.out.println("Esta equação não possui raízes reais!");
		}
		else {
			x1 = (- b + Math.sqrt(delta)) / (2.0 *a);
			x2 = (- b - Math.sqrt(delta)) / (2.0 *a);
			
			System.out.printf("x1 = %.4f%n", x1);
			System.out.printf("x2 = %.4f%n", x2);
		}
		sc.close();

	}

}
