package ap2_logica_de_programacao;

public class Questao_01 {

	public static void main(String[] args) {

		int x = 0, y = 0, z = 0;

		for (x = 4; x <= 16; x+=4) {
			for (y = x; y <= 4;) {
				for (z = 3; z <= x;) {
					System.out.println(x + ", " + y + ", " +  z);
				}
			}
		}
	}
}
