package Atividades;

import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {

		int n, soma = 0, c = 0, maior = 0, menor = 0;

		Scanner input = new Scanner(System.in);

		while (c < 5) {
			System.out.println("Digite um numero inteiro positivo: ");
			n = input.nextInt();
			if (c == 0) {
				maior = n;
				menor = n;
			}
			if (n > 0) {

				if (n > maior) {
					maior = n;
				}
				if (n < menor) {
					menor = n;
				}
				soma += n;
				c++;
			} else {
				System.out.println("Numero invalido, tente novamente");
			}
		}

		double media = soma / 20;

		System.out.println(maior);
		System.out.println(menor);
		System.out.println(media);
		input.close();
	}

}
