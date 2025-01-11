package Atividades;

import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		
		int medida;
		double pi = 3.14, area;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite a medida do circulo (número inteiro) : ");
		medida = input.nextInt();
		
		area = pi * (medida*medida);
		
		System.out.println("Area do circulo: " + area);
		
		input.close();

	}

}
