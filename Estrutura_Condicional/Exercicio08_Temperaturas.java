package Estrutura_Condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8_Temperaturas {

	public static void main(String[] args) {
		// Deseja-se converter uma medida de temperatura da escala Celsius para Fahrenheit ou vice-versa. 
		// Para isso, você deve construir um programa que leia a letra "C" ou "F" indicando em qual escala vai ser
		// informada uma temperatura. Em seguida o programa deve mostrar a temperatura na outra escala com
		// duas casas decimais. A seguir é dada a fórmula para converter de Fahrenheit para Celsius (você deve
		// deduzir a fórmula de Celsius para Fahrenheit): C = 5/9 (F - 32)
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		char temperatura;
		double celsius, fahrenheit;
		
		System.out.print("Em qual escala de temperatura você vai digitar (C/F)? ");
		temperatura = sc.next().charAt(0);
		
		if (temperatura == 'F' || temperatura == 'f') {
			
			System.out.print("Digite a temperatura em Fahrenheit: ");
			fahrenheit = sc.nextDouble();
			
			celsius = 5.0 / 9.0  * (fahrenheit - 32.0);
			
			System.out.printf("Temperatura equivalente em Celsisus: %.2f", celsius);
			
		} else {
			
			System.out.print("Digite a temperatura em Celsisus: ");
			celsius = sc.nextDouble();
			
			fahrenheit = celsius * 1.8 + 32.0;
			
			System.out.printf("Temperatura equivalente em Fahrenheit: %.2f", fahrenheit);
			
		}
		
		sc.close();
	}

}
