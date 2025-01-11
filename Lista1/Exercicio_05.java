package Atividades;

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {

		int n;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite um número inteiro: ");
		n = input.nextInt();

		if (n > 0) {
			System.out.println("O numero e positivo");
		} else if (n < 0) {
			System.out.println("O numero e negativo");
		} else {
			System.out.println("O numero e zero");
		}

		input.close();

	}

}
