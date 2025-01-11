package Atividades;

import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        
	        int n = 0;
	        
	        while(n < 2 || n > 5){
	            System.out.println("Digite um numero entre 2 e 5: ");
	            n = input.nextInt();
	        }
	        
	        int c = n - 1;
	        
	        while(c>0){
	            n*=c;
	            c--;
	        }
	        
	        System.out.println(n);
	        
	        input.close();


	}

}
