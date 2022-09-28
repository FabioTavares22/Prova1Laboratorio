package prova1;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int vetorA = 6;
		int valores[] = new int[vetorA];
		int x = 0;
		int y = 0;
		int z = 0;
		int b = 0;
		int n = 0;
		for (int i = 0; i < vetorA; i++) {
			System.out.println("Por favor digite um número: ");
			valores[i] = scan.nextInt();
			
			if(valores[i] == 111) {
				x = x + 1;
			} else if (valores[i] == 222) {
				y = y + 1;
			} else if (valores[i] == 333) {
				z = z + 1;
			} else if(valores[i] == 0) {
				b = b + 1;
			} else if(valores[i] != 111 & valores[i] != 222 & valores[i] != 333 & valores[i] != 0) {
				n = n + 1;
			}
		
		}	
		System.out.println("O candidato X teve o total de: " + x + " votos");
		System.out.println("O candidato Y teve o total de: " + y + " votos");
		System.out.println("O candidato Z teve o total de: " + z + " votos");
		System.out.println("O total de votos brancos foi de: " + b);
		System.out.println("O total de votos nulos foi de: " + n);
	}
}
