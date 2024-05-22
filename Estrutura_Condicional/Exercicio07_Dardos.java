package Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7_Dardos {

	public static void main(String[] args) {
		// No arremesso de dardo, o atleta tem três chances para lançar o dardo à maior distância que conseguir.
		// Você deve criar um programa para, dadas as medidas das três tentativas de lançamento, informar qual
		// foi a maior.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double distancia1, distancia2, distancia3;
		
		System.out.println("Digite as Três Distância: ");
		distancia1 = sc.nextDouble();
		distancia2 = sc.nextDouble();
		distancia3 = sc.nextDouble();
		
		if (distancia1 > distancia2 && distancia1 > distancia3) {
			
			System.out.printf("Maior Distância = %.2f%n", distancia1);
			
		} else if (distancia2 > distancia3) {
			
			System.out.printf("Maior Distância = %.2f%n", distancia2);
			
		} else {
			
			System.out.printf("Maior Distância = %.2f%n", distancia3);
			
		}
		
		sc.close();

	}

}
