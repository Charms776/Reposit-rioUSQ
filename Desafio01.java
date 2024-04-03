package aula07;

import java.util.Scanner;

public class Desafio01 {
	
	public static void main(String [] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite seu nome: ");
			String nome = scan.next();
			System.out.println("Digite seu signo: ");
			String signo = scan.next();
			System.out.println("Digite sua idade: ");
			int idade = scan.nextInt();
			
			System.out.println(nome+ " tem " + idade + " anos e é do signo de: " + signo);
		}
	}
}
