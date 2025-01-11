package Atividades;

import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {
		
		int n1,n2,n3;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite o 1 numero: ");
		n1 = input.nextInt();
		
		System.out.println("Digite o 2 numero: ");
		n2 = input.nextInt();
		
		System.out.println("Digite o 3 numero: ");
		n3 = input.nextInt();

		if (n1 > n2 && n1> n3) {
			System.out.println("O numero 1 é o maior");
		} else if (n2 > n1 && n2 > n3){
			System.out.println("O numero 2 é o maior");
		} else {
			System.out.println("O numero 3 é o maior");
		}

		input.close();
	}

}
