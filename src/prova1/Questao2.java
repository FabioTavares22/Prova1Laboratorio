package prova1;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int vit = 3;
		int emp = 1;
		System.out.println("Informe a quantidade de gols do BRASIL para o jogo BRASIL X S�RVIA: ");
		int j1 = scan.nextInt();
		System.out.println("Informe a quantidade de gols da S�RVIA para o jogo BRASIL X S�RVIA: ");
		int j2 = scan.nextInt();
		int j8 = j1;
		if(j8 > j2) {
			j8 = vit;
		} else if (j8 == j2){
			j8 = emp;
		}
		
		System.out.println("Informe a quantidade de gols do BRASIL para o jogo BRASIL X SU��A: ");
		int j4 = scan.nextInt();
		System.out.println("Informe a quantidade de gols da SU��A para o jogo BRASIL X SU��A: ");
		int j5 = scan.nextInt();
		int j9 = j4;
		if(j9 > j5) {
			j9 = vit;
		} else if (j9 == j5){
			j9 = emp;
		}
		
		System.out.println("Informe a quantidade de gols do BRASIL para o jogo CAMAR�ES X BRASIL: ");
		int j6 = scan.nextInt();
		System.out.println("Informe a quantidade de gols de CAMAR�ES para o jogo CAMAR�ES X BRASIL: ");
		int j7 = scan.nextInt();
		int j10 = j6;
		if(j10 > j7) {
			j10 = vit;
		} else if (j10 == j5){
			j10 = emp;
		}
		
		int pont = j8 + j9 + j10;
		System.out.println("A pontu��o do Brasil �: " + pont);
		
		int sald = (j1 + j4 + j6) - j2 - j5 - j7;
		System.out.println("O saldo de gols do Brasil �: " + sald);
	}

}
