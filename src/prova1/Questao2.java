package prova1;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int vit = 3;
		int emp = 1;
		System.out.println("Informe a quantidade de gols do BRASIL para o jogo BRASIL X SÉRVIA: ");
		int j1 = scan.nextInt();
		System.out.println("Informe a quantidade de gols da SÉRVIA para o jogo BRASIL X SÉRVIA: ");
		int j2 = scan.nextInt();
		int j8 = j1;
		if(j8 > j2) {
			j8 = vit;
		} else if (j8 == j2){
			j8 = emp;
		}
		
		System.out.println("Informe a quantidade de gols do BRASIL para o jogo BRASIL X SUÍÇA: ");
		int j4 = scan.nextInt();
		System.out.println("Informe a quantidade de gols da SUÍÇA para o jogo BRASIL X SUÍÇA: ");
		int j5 = scan.nextInt();
		int j9 = j4;
		if(j9 > j5) {
			j9 = vit;
		} else if (j9 == j5){
			j9 = emp;
		}
		
		System.out.println("Informe a quantidade de gols do BRASIL para o jogo CAMARÕES X BRASIL: ");
		int j6 = scan.nextInt();
		System.out.println("Informe a quantidade de gols de CAMARÕES para o jogo CAMARÕES X BRASIL: ");
		int j7 = scan.nextInt();
		int j10 = j6;
		if(j10 > j7) {
			j10 = vit;
		} else if (j10 == j5){
			j10 = emp;
		}
		
		int pont = j8 + j9 + j10;
		System.out.println("A pontução do Brasil é: " + pont);
		
		int sald = (j1 + j4 + j6) - j2 - j5 - j7;
		System.out.println("O saldo de gols do Brasil é: " + sald);
	}

}
