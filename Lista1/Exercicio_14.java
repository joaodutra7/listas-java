package Atividades;

import java.util.Scanner;

public class Exercicio_14 {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner input = new Scanner(System.in);
			
		System.out.println("Digite sua idade: ");
		idade = input.nextInt();

		if (idade >= 16) {
			System.out.println("Voce pode votar");
		} else {
			System.out.println("Voce ainda nao pode votar");
		}
		
		input.close();
	}

}
