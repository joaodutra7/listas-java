package Atividades;

import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n;
		
		System.out.println("Informe um numero inteiro: ");
		n = input.nextInt();
		
		if(n % 3 == 0 && n % 5 == 0) {
			System.out.println("O valor e multiplo de 3 e 5");
		} else {
			System.out.println("O valor nao e multiplo de 3 e 5");
		}
		input.close();
	}

}
