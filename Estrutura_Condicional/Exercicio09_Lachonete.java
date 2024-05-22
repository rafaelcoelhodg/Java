package Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio9_Lachonete {

	public static void main(String[] args) {
		// Uma lanchonete possui vários produtos. Cada produto possui um código e um preço. 
		// Você deve fazer um programa para ler o código e a quantidade comprada de um produto (suponha um código válido), e daí
		// informar qual o valor a ser pago, com duas casas decimais, conforme tabela de produtos abaixo:
		// Código do Produto		Preço do Produto
		//		1						R$ 5.00
		//		2						R$ 3.50
		//		3						R$ 4.80
		//		4						R$ 8.90
		//		5						R$ 7.32
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double codigo, preco1 = 5.00, preco2 = 3.50, preco3 = 4.80, preco4 = 8.90, preco5 = 7.32, quantidade, valor;
		
		System.out.print("Código do Produto Comprado: ");
		codigo = sc.nextDouble();
		
		System.out.print("Quantidade Comprada: ");
		quantidade = sc.nextDouble();
		
		if (codigo == 1) {
			valor = preco1 * quantidade;
			
			System.out.printf("Valor a Pagar: R$ %.2f", valor);
			
		} else if (codigo == 1) {
			valor = preco1 * quantidade;
			
		} else if (codigo == 2) {
			valor = preco2 * quantidade;
			
		} else if (codigo == 3) {
			valor = preco3 * quantidade;
			
		} else if (codigo == 3) {
			valor = preco3 * quantidade;

		} else if (codigo == 4) {
			valor = preco4 * quantidade;
			
		} else {
			valor = preco5 * quantidade;
			
		}
		
		System.out.printf("Valor a Pagar: R$ %.2f", valor);
		
		sc.close();

	}

}
