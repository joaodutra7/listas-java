package Atividades;

import java.util.Scanner;

public class Exercicio_20 {

	public static void main(String[] args) {

		int vetor[] = new int[5];
		int maior = 0;
		int troca = 0;
		
		Scanner input = new Scanner(System.in);

		for (int n = 0; n < 5; n++) {
			System.out.print("Digite um número: ");
			vetor[n] = input.nextInt();
		}
		
		for (int i = 0; i < 5; i++) {
			maior = 0;
			
			if(vetor[i] > maior) {
				
				maior = vetor[i];

				for (int j = 0 ; j < 5; j++) {
					if(vetor[j] > maior){
							troca = vetor[i];
	                        vetor[i] = vetor[j];
	                        vetor[j] = troca;
					}
				}
			}
			
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println(vetor[i]);
		}

		input.close();

	}

}
