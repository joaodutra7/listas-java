package Atividades;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		
		int n;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		n = input.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("O numero e par");
		} else {
			System.out.println("O numero e impar");
		}
		
		input.close();
	}

}
