package Atividades;

import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int valor, menorV = 0, c = 0;

		while (c < 10) {
			System.out.println("Digite um valor inteiro: ");
			valor = input.nextInt();
			c++;
			if (c == 1) {
				menorV = valor;
			} else if (valor < menorV) {
				menorV = valor;
			}
		}

		System.out.println("menor valor: " + menorV);
		input.close();

	}

}
