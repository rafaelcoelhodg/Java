package Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5_Troco_Verificado {

	public static void main(String[] args) {
		// Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia. 
		// O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto 
		// e o valor em dinheiro dado pelo cliente. Seu programa deve mostrar o valor do troco a ser devolvido ao cliente. 
		// Se o dinheiro dado pelo cliente não for suficiente, mostrar uma
		// mensagem informando o valor restante -> DINHEIRO INSUFICIENTE. FALTAM X REAIS.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double troco, precoProduto, quantProduto, valorRecebido, valorVenda, restoDinheiro;

		System.out.print("Preço Unitário do Produto: ");
		precoProduto = sc.nextDouble();

		System.out.print("Quantidade Comprada: ");
		quantProduto = sc.nextDouble();

		System.out.print("Dinheiro Recebido: ");
		valorRecebido = sc.nextDouble();

		valorVenda = precoProduto * quantProduto;
		
		troco = valorRecebido - valorVenda;
		
		restoDinheiro = valorVenda - valorRecebido;

		if (valorRecebido > valorVenda) {
			
			System.out.printf("Troco = %.2f reais", troco); 

		} else {
			
			System.out.printf("Dinheiro Insuficiente. Faltam %.2f reais", restoDinheiro);
		}

		sc.close();

	}

}
