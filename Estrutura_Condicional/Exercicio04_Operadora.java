package Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4_Operadora {

	public static void main(String[] args) {
		// Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de
		// telefone. Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00. Fazer um programa para
		// ler a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int min;
		
		System.out.print("Digite a quantidade de minutos: ");
		min = sc.nextInt();
		
		double conta = 50.0;
		
		if (min > 100) {
			conta += (min - 100) * 2.0;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f", conta);
		
		sc.close();

	}

}
