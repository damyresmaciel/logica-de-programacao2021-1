package ap2_logica_de_programacao;

import java.util.Scanner;

public class Quetao_05 {

	public static void main(String[] args) {

		int[][] matriz = new int[4][4];

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 4; j++) {

				System.out.println("Entre com numero: ");
				Scanner scan = new Scanner(System.in);
				matriz[i][j] = scan.nextInt();
			}
		}
		for (int i = 3; i >= 0; i--) {
			for (int j = 3; j >= 0; j--) {
				System.out.println("Estes são os números digitados: ");
				System.out.println(matriz[i][j]);
			}
		}

	}

}
