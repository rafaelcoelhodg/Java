package Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6_Glicose {

	public static void main(String[] args) {
		// Fazer um programa para ler a quantidade de glicose no sangue de uma pessoa 
		// e depois mostrar na tela a classificação desta glicose de acordo com a tabela 
		// de referência ao lado. 		Classificação 			Glicose
		//									Normal			Até 100 mg/dl
		//									Elevado			Maior que 100 até 140 mg/dl
		//									Diabetes		Maior de 140 mg/dl
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double glicose;
		
		System.out.print("Digite a Medida da Glicose: ");
		glicose = sc.nextDouble();
		
		if (glicose < 100) {
			
			System.out.println("Classificação: Normal");
			
		} else if (glicose > 100 && glicose <= 140) {
			
			System.out.println("Classificação: Elevado");
			
		} else {
			
			System.out.println("Diabetes");
			
		}
		
		sc.close();

	}

}
