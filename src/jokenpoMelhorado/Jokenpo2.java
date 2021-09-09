package jokenpoMelhorado;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo2 {

	public static void main(String[] args) {

		Random sorteio = new Random();
		int numeroSorteio = sorteio.nextInt(3) + 1;

		Scanner leitor = new Scanner(System.in);

		int escolhaJogador;
		int numeroPartidas = 0;
		int contador = 1;
		int placarJogador = 0, placarComputador = 0;

		System.out.println("JOKENPO");
		System.out.println();
		

		System.out.print("Número de partidas desejadas:");
		numeroPartidas = leitor.nextInt();
		
		System.out.println();
		System.out.println("1-PEDRA");
		System.out.println("2-PAPEL");
		System.out.println("3-TESOURA");
		System.out.println();
		
		while (placarComputador < numeroPartidas && placarJogador < numeroPartidas) {
			
			System.out.println();
			System.out.println("FAÇA SUA ESCOLHA:");
			escolhaJogador = leitor.nextInt();

			if (escolhaJogador == 1 || escolhaJogador == 2 || escolhaJogador == 3) {
				
				//EXIBINDO ESCOLHA DO JOGADOR
				if (escolhaJogador == 1) {
					System.out.println("Você escolheu PEDRA!");

				} else if (escolhaJogador == 2) {
					System.out.println("Você escolheu PAPEL!");

				} else {
					System.out.println("Você escolheu TESOURA!");
				}

				//EXIBINDO ESCOLHA DO COMPUTADOR
				if (numeroSorteio == 1) {
					System.out.println("O computador escolheu PEDRA!");

				} else if (numeroSorteio == 2) {
					System.out.println("O computador escolheu PAPEL!");

				} else {
					System.out.println("O computador escolheu TESOURA!");
				}
				System.out.println();
				
				//DETERMINANDO O VENCEDOR
				if (escolhaJogador == 1 && numeroSorteio == 3 || escolhaJogador == 2 && numeroSorteio == 1
						|| escolhaJogador == 3 && numeroSorteio == 2) {

					System.out.println("VOCÊ ganhou!");
					placarJogador++;
					

				} else if (numeroSorteio == 1 && escolhaJogador == 3 || numeroSorteio == 2 && escolhaJogador == 1
						|| numeroSorteio == 3 && escolhaJogador == 2) {

					System.out.println("O COMPUTADOR ganhou!");
					placarComputador++;
					
				} else {
					System.out.println("EMPATAMOS!");
					
				}
			} else {
				System.out.println("Você não fez uma escolha válida");
			}
			
			System.out.printf("%d - %d", placarJogador, placarComputador);
			contador++;
		}

	}

}
