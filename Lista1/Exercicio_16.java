package Atividades;

import java.util.Scanner;

public class Exercicio_16 {

	public static void main(String[] args) {
		
		char caracter;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digiter um caracter: ");
		caracter = input.next().charAt(0);
		
		if(Character.isDigit(caracter)) {
			System.out.println("E um digito numerico");
		} else if(caracter == 'a'|| caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
			System.out.println("E uma vogal");
		} else if (Character.isAlphabetic(caracter)) {
			System.out.println("E uma consoante");
		} else {
			System.out.println("E um caracter especial");
		}
		
		input.close();

	}

}
