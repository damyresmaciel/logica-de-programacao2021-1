package ap2_logica_de_programacao;

public class Questao_06 {

	public static void main(String[] args) {

		int[][] matriz = new int[3][3];

		int x, y, contador=1;

		for (x = 0; x <= 2; x++) {
			for (y = 0; y <=2; y++) {
				matriz[x][y] = contador;
				contador++;
			}

		}
		for (x = 0; x <= 2; x++) {
			for (y = 0; y <= 2; y++) {
				if (x == y) {
					System.out.println(matriz[x][y] + " ");					
				}
			}
		}
	}
}
