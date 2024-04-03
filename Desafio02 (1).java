package aula08_pt1;

import java.util.Scanner;

public class Desafio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite sua altura em metros: ");
		float altura = scan.nextFloat();
		System.out.println("Digite o seu sexo (m/f): ");
		String sexo = scan.next();
		double pesoIdeal;
		
		switch(sexo) {
		case "m":
			pesoIdeal = (72.7 * altura) - 58;
			System.out.println("Peso ideal: "+ Math.round(pesoIdeal));
			break;
		case "f":
			pesoIdeal = (62.1 * altura) - 44.7;
			System.out.println("Peso ideal: "+ Math.round(pesoIdeal));
			break;
		default:
			pesoIdeal = 0;
			System.out.println("Sexo não reconhecido");
			break;
		}
		scan.close();
	}
}
