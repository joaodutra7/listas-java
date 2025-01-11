package Atividades;

import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = 0;
		String nome;
		
		System.out.println("Digite seu nome: ");
		nome = input.nextLine();
		
		while (n < 2 || n > 5) {
			System.out.println("Digite um numero entre 2 e 5: ");
			n = input.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(nome);
		}
		
		input.close();

	}

}
