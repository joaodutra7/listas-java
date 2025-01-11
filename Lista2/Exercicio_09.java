package Atividades;

public class Exercicio_09 {

	public static void main(String[] args) {

		int v = 0;

		for (int i = 0; i < 100; i++) {
			if (i % 2 == 1) {
				v += i;
			}
		}

		System.out.println("Soma dos primeiro 50 impares: " + v);
	}

}
