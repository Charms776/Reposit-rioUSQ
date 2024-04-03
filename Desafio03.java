package aula08_pt1;

import java.util.Scanner;

public class Desafio03 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escolha a operação desejada (+ | - | * | /)");
		String op = scan.next();
		System.out.println("Digite o primeiro valor: ");
		double num1 = scan.nextDouble();
		System.out.println("Digite o segundo valor: ");
		double num2 = scan.nextDouble();
		double resultado;
		
		switch(op) {
		case "+":
			resultado = num1 + num2;
			System.out.println(num1 + " + " + num2 + " = " + resultado);
			break;
		case "-":
			resultado = num1 - num2;
			System.out.println(num1 + " - " + num2 + " = " + resultado);
			break;
		case "*":
			resultado = num1 * num2;
			System.out.println(num1 + " * " + num2 + " = " + resultado);
			break;
		case "/":
			resultado = num1 / num2;
			System.out.println(num1 + " / " + num2 + " = " + resultado);
			break;
		default:
			System.out.println("Operação inválida");
			break;
		}
		scan.close();
	}
}
