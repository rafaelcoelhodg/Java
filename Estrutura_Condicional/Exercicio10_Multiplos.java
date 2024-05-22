package Estrutura_Condicional;

import java.util.Scanner;

public class Exercicio10_Multiplos {

	public static void main(String[] args) {
		// Fazer um programa para ler dois números inteiros, e dizer se um número é múltiplo do outro. 
		// Os números podem ser digitados em qualquer ordem.
		
		Scanner sc = new Scanner (System.in);
		
		int num1, num2;
		
		System.out.println("Digite Dois Números Inteiros: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		if (num1 % num2 == 0 || num2 % num1 == 0) {
			
			System.out.println("São Múltiplos");
			
		} else {
			
			System.out.println("Não São Múltiplos");
		}
		
		sc.close();

	}

}
