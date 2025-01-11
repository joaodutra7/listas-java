package Atividades;

import java.util.Scanner;

public class Exercicio_14 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int qtd, ultimo = 0, penultimo = 0, calculado;
		String fibonacci = "";
		
		do {
			System.out.println("Digite um valor inteiro: ");
			qtd = input.nextInt();
		} while (qtd<5);
		
		for(int i =0; i < qtd; i++) {
			calculado = ultimo + penultimo;
			if(calculado ==0) {
				calculado = 1;
			}
			
			if(!fibonacci.isEmpty()) {
				fibonacci += ", ";
			}
			fibonacci += Integer.toString(calculado);
			
			penultimo = ultimo;
			ultimo = calculado;
		}
		
		System.out.println(fibonacci);
		input.close();

	}

}
