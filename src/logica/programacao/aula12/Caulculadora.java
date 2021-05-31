package logica.programacao.aula12;

import java.util.Scanner;

public class Caulculadora {

	public static void main(String[] args) {
		boolean chave = true;
		while (chave) {
			double a, b;
			int menu;
			System.out.print("Digite o primeiro valor: ");
			Scanner coleta = new Scanner(System.in);
			a = coleta.nextDouble();

			System.out.print("Digite o primeiro valor: ");
			coleta = new Scanner(System.in);
			b = coleta.nextDouble();

			System.out.println("Escolha a operação: ");
			System.out.println("(1) Soma");
			System.out.println("(2) Subtração");
			System.out.println("(3) Multiplicação");
			System.out.println("(4) Divisão");
			System.out.println("(5) Raiz Quadrada");
			System.out.println("(6) Sair");

			coleta = new Scanner(System.in);
			menu = coleta.nextInt();

			switch (menu) {
			case 1:
				somar(a, b);
				break;
			case 2:
				subtracao(a, b);
				break;
			case 3:
				multiplicar(a, b);
				break;
			case 4:
				divisao(a, b);
				break;
			case 5: 
				raizQuadrada(a,b);
				break;
			default:
				chave = false;
				break;
			}
		}
	}
	

	public static void somar(double a, double b) {
		double c = a + b;
		System.out.println(" " + c);
	}

	public static void subtracao(double a, double b) {
		double c = a - b;
		System.out.println(" " + c);
	}

	public static void multiplicar(double a, double b) {
		double c = a * b;
		System.out.println(" " + c);
	}

	public static void divisao(double a, double b) {
		double c = a / b;
		System.out.println(" " + c);
	}
	public static void  raizQuadrada(double a, double b) {
		a= Math.sqrt(a);
		b= Math.sqrt(b);
		System.out.println(a);
		System.out.println(b);
		
		 //System.out.println(Math.sqrt(a));
		 //System.out.println(Math.sqrt(b));

	}
}
