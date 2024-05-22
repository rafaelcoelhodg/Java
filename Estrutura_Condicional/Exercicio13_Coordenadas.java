package Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio13_Coordenadas {

	public static void main(String[] args) {
		// Leia os valores das coordenadas X e Y de um ponto no plano cartesiano. 
		// A seguir, determine qual o quadrante ao qual pertence o ponto (Q1, Q2, Q3 ou Q4). 
		// Se o ponto estiver na origem, escreva a mensagem “Origem”. 
		// Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double X, Y;
		
		System.out.print("Informe o Valor de X: ");
		X = sc.nextDouble();
		
		System.out.print("Informe o Valor de Y: ");
		Y = sc.nextDouble();
		
		if (X > 0 && Y > 0) {
			System.out.println("Q1");
			
		} else if (X < 0 && Y > 0) {
			System.out.println("Q2");
			
		} else if (X < 0 && Y < 0 ) {
			System.out.println("Q3");
			
		} else if (X > 0 && Y < 0 ) {
			System.out.println("Q4");
			
		} else if (X == 0 && Y == 0){
			System.out.println("Origem");
			
		} else if (X == 0) {
			System.out.println("EIXO Y");
			
		} else if (Y == 0) {
			System.out.println("EIXO X");
			
		}
		
		sc.close();

	}

}
