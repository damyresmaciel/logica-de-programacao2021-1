package aps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			opcoes();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void opcoes() {
		Scanner scan = new Scanner(System.in);
		boolean continuar = true;

		System.out.print("Digite seu nome: ");
		String nome = scan.next();

		System.out.print("Digite sua matricula: ");
		String matricula = scan.next();

		while (continuar) {
			System.out.println(
					"O que vc deseja fazer? \nOpção 1 - Verificar o CPF \nOpção 2 - Dados do desenvolvedor \nDigite qualquer letra + enter para sair \n");
			System.out.print("Digite a opção escolhida: ");
			String opcao = scan.next();

			switch (opcao) {
			case "1":
				valida(scan);
				break;
			case "2":
				info(nome, matricula);
				break;
			default:
				System.out.println("Até mais!");
				continuar = false;
			}
		}
		scan.close();
	}

	public static void valida(Scanner scan) {
		System.out.print("Entre com o CPF sem o digito: ");
		String cpf = scan.next();
		if (cpf.length() > 9) {
			System.out.println("CPF inválido! A quantidade de dígitos é maior do que a esperada");
			valida(scan);
		}

		List<Integer> numerosCPF = toArrayInteger(cpf);

		List<Integer> calculoUm = digitoVerificadorUm(numerosCPF);
		Integer somaCalculoUm = soma(calculoUm);
		Integer digitoUm = digito(somaCalculoUm);

		List<Integer> calculoDois = digitoVerificadorDois(numerosCPF, digitoUm);
		Integer somaCalculoDois = soma(calculoDois);
		Integer digitoDois = digito(somaCalculoDois);

		System.out.println("\n\nCPF: " + cpf + "-" + digitoUm + digitoDois + "\n\n");
	}

	private static List<Integer> toArrayInteger(String cpf) {
		List<Integer> numerosCPF = new ArrayList<>();
		for (int i = 0; i < cpf.length(); i++) {
			int c = cpf.charAt(i);
			numerosCPF.add(Integer.parseInt(Character.toString(c)));
		}
		return numerosCPF;
	}

	public static List<Integer> digitoVerificadorUm(List<Integer> numerosCpf) {
		List<Integer> calculoUm = new ArrayList<>();
		List<Integer> dv1 = Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2);
		for (int i = 0; i < numerosCpf.size(); i++) {
			calculoUm.add(dv1.get(i) * numerosCpf.get(i));
		}
		return calculoUm;
	}

	public static Integer soma(List<Integer> list) {
		Integer soma = 0;
		for (Integer integer : list) {
			soma += integer;
		}
		return soma;
	}

	public static Integer digito(Integer somaCalculoUm) {
		if ((somaCalculoUm % 11) < 2) {
			return 0;
		}
		return 11 - (somaCalculoUm % 11);
	}

	public static List<Integer> digitoVerificadorDois(List<Integer> numerosCpf, Integer digitoUm) {
		List<Integer> calculoDois = new ArrayList<>();
		List<Integer> dv2 = Arrays.asList(11, 10, 9, 8, 7, 6, 5, 4, 3, 2);
		numerosCpf.add(digitoUm);
		for (int i = 0; i < numerosCpf.size(); i++) {
			calculoDois.add(dv2.get(i) * numerosCpf.get(i));
		}
		return calculoDois;
	}

	public static void info(String nome, String matricula) {
		System.out.println("\n\nDesenvolvedor: " + nome + ", matricula: " + matricula + "\n\n");
	}
}
