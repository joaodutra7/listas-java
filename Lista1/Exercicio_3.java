package Atividades;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		double n1,n2,n3,media;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a 1 nota: ");
		n1 = input.nextDouble();
		
		System.out.println("Digite a 2 nota: ");
		n2 = input.nextDouble();
		
		System.out.println("Digite a 3 nota: ");
		n3 = input.nextDouble();
		
		media = (n1 + n2 + n3) / 3;
		
		System.out.println("Media: " + media);
		
		input.close();
	}

}
