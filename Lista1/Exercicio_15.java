package Atividades;

import java.util.Scanner;

public class Exercicio_15 {

	public static void main(String[] args) {
		
		int n,dividido = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro: ");
		n = input.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				dividido++;
			}
		}
		
		if(dividido > 2) {
			System.out.println("Não é primo");
		} else {
			System.out.println("É primo");
		}
		
		input.close();
		
	}

}
