package ap2_logica_de_programacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Questao_08 {

	public static void main(String[] args) {
		double maior = 0;
		List<Double> numeros = Arrays.asList(3.0, 6.0, 9.1, 2.3, 5.4, 8.6, 7.8, 4.4, 1.7);
		List<Double> divisoes = new ArrayList<Double>();
		for (Double numero : numeros) {
			if (numero > maior) {
				maior = numero;
			}
		}
		for (Double numero : numeros) {
			divisoes.add(numero / maior);
		}
		for (Double resultado : divisoes) {
			System.out.println(resultado);
		}
	}
}
