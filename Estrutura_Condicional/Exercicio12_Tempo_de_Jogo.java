package Estrutura_Condicional;

import java.util.Scanner;

public class Exercicio12_Tempo_de_Jogo {

	public static void main(String[] args) {
		//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
		//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		
		int horaInicial, horaFinal, duracao;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Hora Inicial: ");
		horaInicial = sc.nextInt();
		
		System.out.print("Hora Final: ");
		horaFinal = sc.nextInt();
		
		if (horaInicial < horaFinal) {
			
			duracao = horaFinal - horaInicial;
			
		} else {
			
			duracao = 24 - horaInicial + horaFinal;
			
		}
		
		System.out.println("O Jogo Durou " + duracao + " Hora(s)");
		
		sc.close();

	}

}
