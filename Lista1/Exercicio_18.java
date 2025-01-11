package Atividades;

import java.util.Scanner;

public class Exercicio_18 {

	public static void main(String[] args) {
		
		int n;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro: ");
		n = input.nextInt();
		
		Integer a = n;
		String b = a.toString();
		String c = "";
		
		for (int i=b.length(); i > 0; i--) {
			c += b.substring(i - 1, i);
		}
		
		if(b.equals(c)) {
			System.out.println("E um palindromo");
		} else {
			System.out.println("Nao e um palindromo");
		}
		input.close();

	}

}
