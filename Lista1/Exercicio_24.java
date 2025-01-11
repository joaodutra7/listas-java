package Atividades;

import java.util.Scanner;

public class Exercicio_24 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = 0;
		
		System.out.println("Digite um numero inteiro: ");
		n = input.nextInt();
		
		System.out.println("Numero em hexadecimal: " + (Integer.toHexString(n)).toUpperCase());
		System.out.println("Numero em binario: " + Integer.toBinaryString(n));
		
		input.close();
	}

}
