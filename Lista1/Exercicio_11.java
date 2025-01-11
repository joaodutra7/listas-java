package Atividades;

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {

		String nome;
		Float altura, peso, imc;

		Scanner input = new Scanner(System.in);

		System.out.println("Informe seu nome: ");
		nome = input.nextLine();

		System.out.println("Informe sua idade: ");
		altura = input.nextFloat();

		System.out.println("Informe seu peso: ");
		peso = input.nextFloat();

		imc = peso / (altura * altura);

		System.out.println(nome + " seu IMC e : " + imc);

		input.close();
	}

}
