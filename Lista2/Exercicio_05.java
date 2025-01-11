package Atividades;

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int opcao = 0;

		while (opcao != 4) {

			System.out.println("1 - Sacar");
			System.out.println("2 -  Depositar");
			System.out.println("3 - Ver saldo");
			System.out.println("4 - Sair");

			System.out.println("Escolha uma opcao: ");
			opcao = input.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("voce escolheu a opcao sacar");
				break;
			case 2:
				System.out.println("voce escolheu a opcao depositar");
				break;
			case 3:
				System.out.println("voce escolheu a opcao ver saldo");
				break;
			case 4:
				System.out.println("voce escolheu a opcao ver sair");
				break;
			default:
				System.out.println("opcao invalida");
				break;

			}
		}

		input.close();

	}

}
