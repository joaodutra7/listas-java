package Atividades;

import java.util.Scanner;

public class Exercicio_09 {

	public static void main(String[] args) {
		
		int n1,n2,opcao;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite o 1 numero: ");
		n1 = input.nextInt();
		
		System.out.println("Digite o 2 numero: ");
		n2 = input.nextInt();
		
		System.out.println("Escolha uma operacaoo: +"
				+ "\n1 - Adicao"
				+ "\n2 - Subtracao"
				+ "\n3 - Multiplicacao"
				+ "\n4 - Divisao");
		
		opcao = input.nextInt();
		
		switch(opcao) {
		
		case 1:
			System.out.println("Soma dos numeros: " + (n1 + n2));
			break;
			
		case 2:
			System.out.println("Subtracao dos numeros: " + (n1 - n2));
			break;
			
		case 3:
			System.out.println("Multiplicacao dos numeros: " + (n1 * n2));
			break;
			
		case 4:
			System.out.println("Divisao dos numeros: " + (n1 / n2));
			break;
		}
		
		
		
		input.close();

	}

}
