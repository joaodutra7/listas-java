package Atividades;

import java.util.Scanner;

public class Exercicio_06 {

	public static void main(String[] args) {
		
		int idade;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite sua idade: ");
		idade = input.nextInt();

		if (idade >= 18) {
			System.out.println("E maior de idade");
		} else {
			System.out.println("E menor de idade");
		}

		input.close();


	}

}
