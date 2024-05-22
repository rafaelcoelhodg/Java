package Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11_Aumento {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Uma empresa vai conceder um aumento percentual de salário aos seus funcionários dependendo de quanto
		// cada pessoa ganha, conforme tabela abaio. 
		// Fazer um programa para ler o salário de uma pessoa, daí mostrar qual o novo salário desta pessoa depois do aumento,
		// quanto foi o aumento e qual foi a porcentagem de aumento.
		// 		Salário Atual			Aumento
		//		Até R$ 1000.00			20%
		//		Acima de R$ 1000.00		15%
		// 		Até R$ 3000.00
		// 		Acima de R$ 3000.00		10%
		// 		Até R$ 8000.00
		//		Acima de R$ 8000.00		5%
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double salAtual, salNovo, aumento;
		int porcentagem;
		
		System.out.print("Digite o Salário da Pessoa: ");
		salAtual = sc.nextDouble();
		
		if (salAtual <= 1000.00) {
			
			salNovo = salAtual * 20.00 / 100.00 + salAtual;
			aumento = salAtual * 20.00 / 100.00;
			porcentagem = 20;
			
			System.out.printf("Novo Salário = R$ %.2f%n", salNovo);
			System.out.printf("Aumento = R$ %.2f%n", aumento);
			System.out.println("Porcentagem = " + porcentagem + " %");
			
		} else if (salAtual > 1000.00 && salAtual <= 3000.00) {
			
			salNovo = salAtual * 15.00 / 100.00 + salAtual;
			aumento = salAtual * 15.00 / 100.00;
			porcentagem = 15;
			
			System.out.printf("Novo Salário = R$ %.2f%n", salNovo);
			System.out.printf("Aumento = R$ %.2f%n", aumento);
			System.out.println("Porcentagem = " + porcentagem + " %");
			
		} else if (salAtual > 3000.00 && salAtual <= 8000.00) {
			
			salNovo = salAtual * 10.00 / 100.00 + salAtual;
			aumento = salAtual * 10.00 / 100.00;
			porcentagem = 10;
			
			System.out.printf("Novo Salário = R$ %.2f%n", salNovo);
			System.out.printf("Aumento = R$ %.2f%n", aumento);
			System.out.println("Porcentagem = " + porcentagem + " %");
			
		} else {
			
			salNovo = salAtual * 5.00 / 100.00 + salAtual;
			aumento = salAtual * 5.00 / 100.00;
			porcentagem = 5;
			
			System.out.printf("Novo Salário = R$ %.2f%n", salNovo);
			System.out.printf("Aumento = R$ %.2f%n", aumento);
			System.out.println("Porcentagem = " + porcentagem + " %");
			
		}
		
		sc.close();
		
	}

}
