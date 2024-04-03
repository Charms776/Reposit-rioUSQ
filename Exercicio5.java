package aula08_pt2;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o número de um mês (1 a 12): ");
		int num = scan.nextInt();
		String estacaoAno = "";
		
		switch (num) {
			case 12: 
			case 1:
			case 2: 
			case 3: 
				estacaoAno = "Verão";
				break;
			case 4: 
			case 5: 
			case 6: 
				estacaoAno = "Outono";
				break;
			case 7: 
			case 8: 
			case 9: 
				estacaoAno = "Inverno";
				break;
			case 10: 
			case 11: 
				estacaoAno = "Primavera";
				break;
			default:
				System.out.println("Mês inválido");
				break;
		}
		System.out.println("Estação do ano correspondente: " + estacaoAno);
		scan.close();
	}

}
