package aula08_pt2;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Advinhe o número aleatório (0 a 100)");
		int numRandom = random.nextInt(100);
		int numUser = scan.nextInt();
		do {
			if (numUser > numRandom) {
				System.out.println("O número é menor!");
			}
			else if (numUser < numRandom) {
				System.out.println("O número é maior!");
			}
			System.out.println("Tente novamente");
			numUser = scan.nextInt();
		}
		while (!(numUser == numRandom));
		System.out.println("VOCÊ ACERTOU!!! O NÚMERO É: " + numRandom);
		scan.close();
	}

}
