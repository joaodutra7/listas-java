package Atividades;

import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {
		
		Float nota;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a nota do aluno: ");
		nota = input.nextFloat();
		
		if(nota >= 7) {
			System.out.println("Esta aprovado");
		} else {
			System.out.println("Esta reprovado");
		}
		
		input.close();

	}

}
