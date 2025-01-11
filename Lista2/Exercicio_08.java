package Atividades;

public class Exercicio_08 {

	public static void main(String[] args) {
		
		int v = 0;
		
		for(int i = 0; i < 101; i++){
			if(i % 2 == 0){
				v += i;
			}
		}
		
		System.out.println("Soma dos primeiro 50 pares: " + v);
	}

}
