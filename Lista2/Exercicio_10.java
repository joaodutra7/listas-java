package Atividades;

import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = 0;

		while (n < 2 || n > 5) {
			System.out.println("Digite um numero entre 2 e 5: ");
			n = input.nextInt();
		}

		for (int c = n - 1; c > 0; c--) {
			n *= c;
			c--;
		}

		System.out.println(n);

		input.close();

	}

}
