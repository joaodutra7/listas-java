package Atividades;

import java.util.Scanner;

public class Exercicio_22 {

	public static void main(String[] args) {
		
		int n;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro: ");
		n = input.nextInt();
		
		Integer a = n;
		String b = a.toString();
		Integer c = 0;
		
		for (int i=b.length(); i > 0; i--) {
			c += Integer.parseInt(b.substring(i - 1, i));
		}
		
		System.out.println("Soma dos digitos: "+ c);
		
		input.close();

	}

}
