package Atividades;

public class Exercicio_02 {

	public static void main(String[] args) {
        int n = 0, c = 0;
        
        while(c<=100){
            c++;
            if(c % 2 == 0){
               n+=c; 
            }
        }
        
        System.out.println(n);

	}

}
