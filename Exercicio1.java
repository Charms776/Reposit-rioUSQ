package aula08_pt2;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número para verificar: ");
		double num = scan.nextDouble();
		if (num > 0) {
			System.out.println("Número positivo!");
		}
		else if (num < 0) {
			System.out.println("Número negativo!");
		}
		else {
			System.out.println("Número zero!");
		}
		scan.close();
	}

}
