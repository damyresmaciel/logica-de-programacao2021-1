package ap2_logica_de_programacao;

import java.util.Scanner;

public class Questao_04 {
	public static void main(String[] args) {

		final int NÚMEROS_A_LER = 3;
		Scanner sc = new Scanner(System.in);
		int num1 = Integer.MAX_VALUE;
		int num2 = Integer.MIN_VALUE;
		for (int i = 0; i < NÚMEROS_A_LER; i++) {
			System.out.print("Entre com o proximo inteiro: ");
			int num = sc.nextInt();
			if (num < num1) {
				num1 = num;
			}
			if (num > num2) {
				num2 = num;
			}
		}
		System.out.println("O menor numero eh: " + num1);
		System.out.println("O maior numero eh: " + num2);
		sc.close();

	}
}
