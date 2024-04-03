package aula08_pt1;

import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a idade do paciente: ");
		int idade = scan.nextInt();
		System.out.println("Digite o batimento cardiaco do paciente: ");
		int bc = scan.nextInt();
		String classificacao = "";
		
		if (idade > 60 && bc > 150) {
			classificacao = "Urgente";
		}
		else if (idade > 60 && bc <= 150) {
			classificacao = "Urgência moderada";
		}
		else if (idade <= 60 && bc > 150) {
			classificacao = "Urgência moderada";
		}
		else if (idade <= 60 && bc <= 150) {
			classificacao = "Não urgente";
		}
		
		classificacao = (classificacao.equals("Urgente")) ? classificacao.toUpperCase() : classificacao;
		System.out.println("Classificação do paciente: " + classificacao);
		scan.close();
	}

}
