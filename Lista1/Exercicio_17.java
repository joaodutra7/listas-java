package Atividades;

import java.util.Scanner;

public class Exercicio_17 {

	public static void main(String[] args) {
		
		int ano;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o ano: ");
		ano = input.nextInt();
		
		if(ano % 4 == 0) {
			System.out.println("O ano e bissexto");
		} else {
			System.out.println("Nao e bissexto");
		}
		
		input.close();
	}

}
