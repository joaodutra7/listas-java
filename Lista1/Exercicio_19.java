package Atividades;

import java.util.Scanner;

public class Exercicio_19 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
        double salario = 0;

        salario = input.nextDouble();

        if(salario <= 1500){
            System.out.println("Seu salario agora e: " + (salario+(salario*0.15)));
        } else {
            System.out.println("Seu salario agora e: " + (salario+(salario*0.10)));

        }
        
        input.close();


	}

}
