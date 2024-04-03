package aula08_pt2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número para verificar: ");
		double num = scan.nextDouble();
		if (num % 2 == 0) {
			System.out.println("Número par!");
		}
		else {
			System.out.println("Número ímpar!");
		}
		scan.close();
	}

}
