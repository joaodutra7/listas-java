package Atividades;

import java.util.Scanner;

public class Exercicio_08 {

	public static void main(String[] args) {
		int idade;
		String nome;

		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		nome = input.nextLine();
		
		System.out.println("Digite sua idade: ");
		idade = input.nextInt();

		if (idade >= 65) {
			System.out.println(nome + ", voce pode se aposentar.");
		} else {
			System.out.println(nome + ", voce ainda nao pode se aposentar.");
		}

		input.close();

	}

}
