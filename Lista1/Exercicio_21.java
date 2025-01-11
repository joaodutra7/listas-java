package Atividades;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_21 {

	public static void main(String[] args) {

		int numero = 0, aleatorio;
		boolean verificador = true;

		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		aleatorio = rand.nextInt(101);

		while (verificador) {
			System.out.println("Digite um numero inteiro de 1 a 100:  ");
			numero = input.nextInt();
			if(numero != aleatorio) {
				System.out.println("Errado, digite outro numero");
				if(numero > aleatorio) {
					System.out.println("O resultado e menor");
				}else {
					System.out.println("O resultado é maior");
				}
			} else {
				verificador = false;
				System.out.print("Voce acertou!");
			}

		}
		
		input.close();
	}
}
