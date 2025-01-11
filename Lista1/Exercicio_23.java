package Atividades;

import java.util.Scanner;

public class Exercicio_23 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int n;

		System.out.println("Digite um numero inteiro: ");
		n = input.nextInt();
		System.out.println(Integer.toBinaryString(n));

		input.close();

	}

}
