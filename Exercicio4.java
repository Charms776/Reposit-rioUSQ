package aula08_pt2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número para calcular o fatorial: ");
		int num = scan.nextInt();
		double fatorial = 1;
		int i = num;
		while (i >= 1) {
			fatorial *= i;
			i--;
		}
		System.out.println("Resultado = " + fatorial);
		scan.close();
	}
}
