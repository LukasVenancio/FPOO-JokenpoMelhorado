package jokenpoMelhorado;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo2 {

	public static void main(String[] args) {

		Random sorteio = new Random();

		Scanner leitor = new Scanner(System.in);

		int escolhaJogador;
		int numeroPartidas = 0;
		int placarJogador = 0, placarComputador = 0;
		int partidaAtual = 1;
		String jogarNovamente = "S";
		double valorDaVitoria = 0;

		while (jogarNovamente.equals("S") || jogarNovamente.equals("s") || jogarNovamente.equals("sim")
				|| jogarNovamente.equals("Sim")) {
			System.out.println(
					"*******************************************************************************************************");
			System.out.println("                                       JOKENPO");
			System.out.println(
					"*******************************************************************************************************");
			System.out.println();
			System.out.print("Em quantas partidas voc� deseja arriscar a sua vida, humano?");
			numeroPartidas = leitor.nextInt();

			while (numeroPartidas < 3 || numeroPartidas % 2 == 0) {
				System.out.println(
						"N�o te ensinaram a contar? O n�mero de partidas precisa ser �mpar e maior do que 3, para que haja um vencedor!");
				System.out.println();
				System.out.println("Escolha direito dessa vez!");
				System.out.print("Em quantas partidas voc� deseja arriscar a sua vida, humano?");
				numeroPartidas = leitor.nextInt();
				System.out.println();
			}
			valorDaVitoria = numeroPartidas / 2 + 1;
			System.out.println();
			System.out.println("O valor que precisamos para ganhar �: " + valorDaVitoria);
			System.out.println();
			System.out.println("****************************");
			System.out.println("1-PEDRA");
			System.out.println("2-PAPEL");
			System.out.println("3-TESOURA");

			while (placarComputador < numeroPartidas / 2 + 1 && placarJogador < numeroPartidas / 2 + 1) {

				int numeroSorteio = sorteio.nextInt(3) + 1;

				System.out.println("****************************");
				System.out.println();
				System.out.println("Partdida: " + partidaAtual);
				System.out.println("Escolha logo, peda�o de carne!");
				escolhaJogador = leitor.nextInt();

				if (escolhaJogador == 1 || escolhaJogador == 2 || escolhaJogador == 3) {

					// EXIBINDO ESCOLHA DO JOGADOR
					if (escolhaJogador == 1) {
						System.out.println("Voc� escolheu PEDRA? S� se for a do meu sapato...");

					} else if (escolhaJogador == 2) {
						System.out.println("Voc� escolheu PAPEL, desmatando hein?");

					} else {
						System.out.println("Voc� escolheu TESOURA, s� se for uma tesoura cega.");
					}

					// EXIBINDO ESCOLHA DO COMPUTADOR
					if (numeroSorteio == 1) {
						System.out.println("As m�quinas escolheram PEDRA, vamos esmagar voc�s!");

					} else if (numeroSorteio == 2) {
						System.out.println("As m�quinas escolheram PAPEL, vamos esfregar esse papel na sua cara!");

					} else {
						System.out.println("As m�quinas escolheram TESOURA, vamos picotar voc�!");
					}
					System.out.println();

					// DETERMINANDO O VENCEDOR
					if (escolhaJogador == 1 && numeroSorteio == 3 || escolhaJogador == 2 && numeroSorteio == 1
							|| escolhaJogador == 3 && numeroSorteio == 2) {

						System.out.println("VOC� ganhou, mas ser� apenas desta vez!");
						placarJogador++;

					} else if (numeroSorteio == 1 && escolhaJogador == 3 || numeroSorteio == 2 && escolhaJogador == 1
							|| numeroSorteio == 3 && escolhaJogador == 2) {

						System.out.println("As M�QUINAS venceram, como sempre, hahaha!");
						placarComputador++;

					} else {
						System.out.println("EMPATAMOS, grr!");
					}
				} else {
					System.out.println("Escolha direito! Esse jogo vale o seu destino!");
				}

				System.out.printf("%d - %d", placarJogador, placarComputador);
				System.out.println();
				System.out.println();
				partidaAtual++;
			}

			System.out.println("---------------------------");
			System.out.println("Hahaha! Quer arrriscar novamente?? (S/N)");
			jogarNovamente = leitor.next();
			System.out.println("---------------------------");
			System.out.println();

			placarJogador = 0;
			placarComputador = 0;
			numeroPartidas = 0;
			partidaAtual = 1;
			escolhaJogador = 0;

			if (jogarNovamente.equals("S") || jogarNovamente.equals("s") || jogarNovamente.equals("Sim")
					|| jogarNovamente.equals("sim")) {
				System.out.println();
			} else if (jogarNovamente.equals("N") || jogarNovamente.equals("n")) {
				
			} else {
				System.out.println("Me responda direito! (S/N)");
				jogarNovamente = leitor.next();
				System.out.println();
			}
		}
		if (jogarNovamente.equals("N") || jogarNovamente.equals("n")) {
			System.out.println("Adimitimos que foi divertido.");
		}

	}
}